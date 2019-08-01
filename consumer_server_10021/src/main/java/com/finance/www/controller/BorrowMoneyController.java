
package com.finance.www.controller;

import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.finance.www.enums.ProduitEnum;
import com.finance.www.enums.RepaymentStateEnum;
import com.finance.www.pojo.MemberCard;
import com.finance.www.pojo.MemberLimit;
import com.finance.www.pojo.MemberRegister;
import com.finance.www.pojo.UserBean;
import com.finance.www.service.BorrowManageService;
import com.finance.www.service.BorrowMoneyService;
import com.finance.www.service.GetUserIdService;
import com.finance.www.service.MemberShiMingService;
import com.finance.www.utils.*;
import com.finance.www.vo.*;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.hssf.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.provider.authentication.OAuth2AuthenticationDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.security.Principal;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Administrator on 2019/7/24.
 */
@Slf4j
@Controller
public class BorrowMoneyController {
    @Autowired
    private BorrowMoneyService borrowMoneyService;
    @Autowired
    private BorrowManageService borrowManageService;
    @Autowired
    private MemberShiMingService memberShiMing;
    @Autowired
    private GetUserIdService getUserIdService;
/**
     * 跳转小额借款界面
     * @return
     */

    @GetMapping("xiaoe")
    public String xiaoe(Model model,HttpServletResponse response,HttpServletRequest request) throws IOException {
        /*String header = request.getHeader("Authorization");
        log.error("header{ }",header);*/
       /* SecurityContext securityContext = SecurityContextHolder.getContext();
        Authentication authentication = securityContext.getAuthentication();
        if (authentication != null && authentication.getDetails() instanceof OAuth2AuthenticationDetails) {
            OAuth2AuthenticationDetails details = (OAuth2AuthenticationDetails) authentication.getDetails();
            String tokenValue = details.getTokenValue();
            Cookie cookie = new Cookie("token",tokenValue);
            cookie.setPath("/");
            response.addCookie(cookie);
        }*/
        /**通过上下文得到token，写入cookie*/
        String tokenValue = GetDetailToken.getDetailToken();
        log.error("tokenValue:{}",tokenValue);
        Cookie cookie = new Cookie("token",tokenValue);
        cookie.setPath("/");
        response.addCookie(cookie);
        /**获取用户id*/
       Integer memberId = GetUserBean.getUserBean(tokenValue);
        log.error("memberId:{}",memberId);
      /*  Principal user = getUserIdService.user();
        String  memberId = user.getName();*/
        //根据用户id查找用户的借款额度，银行卡号
        MemberLimit memberLimit= borrowMoneyService.xiaoeMemberLimit(memberId);
        List<MemberCard> cards= borrowMoneyService.xiaoeMemberCard(memberId);
/**提交额度*/
        model.addAttribute("edu",((float)memberLimit.getShengyuedu())/100);
/**提交银行卡表*/

        List<String> lists = new ArrayList<>();
/**遍历用户银行号，将银行名称和卡号后四位拼在一起*/
        if(cards!=null){
            for(MemberCard memberCard: cards ){
                String line=memberCard.getBankcard().substring(memberCard.getBankcard().length()-4);
                lists.add(memberCard.getBankname()+line);
            }
            model.addAttribute("cards",lists);
        }
        return "xiaoe";
    }

/**
     * 小额借款提交
     * @param memberSmallBorrow 小额借款vo
     * @return
     */

    @PostMapping("borrowSubmit")
    public String borrowSubmit(MemberSmallBorrow memberSmallBorrow, HttpServletRequest request){
        Cookie token = CookiesUtil.getCookieByName(request, "token");
        if(token==null){
            return "redirect:http://10.12.159.124:8050/login";
        }
        String value = token.getValue();
        String Valetoken = "bearer "+value;
        /**查出当前用户id*/
       /* Principal user = getUserIdService.user();
        String  id = user.getName();
        int memberId=Integer.parseInt(id);*/
       int memberId=2;
        memberSmallBorrow.setMemberId(memberId);
        memberSmallBorrow.setIs_agreed(1);
        int code =borrowMoneyService.addSmallRecord(memberSmallBorrow,Valetoken);
        if(101==code){
            return "redirect:tishi1";
        }else if(102==code){
            return "redirect:tishi2";
        }
        return "xiaoe";
    }

/**
     * 本地
     * @return
     */

    @GetMapping("tishi1")
    public String tishi1(){
        return "tishi1";
    }

/**
     * 银行
     * @return
     */

