package com.example.abstractfactory;

/**
 * Created by zhangsheng on 2016/12/25.
 */

public class SimpleStylePrintFactory implements IPrintFactory {
    @Override
    public ICalendar makeCalendar() {
        return new SimpleStyleCalendar();
    }

    @Override
    public ITimeBook makeTimeBook() {
        return new SimpleStyleTimeBook();
    }
}
