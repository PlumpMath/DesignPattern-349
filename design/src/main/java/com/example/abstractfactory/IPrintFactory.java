package com.example.abstractfactory;

/**
 * Created by zhangsheng on 2016/12/25.
 */

public interface IPrintFactory {
    ICalendar makeCalendar();

    ITimeBook makeTimeBook();

}
