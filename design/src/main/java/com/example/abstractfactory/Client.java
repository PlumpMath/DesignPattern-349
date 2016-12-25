package com.example.abstractfactory;

/**
 * Created by zhangsheng on 2016/12/25.
 */

public class Client {
    public static void main(String[] args) {
//        IPrintFactory printFactory = new SimpleStylePrintFactory();
        IPrintFactory printFactory = new HighStandardFactory();
        ICalendar calendar = printFactory.makeCalendar();
        calendar.generate();
        System.out.printf("\n");
        ITimeBook timeBook = printFactory.makeTimeBook();
        timeBook.generate();
    }
}
