package com.example.decoratorpattern;

/**
 * Created by zhangsheng on 2017/1/2.
 */
//抽象装饰类
public class PageDecorator implements PageComponent {
    private PageComponent pageComponent;

    public PageDecorator(PageComponent pageComponent) {
        this.pageComponent = pageComponent;
    }

    @Override
    public void display(String content) {
        pageComponent.display(content);
    }
}
