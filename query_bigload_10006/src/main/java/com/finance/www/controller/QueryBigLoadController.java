package com.finance.www.controller;


import com.finance.www.service.QueryBigLoadService;
import com.finance.www.vo.ApplyMoney;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2019/7/30.
 */
@RestController
public class QueryBigLoadController {
    @Autowired
    private QueryBigLoadService queryBigLoadService;
    /**
     * 查询大额贷款的申请记录
     * @return
     */
    @GetMapping("queryBigload")
    public PageInfo<ApplyMoney> list(@RequestParam("memberId") int memberId,
                                   @RequestParam("state") int state,
                                   @RequestParam("numPage")int numPage,
                                   @RequestParam("pageSize")int pageSize){
       /**开启分页*/
        PageHelper.startPage(numPage,pageSize);
        List<ApplyMoney> list = queryBigLoadService.query(memberId,0);
        PageInfo<ApplyMoney> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
    /**导出excle用*/
    @GetMapping("/getBigload")
    List<ApplyMoney> queryAll(@RequestParam("memberId") int memberId,@RequestParam("state") int state){
        List<ApplyMoney> list = queryBigLoadService.query(memberId,0);
        return list;
    }
}
