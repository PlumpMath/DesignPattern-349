package com.example.strategypattern;

/**
 * Created by zhangsheng on 2017/1/6.
 */

public class CalendarBookStrategy extends AbstractStrategy {
    @Override
    protected double calculate() {
        System.out.printf("计算台历的价格");
        return 100;
    }
}
