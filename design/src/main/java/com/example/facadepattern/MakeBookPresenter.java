package com.example.facadepattern;

/**
 * Created by zhangsheng on 2016/12/28.
 */
//外观类
public class MakeBookPresenter implements IMakePresenter{

    private final UploadFileManager uploadFileManager;
    private final DealCropPositionManager cropPositionManager;
    private final ReqBookPdfManager reqBookPdfManager;

    public MakeBookPresenter(){
        uploadFileManager = new UploadFileManager();
        cropPositionManager = new DealCropPositionManager();
        reqBookPdfManager = new ReqBookPdfManager();
    }

    @Override
    public void generate(BookObj bookObj) {
        uploadFileManager.uploadfile(bookObj);
        cropPositionManager.dealCropPosition(bookObj);
        reqBookPdfManager.reqBookPdf(bookObj);
    }
}
