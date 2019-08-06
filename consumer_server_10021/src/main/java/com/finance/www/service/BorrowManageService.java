
package com.finance.www.service;


import com.finance.www.vo.ApplyMoney;
import com.github.pagehelper.PageInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


/**
 *
 * 调用外部接口访问，大额借款记录
 * Created by Administrator on 2019/7/30.
 */

@FeignClient(value = "provider-querybigload")
public interface BorrowManageService {
    @GetMapping("queryBigload")
    @ResponseBody
    public PageInfo<ApplyMoney> list(@RequestParam("memberId") int memberId,
                                     @RequestParam("state") int state,
                                     @RequestParam("numPage")int numPage,
                                     @RequestParam("pageSize")int pageSize,
                                     @RequestHeader(name = "Authorization",required = true)String token);
    /**导出excle用*/
    @GetMapping("/getBigload")
    List<ApplyMoney> queryAll(@RequestParam("memberId") int memberId,@RequestParam("state") int state);
}

