package com.example.builderpattern.entity;

/**
 * Created by zhangsheng on 2016/12/31.
 */

public class PageObj {
    private String title;
    private String cover;
    private WidgetObj widgetObj;
    private String content;
    private String backCover;

    public PageObj(String title) {
        this.title = title;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public WidgetObj getWidgetObj() {
        return widgetObj;
    }

    public void setWidgetObj(WidgetObj widgetObj) {
        this.widgetObj = widgetObj;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getBackCover() {
        return backCover;
    }

    public void setBackCover(String backCover) {
        this.backCover = backCover;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
