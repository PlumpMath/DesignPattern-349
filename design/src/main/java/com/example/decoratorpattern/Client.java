package com.example.decoratorpattern;

/**
 * Created by zhangsheng on 2017/1/2.
 */

public class Client {
    public static void main(String[] args) {
        PageComponent pageComponent = new BookPageComponent();
        BookPageDecorator pageDecorator = new BookPageDecorator(pageComponent);
        CalendarBookPageDecorator calendarBookPageDecorator = new CalendarBookPageDecorator(pageDecorator);
        pageDecorator.display("设计模式");
        System.out.printf("============\n");
        calendarBookPageDecorator.display("设计模式");
    }
}
