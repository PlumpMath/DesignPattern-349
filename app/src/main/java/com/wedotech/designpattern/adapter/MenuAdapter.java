package com.wedotech.designpattern.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.wedotech.designpattern.R;
import com.wedotech.designpattern.entity.MenuObj;

import java.util.ArrayList;

/**
 * Created by zhsheng26 on 2016/10/30.
 */

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MenuViewHolder> {

    private final ArrayList<MenuObj> menuObjs;

    public MenuAdapter() {
        menuObjs = new ArrayList<>();
        menuObjs.add(new MenuObj("策略", 1, R.drawable.ic_menu_camera));
        menuObjs.add(new MenuObj("观察者", 2, R.drawable.ic_menu_gallery));
        menuObjs.add(new MenuObj("装饰着", 3, R.drawable.ic_menu_manage));
        menuObjs.add(new MenuObj("工厂", 4, R.drawable.ic_menu_send));
    }

    @Override
    public MenuViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MenuViewHolder(View.inflate(parent.getContext(), R.layout.item_menu, null));
    }

    @Override
    public void onBindViewHolder(MenuViewHolder holder, int position) {
        MenuObj menuObj = menuObjs.get(position);
        holder.imageView.setImageResource(menuObj.getMenuIcon());
        holder.textView.setText(menuObj.getMenuTitle());
    }

    @Override
    public int getItemCount() {
        return menuObjs.size();
    }

    class MenuViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView;

        public MenuViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.iv_design);
            textView = (TextView) itemView.findViewById(R.id.tv_design);
        }
    }
}
