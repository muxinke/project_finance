package com.finance.www.service;

import com.finance.www.config.OAuth2FeignRequestInterceptor;
import com.finance.www.pojo.MemberAccount;
import com.finance.www.pojo.MemberCard;
import com.finance.www.pojo.MemberLimit;
import com.finance.www.vo.MemberSmallBorrow;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import java.util.List;


/**
 * Created by Administrator on 2019/7/24.
 */

@FeignClient(value = "provider-server",configuration = OAuth2FeignRequestInterceptor.class)
public interface BorrowMoneyService {
    @GetMapping("xiaoe")
    public MemberLimit xiaoeMemberLimit(@RequestParam("id")Integer id);

    @GetMapping("card")
    List<MemberCard> xiaoeMemberCard(@RequestParam("id") Integer i);
    @PostMapping("borrowSubmit")
    int addSmallRecord(@RequestBody MemberSmallBorrow memberSmallBorrow,@RequestHeader(name = "Authorization",required = true)String token);
    @PostMapping("subinfo")
    int insertCard(@RequestParam("bankcard")String bankcard, @RequestParam("bankName")String bankName,
                   @RequestParam("memberId")int memberId);
}
