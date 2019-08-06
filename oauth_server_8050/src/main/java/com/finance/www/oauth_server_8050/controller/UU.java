package com.finance.www.oauth_server_8050.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ：邓一凡
 * @date ：Created in 2019/8/2 14:43
 * @description ：
 */
@Controller
@RequestMapping("sso")
public class UU {
    @GetMapping("/dae")
    public String regist() {
        return "redirect:http://10.12.159.66:10023/dae";
    }

    @GetMapping("/shouye")
    public String regit() {
        return "redirect:http://10.12.159.120:10022/index";
    }

    @GetMapping("/xiaoe")
    public String r2egit() {
        return "redirect:http://10.12.159.30:10021/xiaoe";
    }
}
