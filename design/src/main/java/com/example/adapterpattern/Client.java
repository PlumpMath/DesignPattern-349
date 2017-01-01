package com.example.adapterpattern;

/**
 * Created by zhangsheng on 2017/1/1.
 */

public class Client {
    public static void main(String[] args) {
        ImgObj imgObj = new ImgObj();
        //当前老版本只有ImgObj,而要使用新类库，需要的是PhotoModel
        BasePhotoModel photoModelAdapter = new PhotoModelAdapter(imgObj);
        compressPicture(photoModelAdapter);

    }

    public static void compressPicture(BasePhotoModel photoModel) {
        System.out.printf("压缩图片" + photoModel.getPath());
    }
}
