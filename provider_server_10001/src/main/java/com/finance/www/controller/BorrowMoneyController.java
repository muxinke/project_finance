package com.finance.www.controller;

import com.finance.www.pojo.MemberAccount;
import com.finance.www.pojo.MemberCard;
import com.finance.www.pojo.MemberLimit;
import com.finance.www.pojo.SmallOan;
import com.finance.www.service.MemberAccountService;
import com.finance.www.service.MemberCardService;
import com.finance.www.service.MemberLimitService;
import com.finance.www.service.SmallOanService;
import com.finance.www.utils.BiappMoneyUtils;
import com.finance.www.utils.CpmMoneyUtils;
import com.finance.www.vo.Biapp;
import com.finance.www.vo.CpmVo;
import com.finance.www.vo.MemberSmallBorrow;
import jdk.nashorn.internal.ir.ReturnNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

/**
 * Created by Administrator on 2019/7/24.
 */
@RestController
public class BorrowMoneyController {
    public static final String LOCALACCOUNT= "本地账户";
    @Autowired
    private MemberLimitService memberLimitService;
    @Autowired
    private MemberCardService memberCardService;
    @Autowired
    private SmallOanService smallOanService;
    @Autowired
    private MemberAccountService memberAccountService;
    /**
     * 查询可借余额
     * @param id
     * @return
     */
    @GetMapping("xiaoe")
    public MemberLimit xiaoe(@RequestParam("id")Integer id){
        //调用业务接口查找用户的当前剩余额度
        MemberLimit memberLimit = memberLimitService.queryById(id);
        return  memberLimit;
    }

    /**
     * 查询银行卡
     * @param id
     * @return
     */
    @GetMapping("card")
    public  List<MemberCard> xiaoeMemberCard(@RequestParam("id") int id){
        List<MemberCard> cards = memberCardService.queryById(id);
        return cards;
    }

    /**
     * 提交小额借款
     * @param memberSmallBorrow
     * @return
     */
    @PostMapping("borrowSubmit")
    int addSmallRecord(@RequestBody MemberSmallBorrow memberSmallBorrow){
        /**查出当前用户id,封装进对象*/
        memberSmallBorrow.setMemberId(2);
        memberSmallBorrow.setIs_agreed(1);
/*
        *//**根据借款金额和借款时间借款金额 计算还款周期*//*
        //等额本金
        if(memberSmallBorrow.getBorrowStyle()==1){
            CpmVo cpmVo = CpmMoneyUtils.getCpm(memberSmallBorrow.getBorrowMoney(), memberSmallBorrow.getBorrowTime(), 0.012f);

        }
        //先息后本
        else if(memberSmallBorrow.getBorrowStyle()==2){
            Biapp biapp = BiappMoneyUtils.getBiapp(memberSmallBorrow.getBorrowMoney(), memberSmallBorrow.getBorrowTime(),  0.012f);

        }*/
        /**判断选择的是否是本地账户**/
        if(LOCALACCOUNT.equals(memberSmallBorrow.getCardName())){
            //调用业务接口，给本地账户打钱
            boolean b = smallOanService.insertRecord(memberSmallBorrow);
            if(b){
                return 101;
            }
        }else {
            //调用银行业务接口
            boolean b = smallOanService.addRecord(memberSmallBorrow);
            if(b){
                //银行转账成功
                return 102;
            }
        }
        return 0;
    }
    /***
     * 返回用户的账户信息 渡碧天调用接口
     * @param id
     * @return
     */
    @GetMapping("showzhanghujine")
    public MemberAccount queryById(@RequestParam("userid") int id ){
        MemberAccount memberAccount=memberAccountService.queryById(id);
        return memberAccount;
    }
    @PostMapping("subinfo")
    int insertCard(@RequestParam("bankcard")String bankcard, @RequestParam("bankName")String bankName,
                   @RequestParam("memberId")int memberId){
       int i= memberCardService.insertCard(bankcard,bankName,memberId);
       return i;
    }
}
