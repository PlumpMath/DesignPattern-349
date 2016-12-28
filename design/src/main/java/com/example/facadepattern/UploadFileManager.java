package com.example.facadepattern;

/**
 * Created by zhangsheng on 2016/12/28.
 */
//子系统：上传图片
public class UploadFileManager {
    public void uploadfile(BookObj bookObj){
        System.out.printf("上传"+bookObj.getBookName()+"\n");
    }
}
