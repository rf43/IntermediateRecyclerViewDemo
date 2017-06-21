package com.willowtreeapps.intermediaterecyclerviewdemo.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;

public abstract class ViewHolder<ViewModel> extends RecyclerView.ViewHolder {

    ViewHolder(final View itemView) {
        super(itemView);
    }

    public abstract void bindData(final ViewModel data);
}
