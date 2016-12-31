package com.example.builderpattern;

import com.example.builderpattern.entity.PageObj;

/**
 * Created by zhangsheng on 2016/12/31.
 */

public class PageDirector {
    private PageBuilder pageBuilder;

    public void setPageBuilder(PageBuilder pageBuilder) {
        this.pageBuilder = pageBuilder;
    }

    public PageObj builderPage() {
        return pageBuilder.builder();
    }
}
