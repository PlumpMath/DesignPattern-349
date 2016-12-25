package com.example.factorymethod;

/**
 * Created by zhangsheng on 2016/12/25.
 */

public class WeiXinBook implements IBook{

    @Override
    public void generate() {
        System.out.printf("生成一本微信书");
    }
}
