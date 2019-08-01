package com.finance.www.oauth_server_8050.controller;

import com.finance.www.enums.StatusCodeEnum;
import com.finance.www.oauth_server_8050.mapper.MemberLimitMapper;
import com.finance.www.oauth_server_8050.service.MemberLimitService;
import com.finance.www.oauth_server_8050.service.MemeberService;
import com.finance.www.oauth_server_8050.utils.AliyunSmsUtils;
import com.finance.www.pojo.MemberLimit;
import com.finance.www.pojo.Memeber;
import com.finance.www.pojo.MemeberExample;
import com.finance.www.utils.ResponseResult;
import com.finance.www.utils.RestResponseUtil;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.security.Principal;
import java.util.List;

/**
 * @author ：邓一凡
 * @date ：Created in 2019/6/29 11:24
 * @description ： 登陆页面
 */
@RestController
@RequestMapping("sso")
public class LoginRestController {

    private static final String SESSION_SMS_VERIFICATION_CODE = "SMSVerificationCode";

    @Autowired
    private MemeberService memeberService;

//    /**
//     * 退出登录
//     *
//     * @return RestResponseUtil
//     */
//    @GetMapping("/newLogin/logout.go")
//    public Token logOut() {
//        Token baiqi = tokenService.getToken("baiqi", "123456", "password",
//                "myapp", "all", "lxapp");
//
//        System.err.println("baiqi = " + baiqi);
//        return baiqi;
//    }

    /**
     * 注册页面
     *
     * @return RestResponseUtil
     */
    @GetMapping("/register/toRegister.action")
    public ModelAndView toRegister() {

        return new ModelAndView("zhuce");

    }


    /**
     * 标题栏用户信息
     *
     * @return RestResponseUtil
     */
    @PostMapping("newLogin/headerLogin.action")
    public ResponseResult headerLogin(Principal principal) {
        String name = principal.getName();
        if (StringUtils.isNotBlank(name)) {
            Memeber memeber = memeberService.selectByPrimaryKey(Integer.parseInt(name));
            return new ResponseResult<>(HttpStatus.OK.value(), memeber.getUsername());
        } else {
            return new ResponseResult<>(HttpStatus.NOT_FOUND.value());
        }
    }

    /**
     * 验证手机号邮箱是否用过
     * 成功0
     *
     * @param username 用户名 7
     * @param phone    手机号 4
     * @param email    邮箱 6
     * @return 4|6|0|7
     */
    @PostMapping("/register/checkInfo.action")
    public String checkInfo(String phone, String email, String username) {
        try {

            MemeberExample memeberExample = new MemeberExample();
            memeberExample.createCriteria().andMobileEqualTo(phone);

            MemeberExample memeberExample2 = new MemeberExample();
            memeberExample2.createCriteria().andEmailEqualTo(email);

            MemeberExample memeberExample3 = new MemeberExample();
            memeberExample3.createCriteria().andUsernameEqualTo(username);
            List<Memeber> memebers = memeberService.selectByExample(memeberExample);
            List<Memeber> memebers2 = memeberService.selectByExample(memeberExample2);
            List<Memeber> memebers3 = memeberService.selectByExample(memeberExample3);


            String uu = "0";
            if (memebers3.size() != 0) {
                uu = "7";
            }
            if (memebers.size() != 0) {
                uu = "4";
            }
            if (memebers2.size() != 0) {
                uu = "6";
            }

            return uu;
        } catch (Exception e) {
            e.printStackTrace();
            return "-1";
        }
    }


    @Autowired
    MemberLimitMapper limitService;

    /**
     * 注册
     *
     * @param session         session
     * @param username        用户名
     * @param paypassword     用户确认密码
     * @param password        用户密码
     * @param phone           手机号
     * @param email           邮箱
     * @param phoneVerifyCode 短信验证码
     * @return RestResponseUtil
     */
    @PostMapping("/register/register.action")
    public RestResponseUtil registered(String username, HttpSession session, String paypassword, String password, String phone, String email, @RequestParam(value = "phoneVerifyCode", defaultValue = "0") int phoneVerifyCode) {
        System.err.println("username = " + username);

        if (StringUtils.isBlank(username)) {
            return new RestResponseUtil("用户名不能为空", StatusCodeEnum.ERROR);
        }
        if (StringUtils.isBlank(phone)) {
            return new RestResponseUtil("手机号不能为空", StatusCodeEnum.ERROR);
        }
        if (StringUtils.isBlank(password)) {
            return new RestResponseUtil("密码不能为空", StatusCodeEnum.ERROR);
        }
        if (!password.equals(paypassword)) {
            return new RestResponseUtil("两次输入密 码不一致", StatusCodeEnum.ERROR);
        }
        if (StringUtils.isBlank(email)) {
            return new RestResponseUtil("邮箱不能为空", StatusCodeEnum.ERROR);
        }
        if (phoneVerifyCode == 0) {
            return new RestResponseUtil("短信验证码不能为空", StatusCodeEnum.ERROR);
        }
        //        此处验证短信验证码
        int attribute = (Integer) session.getAttribute(SESSION_SMS_VERIFICATION_CODE);
        if (!(attribute == phoneVerifyCode)) {
            System.err.println("attribute = " + attribute);
            System.err.println("phoneVerifyCode = " + phoneVerifyCode);
            return new RestResponseUtil("短信验证码错误", StatusCodeEnum.ERROR);
        }
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String psw = passwordEncoder.encode(password);
        Memeber memeber = new Memeber();
        memeber.setPassword(psw);
        memeber.setMobile(phone);
        memeber.setEmail(email);
        memeber.setUsername(username);
        int i = memeberService.insertSelective(memeber);

        Integer id = memeber.getId();

        MemberLimit memberLimit = new MemberLimit();

        memberLimit.setId(id);
        memberLimit.setEdu(450000L);
        limitService.insert(memberLimit);
        return new RestResponseUtil("成功 = " + i, StatusCodeEnum.SUCCESS);
    }

    /**
     * 手机验证码
     * code
     *
     * @param phone 手机号
     */
    @PostMapping("/register/registerSendBindPhoneCode.action")
    public void registerSendBindPhoneCode(String phone, HttpSession session) {
        System.err.println("phone = " + phone);
        Integer s = AliyunSmsUtils.SendSMSVerificationCode(phone);
        System.err.println("s = " + s);
        session.setAttribute(SESSION_SMS_VERIFICATION_CODE, s);
    }

/*    //找回密码接口
        $.ajax({
        type: "post",
                url: "/newLogin/findPwd.action",
                data: {
            verificationCode: verifyCode,
                    findphone: phone,
                    findpwd: password,*/

}
