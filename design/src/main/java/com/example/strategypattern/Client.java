package com.example.strategypattern;

/**
 * Created by zhangsheng on 2017/1/6.
 */

public class Client {

    public static final int TIME_BOOK_TYPE = 101;

    public static void main(String[] args) {
        BookObj bookObj = new BookObj(TIME_BOOK_TYPE);
        bookObj.setPriceStrategy(new TimeBookStrategy());
        double price = bookObj.getPrice();
        System.out.printf("书的价格：" + price);
    }
}
