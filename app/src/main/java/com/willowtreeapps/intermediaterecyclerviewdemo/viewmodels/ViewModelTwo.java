package com.willowtreeapps.intermediaterecyclerviewdemo.viewmodels;

import android.support.annotation.ColorRes;

public class ViewModelTwo implements ViewModel {

    private String text;
    private int colorRes;

    public ViewModelTwo(final String text, final @ColorRes int colorRes) {
        this.text = text;
        this.colorRes = colorRes;
    }

    public String getText() {
        return text;
    }

    public int getColorRes() {
        return colorRes;
    }
}
