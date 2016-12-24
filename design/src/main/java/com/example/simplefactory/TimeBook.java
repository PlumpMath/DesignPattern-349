package com.example.simplefactory;

/**
 * Created by zhangsheng on 2016/12/24.
 */

public class TimeBook extends IBook {
    @Override
    void generate() {
        System.out.print("生成一本时光书");
    }
}
