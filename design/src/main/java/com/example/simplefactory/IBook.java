package com.example.simplefactory;

/**
 * Created by zhangsheng on 2016/12/24.
 */

public abstract class IBook {
    private String bookName;
    private String bookContent;
    private int price;

    abstract void generate();

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookContent() {
        return bookContent;
    }

    public void setBookContent(String bookContent) {
        this.bookContent = bookContent;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
