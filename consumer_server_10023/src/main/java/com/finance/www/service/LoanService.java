package com.finance.www.service;

import com.finance.www.vox.AddBigLoan;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

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

