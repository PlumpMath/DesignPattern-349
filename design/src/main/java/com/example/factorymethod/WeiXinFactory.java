package com.example.factorymethod;

/**
 * Created by zhangsheng on 2016/12/25.
 */

public class WeiXinFactory extends IBookFactory2 {
    @Override
    public IBook makeBook() {
        return new WeiXinBook();
    }
}
