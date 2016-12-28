package com.example.facadepattern;

/**
 * Created by zhangsheng on 2016/12/28.
 */

public class Client {
    public static void main(String[] args) {
        IMakePresenter makePresenter = new MakeBookPresenter();
        makePresenter.generate(new BookObj("湄公河行动"));

    }
}
