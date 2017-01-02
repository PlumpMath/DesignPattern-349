package com.example.decoratorpattern;

/**
 * Created by zhangsheng on 2017/1/2.
 */

public class CalendarBookPageDecorator extends PageDecorator {
    public CalendarBookPageDecorator(PageComponent pageComponent) {
        super(pageComponent);
    }

    @Override
    public void display(String content) {
        super.display(content);
        addDateWidget();
    }

    private void addDateWidget() {
        System.out.printf("添加日历控件\n");
    }
}
