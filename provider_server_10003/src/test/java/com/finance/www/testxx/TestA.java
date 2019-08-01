package com.finance.www.testxx;

import com.finance.www.mapper.BigLoanMapper;
import com.finance.www.mapper.MemberRegisterMapper;
import com.finance.www.pojo.BankLimitmoney;
import com.finance.www.pojo.MemberRegister;
import com.finance.www.service.BankLimitmoneySerrvice;
import com.finance.www.service.MemberRegisterService;
import com.finance.www.vox.AddBigLoan;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Administrator on 2019/7/26.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Configuration("com.finance.www.mapper.BigLoanMapper")
public class TestA {
    @Autowired
    private BigLoanMapper bigLoanMapper;
    @Autowired
    private MemberRegisterService memberRegisterService;
    @Autowired
    private BankLimitmoneySerrvice bankLimitmoneySerrvice;
    @Autowired
    private MemberRegisterMapper memberRegisterMapper;
    @Test
    public void test(){
        AddBigLoan addBigLoan = new AddBigLoan();
        addBigLoan.setMemberId(2);
        addBigLoan.setAmount(100000l);
        addBigLoan.setXingzhi(4);
        addBigLoan.setPaymethod(2);
        addBigLoan.setHowlong(3);
        addBigLoan.setState(0);
        System.out.println(addBigLoan);
        int i = bigLoanMapper.addBigLoan(addBigLoan);
        Integer id = addBigLoan.getId();
        System.out.println("id = " + id);
    }
    @Test
    public void test2(){
        MemberRegister byId = memberRegisterService.findById(2);
        System.out.println("memberRegister = " + byId);
    }
    @Test
    public void test3(){
        BankLimitmoney bankLimitmoney = bankLimitmoneySerrvice.findByName("中国银行");
        Integer bankId = bankLimitmoney.getBankId();
        System.out.println("bankId = " + bankId);
    }
    @Test
    public void test4(){
        int haveMyId = memberRegisterMapper.isHaveMyId(3);
        System.out.println("haveMyId = " + haveMyId);
    }
}
