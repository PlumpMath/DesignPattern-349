package com.example.strategypattern;

/**
 * Created by zhangsheng on 2017/1/6.
 */

public class BookObj {
    private AbstractStrategy priceStrategy;

    public BookObj(int bookType) {
        this.bookType = bookType;
    }

    public int getBookType() {
        return bookType;
    }

    public void setBookType(int bookType) {
        this.bookType = bookType;
    }

    private int bookType;

    public double getPrice() {
        return priceStrategy.calculate();
    }

    public void setPriceStrategy(AbstractStrategy strategy) {
        this.priceStrategy = strategy;
    }
}
