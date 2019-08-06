package com.finance.www.utils;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

/**
 * Created by Administrator on 2019/8/1.
 */
public class GetUserBean {
    public static Integer getUserBean(String token) throws IOException {

        CloseableHttpClient httpClient= HttpClients.createDefault();
        String uri="http://10.12.159.124:8050/oauth/check_token?token="+token;
        HttpGet httpGet = new HttpGet(uri);
        CloseableHttpResponse response = httpClient.execute(httpGet);
        if(response.getStatusLine().getStatusCode()==200){
            HttpEntity entity = response.getEntity();
            String json = EntityUtils.toString(entity);
            try {
                JSONObject jsonObject = new JSONObject(json);
                String user_name = jsonObject.getString("user_name");
                return Integer.parseInt(user_name);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return 2;
    }
}
