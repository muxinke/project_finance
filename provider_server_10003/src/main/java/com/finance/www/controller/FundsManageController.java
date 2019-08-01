package com.finance.www.controller;

import com.finance.www.pojo.BankLimitmoney;
import com.finance.www.pojo.MemberAccount;
import com.finance.www.pojo.MemberCard;
import com.finance.www.pojo.MemberRegister;
import com.finance.www.service.BankLimitmoneySerrvice;
import com.finance.www.service.MemberAccountService;
import com.finance.www.service.MemberCardService;
import com.finance.www.service.MemberRegisterService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2019/7/30.
 */
@RestController
public class FundsManageController {
    @Autowired
    private MemberRegisterService memberRegisterService;
    @Autowired
    private MemberAccountService memberAccountService;
    @Autowired
    private MemberCardService memberCardService;
    @Autowired
    private BankLimitmoneySerrvice bankLimitmoneySerrvice;
    @GetMapping("/zhuanzhangchongzhi")
    public MemberRegister zhuanzhangchongzhi( @RequestParam("id")Integer id){
        MemberRegister memberRegister = memberRegisterService.findById(id);
        MemberAccount memberAccount = memberAccountService.selectById(id);
        return memberRegister;
    }
    @GetMapping("/kuaijiechongzhi")
    public MemberAccount kuaijiechongzhi( @RequestParam("id")Integer id){
        MemberAccount memberAccount = memberAccountService.selectById(id);
        return memberAccount;
    }
    @GetMapping("/membercard")
    public List<MemberCard> getMembercard(@RequestParam("id")Integer id){
        List<MemberCard> memberCards = memberCardService.findCardById(id);
        return memberCards;
    }
    //快捷充值
    @PostMapping("/quickRecharge")
    public int  quickRecharge(@RequestParam("money")long money,
                                @RequestParam("id")int id){
        //修改本地账户余额
        MemberAccount memberAccount = memberAccountService.selectById(id);
        long accountBalance = memberAccount.getAccountBalance();
        long newBalance=accountBalance+money;
        int updateBalanceById = memberAccountService.updateBalanceById(id, newBalance);
        return updateBalanceById;
    }
    //查询银行卡
    @GetMapping("/findBank")
    public BankLimitmoney findBank(@RequestParam("bankName") String bankName){
        BankLimitmoney byName = bankLimitmoneySerrvice.findByName(bankName);
        return byName;
    }
    //提现
    @PostMapping("/withdraw")
    public int  tixian(@RequestParam("money")long money,
                              @RequestParam("id")int id){
        //修改本地账户余额
        MemberAccount memberAccount = memberAccountService.selectById(id);
        long accountBalance = memberAccount.getAccountBalance();
        long newBalance=accountBalance-money;
        int updateBalanceById = memberAccountService.updateBalanceById(id, newBalance);
        return updateBalanceById;
    }
}
