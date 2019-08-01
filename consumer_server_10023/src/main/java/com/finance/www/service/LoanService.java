package com.finance.www.service;

import com.finance.www.config.OAuth2FeignRequestInterceptor;
import com.finance.www.pojo.BankLimitmoney;
import com.finance.www.pojo.MemberAccount;
import com.finance.www.pojo.MemberCard;
import com.finance.www.pojo.MemberRegister;
import com.finance.www.vox.AddBigLoan;
import com.finance.www.vox.RegisterVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2019/7/24.
 */
@FeignClient(value = "provider-server-10003",configuration = OAuth2FeignRequestInterceptor.class)
public interface LoanService {
    @GetMapping("/dae")
    public int dae(@RequestParam("userid")Integer userid, @RequestParam("edu")Long edu);
    @PostMapping("/upload")
    public int  uploadBlog(@RequestBody ArrayList<AddBigLoan> list);
    @GetMapping("/zhuanzhangchongzhi")
    public MemberRegister zhuanzhangchongzhi(@RequestParam("id")Integer id);
    @GetMapping("/kuaijiechongzhi")
    public MemberAccount kuaijiechongzhi(@RequestParam("id")Integer id);
    @GetMapping("/membercard")
    public List<MemberCard> getMembercard(@RequestParam("id")Integer id);
    @PostMapping("/quickRecharge")
    public int  quickRecharge(@RequestParam("money")long money,
                              @RequestParam("id")int id);
    @GetMapping("/findBank")
    public BankLimitmoney findBank(@RequestParam("bankName")String bankName);
    //提现
    @PostMapping("/withdraw")
    public int  tixian(@RequestParam("money")long money, @RequestParam("id")int id);
    @GetMapping("query")
    public MemberRegister getMember(@RequestParam("id")int id,@RequestHeader(name = "Authorization",required = true)String token );
    @GetMapping("/ishaveid")
    public int ishaveid(@RequestParam("id")Integer id);
    @PostMapping("/shiming")
    public int shiming(@RequestBody RegisterVo registerVo,@RequestHeader(name = "Authorization",required = true)String token );

}

