package com.example.factorymethod;

/**
 * Created by zhangsheng on 2016/12/25.
 */

public class Client {
    public static void main(String[] args) {
        CalendarFactory calendarFactory = new CalendarFactory();
        IBook book = calendarFactory.makeBook();
        book.generate();
        WeiXinFactory factory = new WeiXinFactory();
        factory.generateBook();
    }
}
