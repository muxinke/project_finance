package com.finance.www.controller;

import com.finance.www.service.LoanService;
import com.finance.www.utils.AliyunOssUtils;
import com.finance.www.utils.DeleteFileUtil;
import com.finance.www.vox.AddBigLoan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

/**
 * Created by Administrator on 2019/7/24.
 */
@Controller
public class LargeLoansController {
    @Autowired
    private LoanService loanService;
    @GetMapping("/wenjuan")
    public String wenjuan(){
        return "wenjuan";
    }
    @GetMapping("/daexx")
    public String daexx(@RequestParam("age")int age, @RequestParam("work")int work,
                        @RequestParam("income")int income, @RequestParam("nomoney")int nomoney,
                        @RequestParam("guarantee")int guarantee, @RequestParam("debt")int debt,
                        @RequestParam("loantime")int loantime, Model model){
        int sum=age+work+income+nomoney+guarantee+debt+loantime;//7-28
        //查询用户id
        Integer uid=2;
        long edu=0;
        //根据用户id修改其贷款额度
        if(sum<10){//贷款额度为10万
            edu=100000;
        }else if(sum<14){//贷款额度为50万
            edu=500000;
        }else if(sum>14){//贷款额度为100万
            edu=1000000;
        }else if(sum>21){//贷款额度为1000万
            edu=10000000;
        }
        model.addAttribute("edu",edu);
        loanService.dae(uid,edu);
        return "dae";
    }
    @GetMapping("/dae")
    public String dae(Model model){
        long edu=100000;
        model.addAttribute("edu",edu);
        return "dae";
    }
    @PostMapping("/dae2")
    public String dae2(@RequestParam("amount")long amount,@RequestParam("xingzhi")Integer xingzhi,
                       @RequestParam("qixian")Integer qixian,@RequestParam("paymethod")Integer paymethod,
                       Model model){
        System.out.println("amount = " + amount);
        System.out.println("use = " + xingzhi);
        System.out.println("qixian = " + qixian);
        System.out.println("paymethod = " + paymethod);
        model.addAttribute("amount",amount);
        model.addAttribute("xingzhi",xingzhi);
        model.addAttribute("qixian",qixian);
        model.addAttribute("paymethod",paymethod);

        return "dae2";
    }
    @PostMapping("/upload")
    @ResponseBody
    public String uploadBlog(MultipartHttpServletRequest request,
                            AddBigLoan addBigLoan){
       // System.out.println("addBigLoan = " +addBigLoan);
        ArrayList<AddBigLoan> list = new ArrayList<>();
        //查询当前用户id
        int memberId=2;
        //默认state为0---未审核
        //addBigLoan.setState(0);
        /**********************************************************/
        String code="";
        String newFileName = null;
        AliyunOssUtils ossUtils = new AliyunOssUtils();
        Iterator<String> fileNames = request.getFileNames();
        try {
            while (fileNames.hasNext()) {
                System.out.println("第一次判断循环");
                //把fileNames集合中的值打出来
                String fileName=fileNames.next();
                System.out.println("fileName: "+fileName);
                /*
                 * request.getFiles(fileName)方法即通过fileName这个Key, 得到对应的文件
                 * 集合列表. 只是在这个Map中, 文件被包装成MultipartFile类型
                 */
                List<MultipartFile> fileList=request.getFiles(fileName);
                if (fileList.size()>0) {
                    System.out.println("第二次");
                    //遍历文件列表
                    Iterator<MultipartFile> fileIte=fileList.iterator();
                    while (fileIte.hasNext()) {
                        System.out.println("第三次");
                            /**构造对象传到提供者*/
                        AddBigLoan loan = new AddBigLoan();
                        loan.setMemberId(memberId);
                        loan.setXingzhi(addBigLoan.getXingzhi());
                        loan.setHowlong(addBigLoan.getHowlong());
                        loan.setPaymethod(addBigLoan.getPaymethod());
                        loan.setAmount(addBigLoan.getAmount());
                        //获得每一个文件
                        MultipartFile multipartFile = fileIte.next();
                        if (multipartFile != null) {
                            String filename = multipartFile.getOriginalFilename();
                            if (!"".equals(filename.trim())) {
                                File newFile = new File(filename);
                                FileOutputStream os = new FileOutputStream(newFile);
                                os.write(multipartFile.getBytes());
                                os.close();
                                multipartFile.transferTo(newFile);
                                // 上传到OSS
                                String uploadUrl = ossUtils.upLoad(newFile);
                                //url
                                newFileName= "http://dubitianoss.oss-cn-beijing.aliyuncs.com/"+uploadUrl;
                                loan.setImgUrl1(newFileName);

                                /**每一个对象的全部属性set进对象后,集合都要添加一次*/
                                list.add(loan);
                                System.err.println(uploadUrl);
                                // 删除上传的文件
                                File file1=new File("");
                                String s = file1.getAbsolutePath();
                                DeleteFileUtil.delete(s + "\\" + filename);
                            }

                        }
                    }

                }
            }
            int i =loanService.uploadBlog(list);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            System.out.println("最后");

        }
       /* return code;*/

        return "0";
    }
    @GetMapping("/daeshenhe")
    public String daeshenhe(){
        return "daeshenhe";
    }
    //按期付息到期还本
    @PostMapping("/query1")
    @ResponseBody
    public String query1(){
        return "";
    }
    //按月按期还款
    @PostMapping("/query2")
    @ResponseBody
    public String query2(){
        return "";
    }
    //到期全额还款
    @PostMapping("/query3")
    @ResponseBody
    public String query3(){
        return "";
    }

}
