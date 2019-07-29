package com.finance.www.controller;

import com.finance.www.pojo.MemberCard;
import com.finance.www.pojo.MemberLimit;
import com.finance.www.pojo.SmallOan;
import com.finance.www.service.MemberCardService;
import com.finance.www.service.MemberLimitService;
import com.finance.www.service.SmallOanService;
import com.finance.www.vo.MemberSmallBorrow;
import jdk.nashorn.internal.ir.ReturnNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    /**
     * 查询可借余额
     * @param id
     * @return
     */
    @GetMapping("xiaoe")
    public MemberLimit xiaoe(@RequestParam("id")Integer id){
        //调用业务接口查找用户的当前剩余额度
        MemberLimit memberLimit = memberLimitService.queryById(id);
        return memberLimit;
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
        System.out.println(memberSmallBorrow);
        /**查出当前用户id,封装进对象*/



        memberSmallBorrow.setMemberId(2);
        memberSmallBorrow.setIs_agreed(1);
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
}
