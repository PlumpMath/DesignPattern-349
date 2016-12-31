package com.example.builderpattern;

import com.example.builderpattern.entity.PageObj;
import com.example.builderpattern.entity.WidgetObj;

/**
 * Created by zhangsheng on 2016/12/31.
 */

public class BookPageBuilder extends PageBuilder {
    private PageObj pageObj =new PageObj("这是书页面的标题");
    @Override
    public void setCoverPart(String title, String content, String cover, String backCover) {
        //对书的页面的一些内部信息的处理
        pageObj.setTitle(title);
        pageObj.setContent(content);
        pageObj.setCover(cover);
        pageObj.setBackCover(backCover);
    }

    @Override
    public void setWidgetPart(WidgetObj widgetObj) {
        //将对widget的复杂处理封装到这里，客户端不必关心了
        pageObj.setWidgetObj(widgetObj);
    }

    @Override
    public PageObj builder() {
        return pageObj;
    }
}
