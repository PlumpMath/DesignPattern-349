package com.example.strategypattern;

/**
 * Created by zhangsheng on 2017/1/6.
 */

public class TimeBookStrategy extends AbstractStrategy {
    @Override
    protected double calculate() {
        System.out.printf("计算时光书的价格");
        return 200;
    }
}
