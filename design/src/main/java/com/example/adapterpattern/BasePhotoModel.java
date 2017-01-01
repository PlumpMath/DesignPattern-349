package com.example.adapterpattern;

import java.net.URI;

/**
 * Created by zhangsheng on 2017/1/1.
 */

public interface BasePhotoModel {
    String getPath();
    String getCreateDate();
    String getLocalPath();
    URI getUri();
}
