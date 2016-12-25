package com.example.factorymethod;

/**
 * Created by zhangsheng on 2016/12/25.
 */

public class CalendarFactory implements IBookFactory {
    @Override
    public IBook makeBook() {
        return new CalendarBook();
    }
}
