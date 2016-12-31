package com.example.builderpattern;

import com.example.builderpattern.entity.PageObj;
import com.example.builderpattern.entity.WidgetObj;

/**
 * Created by zhangsheng on 2016/12/31.
 */

public class CalendarPageBuilder extends PageBuilder {
    private PageObj pageObj = new PageObj("这是台历页面的标题");

    @Override
    public void setCoverPart(String title, String content, String cover, String backCover) {
        //对台历页面内部信息对一些处理
        pageObj.setTitle(title);
        pageObj.setContent(content);
        pageObj.setCover(cover);
        pageObj.setBackCover(backCover);
    }

    @Override
    public void setWidgetPart(WidgetObj widgetObj) {
        pageObj.setWidgetObj(widgetObj);
    }

    @Override
    public PageObj builder() {
        return pageObj;
    }
}
