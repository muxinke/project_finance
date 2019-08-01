package com.finance.www.controller;

import com.finance.www.service.MemberRegisterService;
import com.finance.www.vox.RegisterVo;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Administrator on 2019/8/1.
 */
@RestController
public class MyAccountController {
    @Autowired
     private MemberRegisterService memberRegisterService;
    @GetMapping("/ishaveid")
    public int ishaveid(@RequestParam("id")Integer id){
        int haveMyId = memberRegisterService.isHaveMyId(id);
        return haveMyId;
    }
    @PostMapping("/shiming")
    public int shiming(@RequestBody RegisterVo registerVo){
        int shiming = memberRegisterService.shiming(registerVo);
        return shiming;
    }
}
