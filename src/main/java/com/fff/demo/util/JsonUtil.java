package com.fff.demo.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Component;

import java.util.Iterator;
import java.util.Set;


public class JsonUtil {
    public JsonUtil() {
    }
    //用来获取字段名，封装成实体类
    //获取jsonArray中jsonObject所有key
    public static void getArrayKey(JSONArray arr,int index){
        Set<String> set = arr.getJSONObject(index).keySet();
        Iterator keys = set.iterator();

        while (keys.hasNext()) {
            String key = String.valueOf(keys.next());
            System.out.println(key);
        }
    }

    //获取jsonObject所有key
    public static void getObjectKey(JSONObject obj){
        Set<String> set = obj.keySet();
        Iterator keys = set.iterator();

        while (keys.hasNext()) {
            String key = String.valueOf(keys.next());
            System.out.println(key);
        }
    }
}
