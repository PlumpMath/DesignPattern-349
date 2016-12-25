package com.example.singleinstance;

/**
 * Created by zhangsheng on 2016/12/25.
 */

public class ApiClient1 {

    private static ApiClient1 apiClient1;

    private ApiClient1() {
    }

    public static ApiClient1 getInstance() {
        if (apiClient1 == null) {
            apiClient1 = new ApiClient1();
        }
        return apiClient1;
    }

}
