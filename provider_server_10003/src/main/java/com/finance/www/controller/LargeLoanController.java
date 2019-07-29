package com.finance.www.controller;

import com.finance.www.service.BigLoanService;
import com.finance.www.service.LoanLimitService;
import com.finance.www.utils.AliyunOssUtils;
import com.finance.www.utils.DeleteFileUtil;
import com.finance.www.vo.AddBigLoan;
import com.finance.www.vo.AddBigLoanImg;
import com.finance.www.vo.BasicAddBigLoan;
import net.sf.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Administrator on 2019/7/24.
 */
@Controller
public class LargeLoanController {
    @Autowired
    private LoanLimitService loanLimitService;
    @Autowired
    private BigLoanService bigLoanService;

    @ResponseBody
    @GetMapping("/dae")
    public int dae(Integer userid,Long edu){
        int updateByUid = loanLimitService.updateByUid(userid, edu);
        return updateByUid;
    }
    @PostMapping("/upload")
    @ResponseBody
    public int   uploadBlog(@RequestBody ArrayList<AddBigLoan> list)  {
        System.out.println(list);
        /**调用接口 保存记录和照片*/
        int i = bigLoanService.addBigLoan(list);
        return i;
    }
}
