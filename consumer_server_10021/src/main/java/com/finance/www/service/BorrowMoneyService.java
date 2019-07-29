package com.finance.www.service;

import com.finance.www.pojo.MemberCard;
import com.finance.www.pojo.MemberLimit;
import com.finance.www.vo.MemberSmallBorrow;
import com.sun.javafx.collections.MappingChange;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/7/24.
 */
@FeignClient(value = "provider-server")
public interface BorrowMoneyService {
    @GetMapping("xiaoe")
    public MemberLimit xiaoeMemberLimit(@RequestParam("id")Integer id);
    @GetMapping("card")
    List<MemberCard> xiaoeMemberCard(@RequestParam("id") int i);
    @PostMapping("borrowSubmit")
    int addSmallRecord(@RequestBody MemberSmallBorrow memberSmallBorrow);
}