package com.finance.www.testhttp;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by Administrator on 2019/8/1.
 */
public class TestHttp {
    @Test
    public void test() throws IOException {
        CloseableHttpClient httpClient= HttpClients.createDefault();
        String uri="http://apis.juhe.cn/bankcardcore/query?bankcard=6212261704002783237&key=3db55d14b6c2cd9b6dec55f2e38f46e4";
        HttpGet httpGet = new HttpGet(uri);
        CloseableHttpResponse response = httpClient.execute(httpGet);
        if(response.getStatusLine().getStatusCode()==200){
            HttpEntity entity = response.getEntity();
            String s = EntityUtils.toString(entity);
            try {
                JSONObject jsonObject = new JSONObject(s);
                JSONObject result = jsonObject.getJSONObject("result");
                String bankname = result.getString("bankname");
                System.out.println("bankname = " + bankname);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
    }
