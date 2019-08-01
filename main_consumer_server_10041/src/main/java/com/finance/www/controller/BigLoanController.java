package com.finance.www.controller;

import com.finance.www.enums.GuiseEnum;
import com.finance.www.enums.ProduitEnum;
import com.finance.www.enums.StateEnum;
import com.finance.www.pojo.BigloanImgurl;
import com.finance.www.pojo.MemberProduitCreditor;
import com.finance.www.pojo.Produit;
import com.finance.www.pojo.ProduitImg;
import com.finance.www.service.*;
import com.finance.www.vo.BandMvo;
import com.finance.www.vo.BandVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * liupeng
 * Created by lenovo-pc on 2019/7/25.
 */
@Controller
public class BigLoanController {
    @Autowired
    private ProduitService produitService;
    @Autowired
    private BigLoanService bigLoanService;
    @Autowired
    private BigLoanImgurlService bigLoanImgurlService;
    @Autowired
    private ProduitImgService produitImgService;
    @Autowired
    private MemberProduitCreditorService creditorService;

    //role用户维护
    @RequestMapping("/auth_cert")
    public String role(Model model,
                       @RequestParam(defaultValue = ".", value = "info") String info,
                       @RequestParam(required = false, defaultValue = "1", value = "pn") Integer pn) {
        if (info.equals(".")) {
            PageHelper.startPage(pn, 3);
            List<BandMvo> list = bigLoanService.findAll();
            List<BandVo> bandMvos = new ArrayList<>();

            for (BandMvo bandMvo : list) {

                BandVo bandVo = new BandVo();
                bandVo.setId(bandMvo.getId());
                bandVo.setMemberId(bandMvo.getMemberId());
                bandVo.setAmount(bandMvo.getAmount());
                bandVo.setUse(ProduitEnum.getEnumType(bandMvo.getXingzhi()));
                bandVo.setHowlong(bandMvo.getHowlong());
                bandVo.setPaymethod(GuiseEnum.getGuiseTypeName(bandMvo.getPaymethod()));
                bandVo.setIdcardone(bandMvo.getIdcardone());
                bandVo.setIdcardtwo(bandMvo.getIdcardtwo());
                bandVo.setBankcard(bandMvo.getBankcard());
                bandVo.setCreateTime(bandMvo.getCreateTime());
                bandVo.setState(StateEnum.getStateStr(bandMvo.getState()));
                bandVo.setUsername(bandMvo.getUsername());
                bandVo.setMobile(bandMvo.getMobile());
                bandVo.setEmail(bandMvo.getEmail());
                bandMvos.add(bandVo);

            }
            PageInfo<BandMvo> p = new PageInfo<>(list);
            model.addAttribute("big", bandMvos);
            model.addAttribute("pageInfo", p);
            return "auth_cert";
        }
        PageHelper.startPage(pn, 3);
        List<BandMvo> list = bigLoanService.selectBandM(info);

        List<BandVo> bandMvos = new ArrayList<>();
        for (BandMvo bandMvo : list) {
            BandVo bandVo = new BandVo();
            bandVo.setId(bandMvo.getId());
            bandVo.setMemberId(bandMvo.getMemberId());
            bandVo.setAmount(bandMvo.getAmount());
            bandVo.setUse(ProduitEnum.getEnumType(bandMvo.getXingzhi()));
            bandVo.setHowlong(bandMvo.getHowlong());
            bandVo.setPaymethod(GuiseEnum.getGuiseTypeName(bandMvo.getPaymethod()));
            bandVo.setIdcardone(bandMvo.getIdcardone());
            bandVo.setIdcardtwo(bandMvo.getIdcardtwo());
            bandVo.setBankcard(bandMvo.getBankcard());
            bandVo.setCreateTime(bandMvo.getCreateTime());
            bandVo.setState(StateEnum.getStateStr(bandMvo.getState()));
            bandVo.setUsername(bandMvo.getUsername());
            bandVo.setMobile(bandMvo.getMobile());
            bandVo.setEmail(bandMvo.getEmail());
            bandMvos.add(bandVo);
        }

        PageInfo<BandMvo> p = new PageInfo<>(list);
        model.addAttribute("info", info);
        model.addAttribute("big", bandMvos);
        model.addAttribute("pageInfo", p);

        return "auth_cert";
    }

    @RequestMapping("/upapprove")
    public String shenhe(@RequestParam("id") int id, Model model) {
        List<BigloanImgurl> list = bigLoanImgurlService.findImgsByUid(id);
        BandMvo bandMvo = bigLoanService.findUserById(id);

        model.addAttribute("bandmvo", bandMvo);
        model.addAttribute("bigImgurl", list);

        return "upapprove";
    }

    @ResponseBody
    @RequestMapping(value = "/upappresult", method = RequestMethod.POST)
    public String shjg(@RequestParam(defaultValue = ".",value = "str") String str, @RequestParam("bid") int id,
                       BandMvo bandMvo, Produit produit, MemberProduitCreditor produitCreditor) {

        String[] split = str.split(",");
        ArrayList<String> list = new ArrayList<>();
        for (String s : split) {
            list.add(s);
        }
        //还款方式
        produit.setRemboursementsGuise(bandMvo.getPaymethod());
        //发布时间
        produit.setReleaseTime(new Date());
        //是否同意协议
        produit.setIsConsent(1);
        //
        produit.setRemboursementsExpires(bandMvo.getHowlong());
        produit.setBorrowingTitle(ProduitEnum.getEnumType(bandMvo.getXingzhi()));
        produit.setInvestmentType(bandMvo.getXingzhi());
        produit.setMontantDeOffre(bandMvo.getAmount() + "00");
        produit.setProduitDureeDes(bandMvo.getHowlong());
        produit.setIsCondition(1);
        produit.setInvestmentAmount(0+"");
        System.out.println("prosuit+" + produit);
        int i = produitService.addProduit(produit);
        if (i == 1) {
            int state = 1;
            int upSt = bigLoanService.upSt(state, id);
            //补充债权人信息表
            produitCreditor.setMemberId(bandMvo.getMemberId());
            produitCreditor.setProduitId(produit.getId());
            int i1 = creditorService.addCreditor(produitCreditor);
            System.out.println("------"+i1);
            //补充项目相关资料图片
            ProduitImg produitImg = new ProduitImg();
            produitImg.setProduitId(produit.getId());
            for (String url:list) {
                produitImg.setImgUrl(url);
                int img = produitImgService.addProImg(produitImg);
            }

        }
        return i + "";
    }
}
