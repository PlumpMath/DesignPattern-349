package com.example.builderpattern;

import com.example.builderpattern.entity.PageObj;
import com.example.builderpattern.entity.WidgetObj;

/**
 * Created by zhangsheng on 2016/12/31.
 */

public abstract class PageBuilder {
    public abstract void setCoverPart(String title, String content, String cover, String backCover);

    public abstract void setWidgetPart(WidgetObj widgetObj);

    public abstract PageObj builder();
}
