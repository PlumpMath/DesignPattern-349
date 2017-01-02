package com.example.decoratorpattern;

/**
 * Created by zhangsheng on 2017/1/2.
 */

public class BookPageComponent implements PageComponent {
    @Override
    public void display(String content) {
        System.out.printf("展示书的内容：" + content+"\n");
    }
}
