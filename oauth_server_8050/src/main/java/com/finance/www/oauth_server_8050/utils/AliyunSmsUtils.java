package com.finance.www.oauth_server_8050.utils;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsRequest;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;


import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
import org.apache.commons.lang.StringUtils;


/**
 * Created by Administrator on 2019/6/29.
 */
public class AliyunSmsUtils {



    //以下为测试代码，随机生成验证码
    private static int newcode;

    private static int getNewcode() {
        return newcode;
    }

    private static void setNewcode() {
        newcode = (int) (Math.random() * 9999) + 100;  //每次调用生成一位四位数的随机数
    }



    public static Integer SendSMSVerificationCode(String phone) {
        setNewcode();
        Integer code = getNewcode();
        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", "LTAIfXwfbbRk2qCp", "KTTZHuuiplRZMIwQNJyqJlzkhtuHot");
        IAcsClient client = new DefaultAcsClient(profile);

        CommonRequest request = new CommonRequest();
        request.setMethod(MethodType.POST);
        request.setDomain("dysmsapi.aliyuncs.com");
        request.setVersion("2017-05-25");
        request.setAction("SendSms");
        request.putQueryParameter("RegionId", "cn-hangzhou");
        request.putQueryParameter("PhoneNumbers", phone);
        request.putQueryParameter("SignName", "伴我汽车");
        request.putQueryParameter("TemplateCode", "SMS_169113423");
        request.putQueryParameter("TemplateParam", "{\"code\":\""+code+"\"}");
        try {
            CommonResponse response = client.getCommonResponse(request);
            System.out.println(response.getData());
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            e.printStackTrace();
        }
        return code;
    }
}
