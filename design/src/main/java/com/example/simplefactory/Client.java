package com.example.simplefactory;

/**
 * Created by zhangsheng on 2016/12/24.
 */

public class Client {
    public static void main(String[] args) {
        IBook book = BookFactory.makeBook("timeBook");
        book.generate();
    }
}