    @GetMapping("tishi2")
    public String tishi2(){
        return "tishi2";
    }
/**
     * 等额本金
     * @param money 贷款金额
     * @param time 贷款时间
     * @return
     */
    @ApiOperation(value = "查询等额借款周期数" ,notes="根据借款金额，还款方式查询周期数")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "money",value = "借款金额",required = true, dataType = "String"),
            @ApiImplicitParam(name = "time",value = "借款时长",required = true, dataType = "int")
    })
    @PostMapping("querycpm")
    @ResponseBody
    public CpmVo querycpm(@RequestParam("borrow")String money,
                       @RequestParam("time")int time){
        CpmVo cpmVo = CpmMoneyUtils.getCpm(money, time, 0.012f);
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

/**
     * 跳转我的账户管理页面
     * @return
     */

    @GetMapping("zhanghuguanli")
    public String zhanghuguanli(){
        return "zhanghuguanli";
    }

/**
     * 跳转借款管理界面
     * @return
     */

    @GetMapping("jiekuanguanli")
    public String jiekuanguanli(){
        return "jiekuanguanli";
    }

/**
     * 跳转还款管理界面
     * @return
     */

    @GetMapping("huankuanjihua")
    public String huankuanjihua(){
        return "huankuanjihua";
    }

/**
     * 借款，申请中的借款记录
     * @return
     */
@Value("${myLilv}")
private String lilv;
    @GetMapping("apply")
    public String apply(int numPage,Model model,HttpServletRequest request){
        Cookie token = CookiesUtil.getCookieByName(request, "token");
        if(token==null){
            return "redirect:http://10.12.159.124:8050/login";
        }
        String value = token.getValue();
        String Valetoken = "bearer "+value;
/**用户id*/
       /* Principal user = getUserIdService.user();
        String  id = user.getName();
        int memberId=Integer.parseInt(id);*/
       int memberId =2;
/**查询申请中的借款记录,开启分页*/

        int pageSize=10;
        PageInfo<ApplyMoney> pageInfo = borrowManageService.list(memberId, 0, numPage, pageSize,Valetoken);
        ArrayList<ApplyMoney> vos = new ArrayList<>();
        if(pageInfo.getList().size()>0) {
            for (ApplyMoney applyMoney : pageInfo.getList()) {
                    applyMoney.setBiaoTi(ProduitEnum.getEnumType(Integer.parseInt(applyMoney.getBiaoTi())));
                    applyMoney.setLilv(lilv);
                    applyMoney.setQixian(applyMoney.getQixian());
                    applyMoney.setState(RepaymentStateEnum.getTypeName(Integer.parseInt(applyMoney.getState())));
                    applyMoney.setMoney(applyMoney.getMoney() / 100);
                    vos.add(applyMoney);
            }
            pageInfo.setList(vos);
        }

        model.addAttribute("applylist",pageInfo);

        return "apply";
    }

    /**
     * 点击分页按钮时的请求
     * @param currenPageNum  分页时的请求页数
     * @param model
     * @return
     */
    @PostMapping("apply")
    public String apply2(int currenPageNum,Model model,HttpServletRequest request){
        Cookie token = CookiesUtil.getCookieByName(request, "token");
        if(token==null){
            return "redirect:http://10.12.159.124:8050/login";
        }
        String value = token.getValue();
        String Valetoken = "bearer "+value;
        /**用户id*/
      /*  Principal user = getUserIdService.user();
        String  id = user.getName();
        int memberId=Integer.parseInt(id);*/
      int memberId=2;
        int pageSize=10;
        PageInfo<ApplyMoney> list = borrowManageService.list(memberId, 0, currenPageNum, pageSize,Valetoken);
        ArrayList<ApplyMoney> vos = new ArrayList<>();
        if(list.getList().size()>0) {
            for (ApplyMoney applyMoney : list.getList()) {
                applyMoney.setBiaoTi(ProduitEnum.getEnumType(Integer.parseInt(applyMoney.getBiaoTi())));
                applyMoney.setLilv(lilv);
                applyMoney.setQixian(applyMoney.getQixian());
                applyMoney.setState(RepaymentStateEnum.getTypeName(Integer.parseInt(applyMoney.getState())));
                applyMoney.setMoney(applyMoney.getMoney() / 100);
                vos.add(applyMoney);
            }
            list.setList(vos);
        }


        model.addAttribute("applylist",list);
        return "apply";
    }

/***
     * 借款，还款中的借款记录
     * @param type
     * @return
     */

    @GetMapping("huankuan")
    public String huankuan(String type){
/**查询还款中的借款记录*/

        return "huankuan";
    }

/**
     * 借款，已还清的借款
     * @return
     */

    @GetMapping("over")
    public String over(String type){
/**已还清的借款*/

        return "over";
    }

    /**
     * 跳转添加银行卡界面
     * @return
     */
    @GetMapping("bank")
    public String bank(Model model){
        /**获取用户id*/
       /* Principal user = getUserIdService.user();
        String  id = user.getName();
        int memberId=Integer.parseInt(id);*/
       int memberId =2;
        /**根据用户id查出用户的实名信息*/
        MemberRegister member = memberShiMing.getMember(memberId);

        model.addAttribute("liushuihao", SuiJiNumber.getNum());
        model.addAttribute("member",member);
        return "bank";
    }

    /**
     * 发送短信验证码
     * @return
     * @throws ClientException
     */
    @PostMapping("sendMa")
    @ResponseBody
    public String  sendMa(@RequestParam("phone")String phone) throws ClientException {
        /**随机数*/
        int codeInt = RandomCode.getCode();
        String code = Integer.toString(codeInt);

        /**发短信*/
        // TODO 填写你需要测试的手机号码
        SendSmsResponse response = SmsMode.sendSms(phone,code);
        System.out.println("Code=" + response.getCode());
        return code;
    }
    @PostMapping("subinfo")
    @ResponseBody
    public int subinfo(@RequestParam("bankcard")String bankcard,@RequestParam("bankName")String bankName){
        /**用户id*/
       /* Principal user = getUserIdService.user();
        String  id = user.getName();
        int memberId=Integer.parseInt(id);*/
       int memberId =2;
        int result =borrowMoneyService.insertCard(bankcard,bankName,memberId);
        return 101;
    }
    @PostMapping("checkCard")
    @ResponseBody
    public String checkCard(@RequestParam("bankcard")String bankCard) throws IOException {
        String bankName = BankCardQuery.getBankName(bankCard);
        return bankName;
    }
    /**
     * 生成excle表格
     * @param response
     * @return
     * @throws Exception
     */
    @GetMapping("getexcle")
    @ResponseBody
    public String  upload(HttpServletResponse response) throws Exception {
            int memberId=2;
        //创建Excel工作簿对象
        HSSFWorkbook workbook = new HSSFWorkbook();
        //创建Excel工作表对象
        HSSFSheet sheet = workbook.createSheet("统计表");
        createTitle(workbook,sheet);
        //查询所有数据
        List<ApplyMoney>  infos = borrowManageService.queryAll(memberId, 0);
        //List<Info> infos = infoService.queryAll();
        /*//设置时间单元格格式
        HSSFCellStyle cellStyle = workbook.createCellStyle();
        cellStyle.setDataFormat(HSSFDataFormat.getBuiltinFormat("m/d/yy h:mm"));*/
        int rowNum=1;
        for(ApplyMoney info : infos){
            HSSFRow row = sheet.createRow(rowNum);
            row.createCell(0).setCellValue(ProduitEnum.getEnumType(Integer.parseInt(info.getBiaoTi())));
            row.createCell(1).setCellValue(info.getMoney() / 100);
            row.createCell(2).setCellValue(lilv);
            row.createCell(3).setCellValue(info.getQixian());
            row.createCell(4).setCellValue(info.getShijian());
            row.createCell(5).setCellValue(RepaymentStateEnum.getTypeName(Integer.parseInt(info.getState())));
            /*//为创建时间的单元格赋单元格风格
            HSSFCell cell = row.createCell(4);
            cell.setCellValue(info.getCreateTime());
            cell.setCellStyle(cellStyle);*/
            rowNum++;
        }
        String fileName = new SimpleDateFormat("yyyy-MM-dd").format(new Date())+".xls";
        //生成excel文件
        buildExcelFile(fileName, workbook);
        //浏览器下载excel
        buildExcelDocument(fileName,workbook,response);
        return "download excel";
    }
    /**POI创建表头*/
    private void createTitle(HSSFWorkbook workbook, HSSFSheet sheet) {
        //创建Excel工作表的行
        HSSFRow row = sheet.createRow(0);
        //设置列宽，setColumnWidth的第二个参数要乘以256，这个参数的单位是1/256个字符宽度
        sheet.setColumnWidth(1, 12 * 256);
        sheet.setColumnWidth(3, 17 * 256);
        sheet.setColumnWidth(4, 17 * 256);
        //设置为居中加粗  风格
        HSSFCellStyle style = workbook.createCellStyle();
        //设置字体和内容位置
        HSSFFont font = workbook.createFont();
        font.setFontHeightInPoints((short) 16);//字号
        font.setBoldweight(HSSFFont.BOLDWEIGHT_NORMAL);//加粗
        font.setItalic(true);//设置文字为斜体
        style.setFont(font);
        HSSFCell cell;//创建单元格
        cell = row.createCell(0);
        cell.setCellValue("标题");
        cell.setCellStyle(style);
        cell = row.createCell(1);
        cell.setCellValue("金额(元)");
        cell.setCellStyle(style);
        cell = row.createCell(2);
        cell.setCellValue("年利率");
        cell.setCellStyle(style);
        cell = row.createCell(3);
        cell.setCellValue("期限（月）");
        cell.setCellStyle(style);
        cell=row.createCell(4);
        cell.setCellValue("发布时间");
        cell.setCellStyle(style);
        cell=row.createCell(5);
        cell.setCellValue("状态");
        cell.setCellStyle(style);
    }
    /**生成excel文件*/
    protected void buildExcelFile(String filename,HSSFWorkbook workbook) throws Exception{
        FileOutputStream fos = new FileOutputStream(filename);
        workbook.write(fos);
        fos.flush();
        fos.close();
    }
    /**浏览器下载excel*/
    protected void buildExcelDocument(String filename,HSSFWorkbook workbook,HttpServletResponse response) throws Exception{
        response.setContentType("application/vnd.ms-excel");
        response.setHeader("Content-Disposition", "attachment;filename="+ URLEncoder.encode(filename, "utf-8"));
        OutputStream outputStream = response.getOutputStream();
        workbook.write(outputStream);
        outputStream.flush();
        outputStream.close();
    }
}

