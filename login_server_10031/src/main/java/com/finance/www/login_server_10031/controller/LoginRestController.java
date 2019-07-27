package com.finance.www.login_server_10031.controller;




import com.finance.www.enums.StatusCodeEnum;
import com.finance.www.login_server_10031.service.MemeberService;
import com.finance.www.login_server_10031.service.ZuulTokenService;
import com.finance.www.login_server_10031.utils.AliyunSmsUtils;
import com.finance.www.login_server_10031.utils.ImgCode;
import com.finance.www.pojo.Memeber;
import com.finance.www.pojo.MemeberExample;
import com.finance.www.token.Token;
import com.finance.www.utils.AuthUtils;

import com.finance.www.utils.RestResponseUtil;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author ：邓一凡
 * @date ：Created in 2019/6/29 11:24
 * @description ： 登陆页面
 */
@RestController
//@RequestMapping("sso")
public class LoginRestController {

    private static final String SESSION_SMS_VERIFICATION_CODE = "SMSVerificationCode";

    private static final String GRANT_TYPE = "password";

    private static final String CLIENT_ID = "dyf";

    private static final String SCOPE = "read";

    private static final String CLIENT_SECRET = "secret";

    private static final String AUTHORIZATION = "Authorization";



    @Autowired
    private MemeberService memeberService;



    @Autowired
    ZuulTokenService tokenService;


    /**
     * 跳转登录页面
     *
     * @param url url 默认跳转到百度页面
     * @return index
     */
    @GetMapping("/login")
    public ModelAndView loginPge(@RequestParam(value = "url", defaultValue = "http://www.baidu.com") String url) {
        ModelAndView modelAndView = new ModelAndView("login");
        modelAndView.addObject("url", url);
        return modelAndView;
    }

    /**
     * 退出登录
     *
     * @return RestResponseUtil
     */
    @GetMapping("/newLogin/logout.go")
    public Token logOut() {
        Token baiqi = tokenService.getToken("baiqi", "123456", "password",
                "myapp", "all", "lxapp");

        System.err.println("baiqi = " + baiqi);
        return baiqi;
    }


    /**
     * 页面 登录页面form提交到这里
     *
     * @param session    session
     * @param response   response
     * @param username   用户名
     * @param password   密码
     * @param verifyCode 验证码
     * @param url        跳转到URL
     * @return RestResponseUtil
     */
    @PostMapping("/login.action")
    private RestResponseUtil login(HttpSession session, HttpServletResponse response, String username, String password, String verifyCode, String url) {
        try {
            String codeKey = (String) session.getAttribute(ImgCode.RANDOMCODEKEY);
            // 验证码判断
            if (codeKey.equalsIgnoreCase(verifyCode)) {


                Token token = tokenService.getToken(username, password, GRANT_TYPE, CLIENT_ID, SCOPE, CLIENT_SECRET);
                if (new Token().equals(token)) {
                    return new RestResponseUtil("请求超时", StatusCodeEnum.TIMEOUT);
                } else if (token != null) {


                    Cookie cookie = new Cookie(AUTHORIZATION, token.getToken_type() + token.getAccess_token());
                    // 时效3分钟
                    cookie.setMaxAge(60 * 3);
                    // 设置域
                    // cookie.setDomain("huanzi.cn");
                    // 设置访问路径
                    cookie.setPath("/");
                    response.addCookie(cookie);
                    ArrayList<Object> tokens = new ArrayList<>();
                    tokens.add(token);
                    return new RestResponseUtil(url, StatusCodeEnum.SUCCESS, tokens);
                } else {
                    session.removeAttribute(ImgCode.RANDOMCODEKEY);
                    return new RestResponseUtil("请求超时", StatusCodeEnum.TIMEOUT);
                }


            } else {
                return new RestResponseUtil("验证码错误", StatusCodeEnum.ERROR);
            }
        } catch (NullPointerException e) {
            return new RestResponseUtil("验证码过期", StatusCodeEnum.ERROR);
        } catch (Exception e) {
            e.printStackTrace();
            return new RestResponseUtil("服务器发生错误", StatusCodeEnum.ERROR);
        }

    }

    /**
     * 注册页面
     *
     * @return RestResponseUtil
     */
    @GetMapping("/register/toRegister.action")
    public ModelAndView toRegister() {

        return new ModelAndView("zhuce");

    }

