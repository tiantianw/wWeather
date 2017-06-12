package wshapp.myweather.util;
/*
**  Created by wsh on 2017/6/12  16:01.
**  Copyright (c) 2017-06-12 wsh All rights reserved.
**  e-mail: iamwsh@qq.com
*/


import okhttp3.OkHttpClient;
import okhttp3.Request;

public class HttpUtil {
public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
    OkHttpClient client=new OkHttpClient();
    Request request=new Request.Builder().url(address).build();
    client.newCall(request).enqueue(callback);
}
}
