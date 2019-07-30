package com.finance.www.service;

import com.finance.www.pojo.Produit;
import com.finance.www.pojo.ProduitImg;
import com.finance.www.pojo.RecordMemberTender;
import com.finance.www.pvo.InvestmentVo;
import com.finance.www.pvo.JieKuanXxVo;
import com.finance.www.pvo.PageVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by 杜碧天 on 2019/7/24.
 */
@FeignClient(value = "provider-server2")
public interface IndexService {
    //首页展示的商品
    @RequestMapping(value = "/findtypesan",method = RequestMethod.GET)
    List<Produit> findProduitBySan(@RequestParam(value = "pt") Integer pt);
    //商品详情
    @RequestMapping(value = "/findproduitbyid",method = RequestMethod.GET)
    JieKuanXxVo findProduitByPid(@RequestParam(value = "pid")Integer pid);
    //商品的图片
    @RequestMapping(value = "/findProduitImgById",method = RequestMethod.GET)
    List<ProduitImg> findProduitImgById(@RequestParam(value = "pid")Integer pid);
    //商品列表
    @RequestMapping(value = "/findAllp",method = RequestMethod.GET)
    List<Produit> findProduitBytype(@RequestParam(value = "pt")Integer pt);
    //查出投资该标的所有人
    @RequestMapping(value = "/findinvestment",method = RequestMethod.GET)
    List<InvestmentVo> findInvestmentBypid(@RequestParam(value = "pid")Integer pid);
    //靠标的类型与标的还款方式还有期限来查询标并且分页
    @RequestMapping(value = "/findproduitbypage",method = RequestMethod.GET)
    PageVo findProduitByPage(@RequestParam(value = "biaotype") String biaotype,
                             @RequestParam(value = "style") String style,
                             @RequestParam(value = "timeLimit") String timeLimit,
                             @RequestParam(value = "page",defaultValue = "1")Integer page);
}
