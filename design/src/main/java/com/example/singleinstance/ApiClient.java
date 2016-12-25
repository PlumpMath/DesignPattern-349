package com.example.singleinstance;

/**
 * Created by zhangsheng on 2016/12/25.
 */

public class ApiClient {
    private ApiClient() {
    }

    private static class ApiHolder {
        private final static ApiClient apiclient = new ApiClient();
    }

    public static ApiClient getInstance() {
        return ApiHolder.apiclient;
    }

}
