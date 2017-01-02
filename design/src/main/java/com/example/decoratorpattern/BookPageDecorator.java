package com.example.decoratorpattern;

/**
 * Created by zhangsheng on 2017/1/2.
 */

public class BookPageDecorator extends PageDecorator {
    public BookPageDecorator(PageComponent pageComponent) {
        super(pageComponent);
    }

    @Override
    public void display(String content) {
        setupBookContentStyle();
        super.display(content);
    }

    private void setupBookContentStyle() {
        System.out.printf("设置背景风格\n");
    }
}
