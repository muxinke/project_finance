package com.finance.www.controller;

import com.finance.www.vo.WenJuan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.sound.midi.Soundbank;
import javax.xml.bind.SchemaOutputResolver;

/**
 * Created by Administrator on 2019/7/24.
 */
@Controller
public class LargeLoansController {
    @GetMapping("/wenjuan")
    public String wenjuan(){
        return "wenjuan";
    }
    @GetMapping("/dae")
    public String dae(@RequestParam("age")int age, @RequestParam("work")int work,
                      @RequestParam("income")int income, @RequestParam("nomoney")int nomoney,
                      @RequestParam("guarantee")int guarantee, @RequestParam("age")int debt,
                      @RequestParam("age")int loantime){
        int sum=age+work+income+nomoney+guarantee+debt+loantime;//7-28
        System.out.println(sum);
        //根据用户id修改其贷款额度
        if(sum<10){//贷款额度为10万

        }else if(sum<14){//贷款额度为50万

        }else if(sum>14){//贷款额度为100万

        }else if(sum>21){//贷款额度为1000万

        }
        return "dae";
    }

}
