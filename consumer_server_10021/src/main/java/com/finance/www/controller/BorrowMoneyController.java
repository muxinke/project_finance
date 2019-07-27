package com.finance.www.controller;

import com.finance.www.pojo.MemberCard;
import com.finance.www.pojo.MemberLimit;
import com.finance.www.service.BorrowMoneyService;
import com.finance.www.utils.BiappMoneyUtils;
import com.finance.www.utils.CpmMoneyUtils;
import com.finance.www.vo.Biapp;
import com.finance.www.vo.CpmVo;
import com.finance.www.vo.MemberSmallBorrow;
import com.sun.org.apache.xalan.internal.lib.ExsltDynamic;
import jdk.nashorn.internal.ir.ReturnNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/7/24.
 */
@Controller
public class BorrowMoneyController {
    @Autowired
    private BorrowMoneyService borrowMoneyService;
    /**
     * 跳转小额借款界面
     * @return
     */
    @GetMapping("xiaoe")
    public String xiaoe(Model model){
        /**判断用户是否登录*/

        //根据用户id查找用户的借款额度，银行卡号
        MemberLimit memberLimit= borrowMoneyService.xiaoeMemberLimit(2);
        List<MemberCard> cards= borrowMoneyService.xiaoeMemberCard(2);
        /**提交额度*/
        model.addAttribute("edu",((float)memberLimit.getShengyuedu())/100);
        /**提交银行卡表*/
        List<String> lists = new ArrayList<>();
        /**遍历用户银行号，将银行名称和卡号后四位拼在一起*/
        for(MemberCard memberCard: cards ){
            String line=memberCard.getBankcard().substring(memberCard.getBankcard().length()-4);
            lists.add(memberCard.getBankname()+line);
        }
        model.addAttribute("cards",lists);
     /*  CpmVo cpmVo = CpmMoneyUtils.getCpm("4500", 18, 0.012f);
       // Biapp biapp = BiappMoneyUtils.getBiapp("4500", 6, 0.012f);
        model.addAttribute("cpmVo",cpmVo);*/
        return "xiaoe";
    }

    /**
     * 小额借款提交
     * @param memberSmallBorrow 小额借款vo
     * @return
     */
    @PostMapping("borrowSubmit")
    public String borrowSubmit(MemberSmallBorrow memberSmallBorrow){
        int code =borrowMoneyService.addSmallRecord(memberSmallBorrow);
        if(101==code){
            return "tishi";
        }else if(102==code){
            return "tishi2";
        }
        return "xiaoe";
    }

    /**
     * 等额本金
     * @param money 贷款金额
     * @param time 贷款时间
     * @return
     */
    @PostMapping("querycpm")
    @ResponseBody
    public CpmVo querycpm(@RequestParam("borrow")String money,
                       @RequestParam("time")int time){
        CpmVo cpmVo = CpmMoneyUtils.getCpm(money, time, 0.012f);
        System.out.println(cpmVo);
        return cpmVo;
    }

    /**
     *  先息后本
     * @param money 贷款金额
     * @param time 贷款时间
     * @return
     */
    @PostMapping("querybiapp")
    @ResponseBody
    public Biapp querybiapp(@RequestParam("borrow")String money,
                       @RequestParam("time")int time){
        Biapp biapp = BiappMoneyUtils.getBiapp(money, time, 0.012f);
        return biapp;
    }
}
