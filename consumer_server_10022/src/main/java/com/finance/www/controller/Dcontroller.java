package com.finance.www.controller;

import com.finance.www.Vo.*;
import com.finance.www.Vo.MemberInfoVo;
import com.finance.www.pojo.MemberAccount;
import com.finance.www.pojo.Memeber;
import com.finance.www.pojo.Produit;
import com.finance.www.pojo.ProduitImg;
import com.finance.www.pvo.InvestmentVo;
import com.finance.www.pvo.PageVo;
import com.finance.www.pvo.YEVo;
import com.finance.www.service.IndexService;
import com.finance.www.service.LoginService;
import com.finance.www.service.Service10001;
import com.finance.www.utils.CookiesUtil;
import com.finance.www.utils.GetDetailToken;
import com.finance.www.utils.GetUserBean;
import com.finance.www.utils.PojoZVoUtil;
import com.finance.www.pvo.JieKuanXxVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.security.Principal;
import java.util.List;

/**
 * Created by 杜碧天 on 2019/7/24.
 * NEW_STANDARD(1, "新手标"),
 INSURANCE_COVERS(2, "保险承保"),
 SUPPLY_CHAIN(3, "供应链"),
 CASH_DEPOSIT(4, "保证金"),
 EASY_CONSUMPTION(5, "轻松消费"),
 FINANCE_LEASE(6, "融资租赁"),
 GUARANTEE_THE(7, "担保标"),
 MORTGAGE_THE(8, "抵押标"),
 THE_CREDIT_SCALE(9, "信用标"),
 */
@Controller

