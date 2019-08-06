package com.finance.www.controller;

import com.finance.www.pojo.BankLimitmoney;
import com.finance.www.pojo.MemberAccount;
import com.finance.www.pojo.MemberCard;
import com.finance.www.pojo.MemberRegister;
import com.finance.www.service.GetUserIdService;
import com.finance.www.service.LoanService;
import com.finance.www.utils.CookiesUtil;
import com.finance.www.utils.GetUserBean;
import com.finance.www.vox.RegisterVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.security.Principal;
import java.util.List;

/**
 * Created by Administrator on 2019/8/1.
 */
@Controller
public class MyAccountController {
    @Autowired
    private LoanService loanService;
    @Autowired
    private GetUserIdService getUserIdService;
    //我的账户页面
    @GetMapping("/wodezhanghu")
    public String wodezhanghu(){
        return "wodezhanghu";
    }
    @PostMapping("/isRegister")
    @ResponseBody
    public int isRegister(HttpServletRequest request, HttpServletResponse response) throws IOException {
        /**通过上下文得到token，写入cookie*/
//        String tokenValue = GetDetailToken.getDetailToken();
//        Cookie cookie = new Cookie("token",tokenValue);
//        cookie.setPath("/");
//        response.addCookie(cookie);
//        /**获取用户id*/
//        Integer memberId = GetUserBean.getUserBean(tokenValue);
        Integer memberId = 28;

        //Integer id=3;
        int ishaveid = loanService.ishaveid(memberId);
        System.out.println("ishaveid = " + ishaveid);
        return ishaveid;
    }
    @PostMapping("/shiming")
    public String shiming(RegisterVo registerVo, Model model,HttpServletRequest request,
                          HttpServletResponse response) throws IOException {

//        /**通过上下文得到token，写入cookie*/
//        String tokenValue = GetDetailToken.getDetailToken();
//        Cookie cookie = new Cookie("token",tokenValue);
//        cookie.setPath("/");
//        response.addCookie(cookie);
//        /**获取用户id*/
//        Integer id = GetUserBean.getUserBean(tokenValue);
        Integer id = 27;
        RegisterVo registerVo1 = new RegisterVo();
        registerVo1.setId(id);
        String realname=registerVo.getRealName();
        String idcard=registerVo.getIdNumber();
        registerVo1.setRealName(realname);
        registerVo1.setIdNumber(idcard);
        int shiming = loanService.shiming(registerVo1);
        MemberRegister member = loanService.getMember(id);
        String realName = member.getRealName();
        model.addAttribute("name",realName);
        return "wodezhanghu";
    }
}
