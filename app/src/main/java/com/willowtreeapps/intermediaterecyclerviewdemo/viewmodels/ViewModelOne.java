package com.willowtreeapps.intermediaterecyclerviewdemo.viewmodels;

public class ViewModelOne implements ViewModel {

    private String text;

    public ViewModelOne(final String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