    /**
     * 标题栏用户信息
     *
     * @param request 请求
     * @return RestResponseUtil
     */
    @PostMapping("/newLogin/headerLogin.action")
    public RestResponseUtil headerLogin(HttpServletRequest request) {
        try {
            Memeber memeber = AuthUtils.getReqUser(request);
            if (memeber != null) {
                return new RestResponseUtil(memeber.getMobile(), StatusCodeEnum.SUCCESS);
            } else {
                return new RestResponseUtil("", StatusCodeEnum.ERROR);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new RestResponseUtil("", StatusCodeEnum.ERROR);
        }

    }

    /**
     * 验证手机号邮箱是否用过
     * 成功0
     *
     * @param username 用户名 7
     * @param phone    手机号 4
     * @param email    邮箱 6
     * @return 4|6|0|7
     */
    @PostMapping("/register/checkInfo.action")
    public String checkInfo(String phone, String email, String username) {
        try {

            MemeberExample memeberExample = new MemeberExample();
            memeberExample.createCriteria().andMobileEqualTo(phone);

            MemeberExample memeberExample2 = new MemeberExample();
            memeberExample2.createCriteria().andEmailEqualTo(email);

            MemeberExample memeberExample3 = new MemeberExample();
            memeberExample3.createCriteria().andUsernameEqualTo(username);
            List<Memeber> memebers = memeberService.selectByExample(memeberExample);
            List<Memeber> memebers2 = memeberService.selectByExample(memeberExample2);
            List<Memeber> memebers3 = memeberService.selectByExample(memeberExample3);


            String uu = "0";
            if (memebers3.size() != 0) {
                uu = "7";
            }
            if (memebers.size() != 0) {
                uu = "4";
            }
            if (memebers2.size() != 0) {
                uu = "6";
            }

            return uu;
        } catch (Exception e) {
            e.printStackTrace();
            return "-1";
        }
    }

    /**
     * 注册
     *
     * @param session         session
     * @param username        用户名
     * @param paypassword     用户确认密码
     * @param password        用户密码
     * @param phone           手机号
     * @param email           邮箱
     * @param phoneVerifyCode 短信验证码
     * @return RestResponseUtil
     */
    @PostMapping("/register/register.action")
    public RestResponseUtil registered(String username, HttpSession session, String paypassword, String password, String phone, String email, @RequestParam(value = "phoneVerifyCode", defaultValue = "0") int phoneVerifyCode) {
        System.err.println("username = " + username);

        if (StringUtils.isBlank(username)) {
            return new RestResponseUtil("用户名不能为空", StatusCodeEnum.ERROR);
        }
        if (StringUtils.isBlank(phone)) {
            return new RestResponseUtil("手机号不能为空", StatusCodeEnum.ERROR);
        }
        if (StringUtils.isBlank(password)) {
            return new RestResponseUtil("密码不能为空", StatusCodeEnum.ERROR);
        }
        if (!password.equals(paypassword)) {
            return new RestResponseUtil("两次输入密 码不一致", StatusCodeEnum.ERROR);
        }
        if (StringUtils.isBlank(email)) {
            return new RestResponseUtil("邮箱不能为空", StatusCodeEnum.ERROR);
        }
        if (phoneVerifyCode == 0) {
            return new RestResponseUtil("短信验证码不能为空", StatusCodeEnum.ERROR);
        }
        //        此处验证短信验证码
        int attribute = (Integer) session.getAttribute(SESSION_SMS_VERIFICATION_CODE);
        if (!(attribute == phoneVerifyCode)) {
            System.err.println("attribute = " + attribute);
            System.err.println("phoneVerifyCode = " + phoneVerifyCode);
            return new RestResponseUtil("短信验证码错误", StatusCodeEnum.ERROR);
        }
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String psw = passwordEncoder.encode(password);
        Memeber memeber = new Memeber();
        memeber.setPassword(psw);
        memeber.setMobile(phone);
        memeber.setEmail(email);
        memeber.setUsername(username);
        int i = memeberService.insertSelective(memeber);

        return new RestResponseUtil("成功 = " + i, StatusCodeEnum.SUCCESS);
    }

    /**
     * 手机验证码
     * code
     *
     * @param phone 手机号
     */
    @PostMapping("/register/registerSendBindPhoneCode.action")
    public void registerSendBindPhoneCode(String phone, HttpSession session) {
        System.err.println("phone = " + phone);
        Integer s = AliyunSmsUtils.SendSMSVerificationCode(phone);
        System.err.println("s = " + s);
        session.setAttribute(SESSION_SMS_VERIFICATION_CODE, s);
    }

/*    //找回密码接口
        $.ajax({
        type: "post",
                url: "/newLogin/findPwd.action",
                data: {
            verificationCode: verifyCode,
                    findphone: phone,
                    findpwd: password,*/

}
