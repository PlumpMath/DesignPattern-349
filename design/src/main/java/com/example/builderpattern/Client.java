package com.example.builderpattern;

import com.example.builderpattern.entity.PageObj;

/**
 * Created by zhangsheng on 2016/12/31.
 */

public class Client {
    public static void main(String[] args) {
        PageDirector pageDirector = new PageDirector();
//        pageDirector.setPageBuilder(new BookPageBuilder());
        pageDirector.setPageBuilder(new CalendarPageBuilder());
        PageObj pageObj = pageDirector.builderPage();
        System.out.printf(pageObj.getTitle());
    }
}
