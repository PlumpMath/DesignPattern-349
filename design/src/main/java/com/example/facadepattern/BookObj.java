package com.example.facadepattern;

import java.util.List;

/**
 * Created by zhangsheng on 2016/12/28.
 */

public class BookObj {
    private String bookId;
    private String bookName;
    private List<String> imgs;

    public BookObj(String bookName) {
        this.bookName =bookName;
    }


    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public List<String> getImgs() {
        return imgs;
    }

    public void setImgs(List<String> imgs) {
        this.imgs = imgs;
    }
}
