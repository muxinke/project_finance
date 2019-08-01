package com.finance.www.comsumer_client_8040.controller;//package com.finance.www.consumer_cllient_8888.controller;

import com.finance.www.comsumer_client_8040.service.Resources8060Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author ：邓一凡
 * @date ：Created in 2019/7/28 5:28
 * @description ：
 */
@RestController
public class PublicController {

    @Autowired
    Resources8060Service service;

    @GetMapping("/prom")
    public String prometheus() {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        return "java_test_monitor{value=\"test\",} " + random.nextDouble();
    }

    @GetMapping("/welcome")
    public String welcome() {
        String tesst = service.tesst();
        System.out.println("tesst = " + tesst);
        return "welcome";
    }

    @GetMapping("/abc")
    public String abc(){

        return service.tesst();
    }



}
