package com.example.simplefactory;

/**
 * Created by zhangsheng on 2016/12/24.
 */

public class WeiXinBook extends IBook {
    @Override
    void generate() {
        System.out.println("生成了一本微信书");
    }
}
