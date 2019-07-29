package com.finance.www.service;

import com.finance.www.pojo.BigLoan;
import com.finance.www.vo.AddBigLoan;
import com.finance.www.vo.AddBigLoanImg;
import com.finance.www.vo.BasicAddBigLoan;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartHttpServletRequest;

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
}

