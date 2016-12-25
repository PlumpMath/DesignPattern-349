package com.example.abstractfactory;

/**
 * Created by zhangsheng on 2016/12/25.
 */

public class HighStandardFactory implements IPrintFactory {
    @Override
    public ICalendar makeCalendar() {
        return new HighStandardCalendar();
    }

    @Override
    public ITimeBook makeTimeBook() {
        return new HighStandardTimeBook();
    }
}
