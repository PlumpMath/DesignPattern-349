package com.example.adapterpattern;

import java.net.URI;

/**
 * Created by zhangsheng on 2017/1/1.
 */

public class PhotoModel implements BasePhotoModel {

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

    @Override
    public String getLocalPath() {
        return path;
    }

    @Override
    public URI getUri() {
        return URI.create(path);
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
