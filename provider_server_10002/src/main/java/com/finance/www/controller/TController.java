package com.finance.www.controller;

import com.finance.www.Vo.MemberInfoVo;
import com.finance.www.pojo.MemberInfo;
import com.finance.www.pojo.Memeber;
import com.finance.www.pojo.Produit;
import com.finance.www.pojo.ProduitImg;
import com.finance.www.pvo.InvestmentVo;
import com.finance.www.pvo.PageVo;
import com.finance.www.pvo.YEVo;
import com.finance.www.service.*;
import com.finance.www.pvo.JieKuanXxVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by 杜碧天 on 2019/7/24.
 */
@RestController
public class TController {
    @Autowired
    MemberInfoService memberInfoService;
    @Autowired
    ProduitImgService produitImgService;
    @Autowired
    ProduitService produitService;
    @Autowired
    RecordMemberTenderService recordMemberTenderService;
    @Autowired
    MemberProduitService memberProduitService;
    @Autowired
    MemberReceivableService memberReceivableService;
    @Autowired
    TransactionRecordsService transactionRecordsService;
    @RequestMapping(value = "/findtypesan",method = RequestMethod.GET)
    public List<Produit> findProduitBySan(@RequestParam(value = "pt") Integer pt){
        List<Produit> produits = produitService.chaProduitsanBytype(pt);
        return produits;
    }
    //商品列表
    @RequestMapping(value = "/findAllp",method =RequestMethod.GET)
    List<Produit> findProduitBytype(@RequestParam(value = "pt")Integer pt){
        List<Produit> produits = produitService.chaProduitBytype(pt);
        return produits;
    }
    //商品详情
    @RequestMapping(value = "/findproduitbyid",method = RequestMethod.GET)
    JieKuanXxVo findProduitByPid(@RequestParam(value = "pid")Integer pid){
        JieKuanXxVo jieKuanXxVo = produitService.chaProduitBypid(pid);
        return jieKuanXxVo;
    }
    //商品的图片
    @RequestMapping(value = "/findProduitImgById",method = RequestMethod.GET)
    List<ProduitImg> findProduitImgById(@RequestParam(value = "pid")Integer pid){
        List<ProduitImg> produitImgs = produitImgService.chaProduitImgById(pid);
        return produitImgs;
    }
    //查出投资该标的所有人
    @RequestMapping(value = "/findinvestment",method = RequestMethod.GET)
    List<InvestmentVo> findInvestmentBypid(@RequestParam(value = "pid")Integer pid){
        List<InvestmentVo> recordMemberTenders = recordMemberTenderService.chaInvestmentBypid(pid);
        return recordMemberTenders;
    }
    //靠标的类型与标的还款方式还有期限来查询标并且分页
    @RequestMapping(value = "/findproduitbypage",method = RequestMethod.GET)
    PageVo findProduitByPage(@RequestParam(value = "biaotype") String biaotype,
                                    @RequestParam(value = "style") String style,
                                    @RequestParam(value = "timeLimit") String timeLimit,
                                    @RequestParam(value = "page",defaultValue = "1") Integer page){
        PageVo produits = produitService.chaProduitByPage(biaotype, style, timeLimit,page);
        return produits;
    }
    //查询用户的具体信息
    @RequestMapping(value = "/chaxunyonghubyid",method = RequestMethod.GET)
    MemberInfoVo findUserInfoByid(@RequestParam(value = "userid")Integer userid, @RequestParam(value = "biaotype")Integer biaotype){
        MemberInfo memberInfo = memberInfoService.chaXunYongHuXx(userid);
        Integer integer = produitService.chaCountByIdType(userid, biaotype);
        MemberInfoVo memberInfoVo = new MemberInfoVo();
        memberInfoVo.setCishu(integer);
        memberInfoVo.setMemberInfo(memberInfo);
        System.out.println("memberInfoVo = " + memberInfoVo);
        return memberInfoVo;
    }
    //将投资记录分别存入四各表中
    @RequestMapping(value = "/cundaosigebiao",method = RequestMethod.POST)
    void addSiGeBiao(@RequestParam(value = "userid")Integer userid,
                        @RequestParam(value = "tenderMoney")Integer tenderMoney,
                        @RequestParam(value = "borrowId")Integer borrowId){
          memberProduitService.addTouZiGuanLi(userid,borrowId,tenderMoney);
          memberReceivableService.addMemberReceivble(userid,borrowId,tenderMoney);
          recordMemberTenderService.addtoubiaojilu(userid,borrowId,tenderMoney);
          transactionRecordsService.addjiaoyijl(userid,tenderMoney,borrowId);

    }
    //查询用户的数量
    @Autowired
    MemeberService memeberService;
    @RequestMapping(value ="/chaxunyonghunum",method = RequestMethod.GET)
    Integer findMemberNum(){
        Integer memberNum = memeberService.findMemberNum();
        return memberNum;
    }
    //查询所有交易的金额
    //查询所有的交易金额
    @RequestMapping(value = "/chaxunmoneys",method = RequestMethod.GET)
    String findMoneys(){
       String moneys= produitService.chaMoneys();
       return  moneys;
    }
    //查询用户
    @RequestMapping(value = "/chamember",method = RequestMethod.GET)
    Memeber findMemberByid(@RequestParam(value = "userid")Integer userid){
        Memeber memberByid = memeberService.findMemberByid(userid);
        return memberByid;
    }

}
