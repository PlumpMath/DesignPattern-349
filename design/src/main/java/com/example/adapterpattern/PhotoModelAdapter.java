package com.example.adapterpattern;

import java.net.URI;

/**
 * Created by zhangsheng on 2017/1/1.
 */

//老版本使用的是ImgObj,引用的第三方库或者新增的模块中使用的PhotoModel
public class PhotoModelAdapter implements BasePhotoModel {
    public PhotoModelAdapter(ImgObj imgObj) {
        this.imgObj = imgObj;
    }

    private final ImgObj imgObj;

    @Override
    public String getPath() {
        return imgObj.getPath();
    }

    @Override
    public String getCreateDate() {
        return imgObj.getCreateDate();
    }

    @Override
    public String getLocalPath() {
        return imgObj.getPath();
    }

    @Override
    public URI getUri() {
        return URI.create(imgObj.getPath());
    }
}
