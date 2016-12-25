package com.example.abstractfactory;

/**
 * Created by zhangsheng on 2016/12/25.
 */

public class SimpleStyleCalendar implements ICalendar {
    @Override
    public void generate() {
        System.out.printf("生成一本简约风格的台历");
    }
}
