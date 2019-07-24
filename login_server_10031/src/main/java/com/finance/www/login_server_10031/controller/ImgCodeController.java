package com.finance.www.login_server_10031.controller;


import com.finance.www.login_server_10031.utils.ImgCode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author ：邓一凡
 * @date ：Created in 2019/7/1 16:32
 * @description ： 验证码控制器
 */
@Controller
public class ImgCodeController {
    /**
     * 验证码图片请求路径
     *
     * @param request  request
     * @param response response
     */
    @RequestMapping("/getCode")
    public void getCode(HttpServletRequest request, HttpServletResponse response) {
        ImgCode imgCode = new ImgCode();
        imgCode.getRandcode(request, response);
    }
}
