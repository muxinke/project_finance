package com.finance.www.controller;

import com.finance.www.pojo.Memeber;
import com.finance.www.service.MainService;
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
import java.util.List;

/**
 * Created by lenovo-pc on 2019/7/24.
 */
@Controller
public class UserController {

    @Autowired
    private MainService mainService;
    @RequestMapping("/main")
    public String toMain(){

        return "main";
    }
    @RequestMapping("/user")
    public String toUser(Model model,
                         @RequestParam(defaultValue = ".",value = "info")String info,
                         @RequestParam(required = false,defaultValue = "1",value = "pn")Integer pn){
        //分页
        if(info.equals(".")){
            PageHelper.startPage(pn, 6);
            List<Memeber> all = mainService.findAll();
            PageInfo<Memeber>  p = new PageInfo<>(all);
            model.addAttribute("alluser",all);
            model.addAttribute("pageInfo", p);
            return "user";
        }
            PageHelper.startPage(pn, 6);
            List<Memeber> all = mainService.selectUser(info);
            PageInfo<Memeber>  p = new PageInfo<>(all);
            model.addAttribute("info",info);
            model.addAttribute("alluser",all);
            model.addAttribute("pageInfo", p);

            return "user";


    }
    @RequestMapping("/add")
    public String addJm(){

        return "add";
    }
    @RequestMapping("/addcg")
    public String addUser(Model model,Memeber memeber){
        int i = mainService.addUser(memeber);
        if(i==0){
            model.addAttribute("no","添加失败");
            return "add";
        }
        model.addAttribute("ok","添加成功");
        return "add";
    }
    @RequestMapping("/delete")
    @ResponseBody
    public int delUser(@RequestParam("id") int id){
        int i = mainService.delUser(id);
        System.out.println(i+"11111111111");
        return i;
    }
    @RequestMapping("/edit")
    public String edUser(HttpSession session,Model model,@RequestParam("id")int id){
        Memeber memeber = mainService.selectUserById(id);
        model.addAttribute("eduser",memeber);
        session.setAttribute("id",id);
        return "edit";
    }
    @RequestMapping(value = "edituser",method = RequestMethod.POST)
    public String editUser(HttpSession session,
                           @RequestParam("username")String username,
                           @RequestParam("password")String password,
                           @RequestParam("mobile")String moblie,
                           @RequestParam("email") String email){
        Integer id = (Integer) session.getAttribute("id");
        Memeber memeber = new Memeber();
        memeber.setId(id);
        memeber.setUsername(username);
        memeber.setPassword(password);
        memeber.setMobile(moblie);
        memeber.setEmail(email);
        int i = mainService.edUser(memeber);
        if(i==1){
            return "redirect:/user";
        }
        return "user";
    }


}
