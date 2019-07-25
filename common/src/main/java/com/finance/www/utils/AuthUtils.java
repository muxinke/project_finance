package com.finance.www.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.finance.www.pojo.Memeber;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.apache.commons.lang.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Member;
import java.util.List;

/**
 * @author ：邓一凡
 * @date ：Created in 2019/7/25 15:47
 * @description ：
 */

public class AuthUtils {

    private static final String HEADER = "Authorization";
    private static final String SEPARATOR = "bearer";
    private static final String CHARSET_NAME = "UTF-8";

    public static Memeber getReqUser(HttpServletRequest req) {

        String header = req.getHeader(HEADER);

        String token = StringUtils.substringAfter(header, SEPARATOR);

        Claims claims;

        try {

            claims = Jwts.parser().setSigningKey("SigningKey".getBytes(CHARSET_NAME)).parseClaimsJws(token).getBody();

        } catch (Exception e) {

            return null;

        }
        // 拿到当前用户
        //1、使用JSONObject
        List<Memeber> members = JSON.parseArray((String) claims.get("userinfo"),Memeber.class);
        Memeber memeber = members.get(0);
        return memeber;

    }

}

