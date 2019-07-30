package com.finance.www.service;

import com.finance.www.pojo.MemberAccount;
import com.finance.www.pojo.MemberCard;
import com.finance.www.pojo.MemberRegister;
import com.finance.www.vox.AddBigLoan;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2019/7/24.
 */
@FeignClient(value = "provider-server-10003")
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
}

