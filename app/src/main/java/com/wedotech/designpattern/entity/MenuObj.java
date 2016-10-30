package com.wedotech.designpattern.entity;

import android.support.annotation.DrawableRes;

/**
 * Created by zhsheng26 on 2016/10/30.
 */

public class MenuObj {
    private String menuTitle;
    private int menuId;
    private @DrawableRes int menuIcon;

    public MenuObj(String menuTitle) {
        this.menuTitle = menuTitle;
    }

    public MenuObj(String menuTitle, int menuId, int menuIcon) {
        this.menuTitle = menuTitle;
        this.menuId = menuId;
        this.menuIcon = menuIcon;
    }

    public String getMenuTitle() {
        return menuTitle;
    }

    public void setMenuTitle(String menuTitle) {
        this.menuTitle = menuTitle;
    }

    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    public int getMenuIcon() {
        return menuIcon;
    }

    public void setMenuIcon(int menuIcon) {
        this.menuIcon = menuIcon;
    }
}
