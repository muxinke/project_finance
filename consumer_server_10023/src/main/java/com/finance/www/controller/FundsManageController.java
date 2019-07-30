package com.finance.www.controller;

import com.finance.www.pojo.MemberAccount;
import com.finance.www.pojo.MemberCard;
import com.finance.www.pojo.MemberRegister;
import com.finance.www.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2019/7/30.
 */
@Controller
public class FundsManageController {
    @Autowired
    private LoanService loanService;
    //资金管理
    @GetMapping("/zijinguanli")
    public String zijinguanli(Model model){
        Integer id=2;
        MemberRegister zhuanzhangchongzhi = loanService.zhuanzhangchongzhi(id);
        String name = zhuanzhangchongzhi.getRealName();
        model.addAttribute("name",name);
        MemberAccount kuaijiechongzhi = loanService.kuaijiechongzhi(id);
        long accountBalance = kuaijiechongzhi.getAccountBalance();
        model.addAttribute("accountBalance",accountBalance);
        List<MemberCard> membercard = loanService.getMembercard(id);

        /**提交银行卡表*/
        List<String> lists = new ArrayList<>();
        /**遍历用户银行号，将银行名称和卡号后四位拼在一起*/
        for(MemberCard memberCard: membercard ){
            String line=memberCard.getBankcard().substring(memberCard.getBankcard().length()-4);
            lists.add(memberCard.getBankname()+line);
        }
        model.addAttribute("membercards",lists);
        return "zijinguanli";
    }
    //快捷充值
    @PostMapping("/quickRecharge")
    public String quickRecharge(@RequestParam("bankcard")String bankcard,
                                @RequestParam("money")long money,Model model){
        int id=2;
        //判断充值金额与各个银行单笔限额
        System.out.println("bankcard = " + bankcard);
        //符合--修改本地账户余额及银行卡余额,返回充值成功页面
        if(true){
            int i = loanService.quickRecharge(money, id);
            return "success";
        }else {
            //不符合--返回提示
            model.addAttribute("msg","充值金额超过银行单笔转账金额!");
            return "redirect:http://localhost:10023/zijinguanli";
        }


    }
    @GetMapping("/success")
    public String success(){
        return "success";
    }
}
