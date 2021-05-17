package com.fff.demo.util;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class ApiUtil {

    public static String getApi(){
        String url = "https://meilin.siginfo.cn/api/goods";
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet get = new HttpGet(url);
        CloseableHttpResponse response = null;
        String jsonTxt = null;
        try {
            response = httpClient.execute(get);
            if (response.getStatusLine().getStatusCode()==200){
                HttpEntity httpEntity = response.getEntity();
                jsonTxt = EntityUtils.toString(httpEntity,"utf8");

            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                response.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return jsonTxt;
    }
}
