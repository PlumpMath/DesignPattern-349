package com.example.adapterpattern;

/**
 * Created by zhangsheng on 2017/1/1.
 */

public class ImgObj implements BaseImgObj {
    private String path;

    private String createDate;

    @Override
    public String getPath() {
        return path;
    }

    @Override
    public String getCreateDate() {
        return createDate;
    }
}
