package com.finance.www.utils;


import org.json.JSONObject;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * Created by Administrator on 2019/8/1.
 */
public class BankCardQuery {
    public static String getBankName(String bankCard) throws IOException {
        CloseableHttpClient httpClient= HttpClients.createDefault();
        String uri="http://apis.juhe.cn/bankcardcore/query?bankcard="+bankCard+"&key=3db55d14b6c2cd9b6dec55f2e38f46e4";
        HttpGet httpGet = new HttpGet(uri);
        CloseableHttpResponse response = httpClient.execute(httpGet);
        if(response.getStatusLine().getStatusCode()==200){
            HttpEntity entity = response.getEntity();
            String json = EntityUtils.toString(entity);
            try {
                JSONObject jsonObject = new JSONObject(json);
                if(json.indexOf("null")<0) {
                    JSONObject result = jsonObject.getJSONObject("result");
                    String bankname = result.getString("bankname");

                    return bankname;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return "未知";
     }
    }

