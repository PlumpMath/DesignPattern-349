package com.example.simplefactory;

/**
 * Created by zhangsheng on 2016/12/24.
 */
//简单工厂
public class BookFactory {
    public static IBook makeBook(String bookType) {
        IBook book;
        if ("timeBook".equalsIgnoreCase(bookType)) {
            book = new TimeBook();
        } else if ("weiXinBook".equalsIgnoreCase(bookType)) {
            book = new WeiXinBook();
        } else {
            throw new RuntimeException("不支持制作这类书");
        }
        return book;
    }

}
