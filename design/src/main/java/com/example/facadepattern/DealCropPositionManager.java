package com.example.facadepattern;

/**
 * Created by zhangsheng on 2016/12/28.
 */
//子系统：处理裁剪坐标
public class DealCropPositionManager {
    public void dealCropPosition(BookObj bookObj){
        System.out.printf("处理"+bookObj.getBookName()+"里面的图片裁剪坐标\n");
    }
}
