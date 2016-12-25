package com.example.abstractfactory;

/**
 * Created by zhangsheng on 2016/12/25.
 */

public class SimpleStyleTimeBook implements ITimeBook{
    @Override
    public void generate() {
        System.out.printf("生成一本简约风格栋时光书");
    }
}
