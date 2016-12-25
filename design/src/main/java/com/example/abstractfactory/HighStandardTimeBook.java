package com.example.abstractfactory;

/**
 * Created by zhangsheng on 2016/12/25.
 */

public class HighStandardTimeBook implements ITimeBook {
    @Override
    public void generate() {
        System.out.printf("生成一本高配栋时光书");
    }
}
