package com.example.singleinstance;

/**
 * Created by zhangsheng on 2016/12/25.
 */

public class ApiClient2 {
    private static ApiClient2 apiClient2 = new ApiClient2();

    private ApiClient2() {
    }

    public static ApiClient2 getInstance() {
        return apiClient2;
    }

}