public class Dcontroller {
    @Autowired
    IndexService indexService;
    @Autowired
    Service10001 service10001;
/*     @Autowired
     ListService listService;*/
    @GetMapping("/msgpilu")
     public String msgpilu(){
        return "msgpilu";
    }
    @GetMapping("/index")
    public String index2(Model model){
        //还缺少站点数据
        //查询用户的数量
        Integer membercount=indexService.findMemberNum();
        System.out.println("membercount = " + membercount);
        //交易总量
        String Moneys= indexService.findMoneys();
        //新手标
        List<Produit> produitBySan1 = indexService.findProduitBySan(1);
        List<ProduitVo> produitVos1 = PojoZVoUtil.produitUtil(produitBySan1);
        //保险承保
        List<Produit> produitBySan2 = indexService.findProduitBySan(2);
        List<ProduitVo> produitVos2 = PojoZVoUtil.produitUtil(produitBySan2);
        //保证金
        List<Produit> produitBySan4 = indexService.findProduitBySan(4);
        List<ProduitVo> produitVos4 = PojoZVoUtil.produitUtil(produitBySan4);
        //供应链
        List<Produit> produitBySan3 = indexService.findProduitBySan(3);
        List<ProduitVo> produitVos3 = PojoZVoUtil.produitUtil(produitBySan3);
        //抵押标
        List<Produit> produitBySan8 = indexService.findProduitBySan(8);
        List<ProduitVo> produitVos8 = PojoZVoUtil.produitUtil(produitBySan8);
        //担保标
        List<Produit> produitBySan7 = indexService.findProduitBySan(7);
        List<ProduitVo> produitVos7 = PojoZVoUtil.produitUtil(produitBySan7);
       /* System.out.println(produitVos1);
        System.out.println(produitVos2);
        System.out.println(produitVos4);
        System.out.println(produitVos3);
        System.out.println(produitVos8);
        System.out.println(produitVos7);*/
        model.addAttribute("moneys",Moneys);
        model.addAttribute("membercount",membercount);
        model.addAttribute("produit1s",produitVos1);
        model.addAttribute("produit2s",produitVos2);
        model.addAttribute("produit4s",produitVos4);
        model.addAttribute("produit3s",produitVos3);
        model.addAttribute("produit8s",produitVos8);
        model.addAttribute("produit7s",produitVos7);
        return "index";
    }
    @GetMapping("/")
    public String index(Model model){
        //还缺少站点数据
        //查询用户的数量
        Integer membercount=indexService.findMemberNum();
        System.out.println("membercount = " + membercount);
        //交易总量
         String Moneys= indexService.findMoneys();
        //新手标
        List<Produit> produitBySan1 = indexService.findProduitBySan(1);
        List<ProduitVo> produitVos1 = PojoZVoUtil.produitUtil(produitBySan1);
        //保险承保
        List<Produit> produitBySan2 = indexService.findProduitBySan(2);
        List<ProduitVo> produitVos2 = PojoZVoUtil.produitUtil(produitBySan2);
        //保证金
        List<Produit> produitBySan4 = indexService.findProduitBySan(4);
        List<ProduitVo> produitVos4 = PojoZVoUtil.produitUtil(produitBySan4);
        //供应链
        List<Produit> produitBySan3 = indexService.findProduitBySan(3);
        List<ProduitVo> produitVos3 = PojoZVoUtil.produitUtil(produitBySan3);
        //抵押标
        List<Produit> produitBySan8 = indexService.findProduitBySan(8);
        List<ProduitVo> produitVos8 = PojoZVoUtil.produitUtil(produitBySan8);
        //担保标
        List<Produit> produitBySan7 = indexService.findProduitBySan(7);
        List<ProduitVo> produitVos7 = PojoZVoUtil.produitUtil(produitBySan7);
       /* System.out.println(produitVos1);
        System.out.println(produitVos2);
        System.out.println(produitVos4);
        System.out.println(produitVos3);
        System.out.println(produitVos8);
        System.out.println(produitVos7);*/
       model.addAttribute("moneys",Moneys);
       model.addAttribute("membercount",membercount);
        model.addAttribute("produit1s",produitVos1);
        model.addAttribute("produit2s",produitVos2);
        model.addAttribute("produit4s",produitVos4);
        model.addAttribute("produit3s",produitVos3);
        model.addAttribute("produit8s",produitVos8);
        model.addAttribute("produit7s",produitVos7);
        return "index";
    }
   //商品展示列表
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String list(@RequestParam(value = "biaotype",defaultValue ="")Integer biaotype,Model model,HttpServletResponse response){
        String tokenValue = GetDetailToken.getDetailToken();
        Cookie cookie = new Cookie("token",tokenValue);
        cookie.setPath("/");
        response.addCookie(cookie);
       if(!"".equals(biaotype)){
          model.addAttribute("biaotype",biaotype);
       }
        return "list";
    }
    //商品列标引入
    @RequestMapping(value = "/listyy",method = RequestMethod.GET)
    public String listyy(@RequestParam(value ="biaotype",defaultValue = "")String biaotype,
                         @RequestParam(value ="style",defaultValue = "")String style,
                         @RequestParam(value ="b",defaultValue = "")String b,
                         @RequestParam(value ="timeLimit",defaultValue = "")String timeLimit,
                         @RequestParam(value = "page",defaultValue = "1")Integer page,Model model){
        //靠标的类型与标的还款方式还有期限来查询标并且分页
        PageVo produitByPage = indexService.findProduitByPage(biaotype, style, timeLimit,page,"kk");
        List<Produit> kk = produitByPage.getKk();
        List<ProduitVo> produitVos = PojoZVoUtil.produitUtil(kk);
        model.addAttribute("produits",produitVos);
        model.addAttribute("biaotype",biaotype);
        model.addAttribute("style",style);
        model.addAttribute("timeLimit",timeLimit);
        model.addAttribute("page",page);
        Integer total = produitByPage.getTotal();
        Integer zongpage=0;
        zongpage=total/6;
        if((total%6)>0){
            zongpage= zongpage+1;
        }
        model.addAttribute("zongpage",zongpage);
        return "listyy";
    }
    @RequestMapping(value = "/listyy",method = RequestMethod.POST)
    public String listyykk(@RequestParam(value ="biaotype",defaultValue = "")String biaotype,
                         @RequestParam(value ="style",defaultValue = "")String style,
                         @RequestParam(value ="timeLimit",defaultValue = "")String timeLimit,
                         @RequestParam(value = "currenPageNum",defaultValue = "1")Integer currenPageNum,Model model,HttpServletRequest request){
        Cookie token = CookiesUtil.getCookieByName(request, "token");

        String value = token.getValue();
        String Valetoken = "bearer "+value;
        //靠标的类型与标的还款方式还有期限来查询标并且分页
        PageVo produitByPage = indexService.findProduitByPage(biaotype, style, timeLimit,currenPageNum,Valetoken);
        List<Produit> kk = produitByPage.getKk();
        List<ProduitVo> produitVos = PojoZVoUtil.produitUtil(kk);
        model.addAttribute("produits",produitVos);
        model.addAttribute("biaotype",biaotype);
        model.addAttribute("style",style);
        model.addAttribute("timeLimit",timeLimit);
        model.addAttribute("page",currenPageNum);

        Integer total = produitByPage.getTotal();
        Integer zongpage=0;
         zongpage=total/6;
        if((total%6)>0){
            zongpage= zongpage+1;
        }
        model.addAttribute("zongpage",zongpage);
        return "listyy";
    }
    //商品的详细信息
    @RequestMapping(value = "/detail",method = RequestMethod.GET)
    public String detail(@RequestParam(value = "pid",defaultValue = "")Integer pid,Model model){
        JieKuanXxVo produitByPid = indexService.findProduitByPid(pid);
        JieKuanXxVos jieKuanXxVos = PojoZVoUtil.JieKuanVozJieKuanVos(produitByPid);
        //根据pid查出该商品的相关图片
        List<ProduitImg> produitImgs = indexService.findProduitImgById(pid);
        // 查出投资该标的人
        List<InvestmentVo> investmentBypid = indexService.findInvestmentBypid(pid);
        List<InvestVos> investVos = PojoZVoUtil.getInvestVos(investmentBypid);
        model.addAttribute("invests",investVos);
        model.addAttribute("pimgs",produitImgs);
        model.addAttribute("jkxxs",jieKuanXxVos);
        return "detail";
    }
    //查询账户的余额
    @RequestMapping(value = "/showzhanghujine",method = RequestMethod.GET)
    @ResponseBody
    public MemberAccount showZhangHuJine(@RequestParam(value = "userid",defaultValue = "")Integer userid,HttpServletRequest request){

        MemberAccount memberAccount = service10001.showZhangHuJine(userid);
        System.out.println("memberAccount = " + memberAccount);
        return memberAccount;
    }
    //根据id查询用户的具体信息
    @RequestMapping(value = "/chaxustatus",method = RequestMethod.GET)
    @ResponseBody
    public MemberInfoVo chaxunxx(@RequestParam(value = "userid",defaultValue = "")Integer userid, @RequestParam(value = "biaotype",defaultValue = "")Integer biaotype){
        System.out.println("userid = " + userid);
        MemberInfoVo userInfoByid = indexService.findUserInfoByid(userid, biaotype);
        System.out.println("userInfoByid = " + userInfoByid);
        return  userInfoByid;
    }
    //我要投资
    @RequestMapping(value = "/woyaotouzi",method = RequestMethod.GET)
    @ResponseBody
    public String woYaoTouZi(@RequestParam(value = "userid",defaultValue = "")Integer userid,
                             @RequestParam(value = "tenderMoney",defaultValue = "")Integer tenderMoney,
                             @RequestParam(value = "borrowId",defaultValue = "")Integer borrowId,HttpServletRequest request){//商品的id
       indexService.addSiGeBiao(userid,tenderMoney,borrowId);
       return "1";
    }
    //关于我们
    @RequestMapping(value = "/aboutus",method = RequestMethod.GET)
    public String aboutus(){
        return "aboutus";
    }
    //产品
    @RequestMapping(value = "/chanpin",method = RequestMethod.GET)
    public String chanpin(){
        return "chanpin";
    }
    //法规
    @RequestMapping(value = "/fagui",method = RequestMethod.GET)
    public String fagui(){
        return "fagui";
    }
    //安全保障
    @RequestMapping(value = "/guarantee",method = RequestMethod.GET)
    public String guarantee(){
        return "guarantee";
    }
    //使用指南
    @RequestMapping(value = "/guide",method = RequestMethod.GET)
    public String guide(){
        return "guide";
    }
    //常见问题
    @RequestMapping(value = "/problem",method = RequestMethod.GET)
    public String problem(){
        return "problem";
    }
    //运营数据
    @RequestMapping(value = "/yyshuju",method = RequestMethod.GET)
    public String yyshuju(){

        return "yyshuju";
    }
    //向导、
    @RequestMapping(value = "/xiangdao",method = RequestMethod.GET)
    public String xiangdao(){
        return "xiangdao";
    }
    //判断是否登陆
    @RequestMapping(value = "/panduanLogin",method = RequestMethod.POST)
    @ResponseBody
    public UserVo  sss(HttpServletRequest request) throws IOException {
        /**通过上下文得到token，写入cookie*/
        String tokenValue = GetDetailToken.getDetailToken();
        System.out.println("tokenValue = " + tokenValue);
        /**获取用户id*/
        Integer memberId = GetUserBean.getUserBean(tokenValue);
        Memeber memberByid = indexService.findMemberByid(memberId,tokenValue);
        String mobile = memberByid.getMobile();
        UserVo userVo = new UserVo();
        userVo.setId(String.valueOf(memberId));
        userVo.setName(mobile);
        return userVo;
    }
    //小额
    @RequestMapping(value = "/xiaoe",method = RequestMethod.GET)
    public String xiaoe(){
        return "redirect:http://10.12.159.30:10021/xiaoe";
    }
    //大额
    @RequestMapping(value = "/dae",method = RequestMethod.GET)
    public String dae(){
        return "redirect:http://10.12.159.66:10023/dae";
    }
    //注册
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(){return "redirect:http://10.12.159.124:8050/login";}
    //登陆
    @RequestMapping(value = "/zhuce",method = RequestMethod.GET)
    public String zhuce(){return "redirect:http://10.12.159.124:8050/sso/register/toRegister.action";}
    //user
    @RequestMapping("/user")
    @ResponseBody
    public Principal user(Principal user) {
        return user;
    }
    @RequestMapping("/tuichu")
    public String tuichu(){
        return "redirect:http://10.12.159.124:8050/logout";
    }
    @RequestMapping("/wenjuan")
    public String wenjuan(){
        return "redirect:http://10.12.159.66:10023/wenjuan";
    }
}
