package com.finance.www.login_server_10031.controller;


import com.finance.www.login_server_10031.utils.ImgCode;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * @author ：邓一凡
 * @date ：Created in 2019/6/29 11:24
 * @description ： 登陆页面
 */
@RestController
public class LoginController {


    @Autowired
    private StringRedisTemplate template;

    /**
     * 判断key是否存在
     */
    @RequestMapping("/redis/hasKey/{key}")
    public Boolean hasKey(@PathVariable("key") String key) {
        try {
            return template.hasKey(key);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 校验用户名密码，成功则返回通行令牌（这里写死huanzi/123456）
     *
     * @param username  用户名
     * @param password  密码
     * @return          令牌KEY
     */
    @RequestMapping("/sso/checkUsernameAndPassword")
    private String checkUsernameAndPassword(String username, String password) {
        //通行令牌
        String flag = username + System.currentTimeMillis();
        if ("huanzi".equals(username) && "123456".equals(password)) {
            //用户名+时间戳（这里只是demo，正常项目的令牌应该要更为复杂）

            //令牌作为key，存用户id作为value（或者直接存储可暴露的部分用户信息也行）设置过期时间（我这里设置3分钟）
            template.opsForValue().set(flag, "1", (long) (3 * 60), TimeUnit.SECONDS);
            return flag;
        }
        return "error";
    }




    /**
     * 跳转登录页面
     *
     * @param url url
     * @return index
     */
    @RequestMapping("/sso/loginPage")
    private ModelAndView loginPage(String url) {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("url", url);
        return modelAndView;
    }


    /**
     * 页面 登录页面form提交到这里
     *
     * @param session  session
     * @param response response
     * @param username 用户名
     * @param password 密码
     * @param captcha  验证码
     * @param url      跳转到URL
     */
    @PostMapping("/sso/login")
    private String login(HttpSession session, HttpServletResponse response, String username, String password, String captcha, String url) {

        String codeKey = (String) session.getAttribute(ImgCode.RANDOMCODEKEY);
        // 验证码判断
        if (codeKey.equalsIgnoreCase(captcha)) {

            String check = checkUsernameAndPassword(username, password);
            if (!StringUtils.isEmpty(check)) {
                try {
                    Cookie cookie = new Cookie("accessToken", check);
                    // 时效3分钟
                    cookie.setMaxAge(60 * 3);

                    //设置域
//                       cookie.setDomain("huanzi.cn");
                    // 设置访问路径
                    cookie.setPath("/");
                    response.addCookie(cookie);
                    //重定向到原先访问的页面
                    response.sendRedirect(url);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return null;
            }
        }
        return "登录失败";
    }
}
