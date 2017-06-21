package com.willowtreeapps.intermediaterecyclerviewdemo.viewholders;

import android.view.View;
import android.widget.TextView;

import com.willowtreeapps.intermediaterecyclerviewdemo.R;
import com.willowtreeapps.intermediaterecyclerviewdemo.viewmodels.ViewModelOne;

public class ViewHolderOne extends ViewHolder<ViewModelOne> {

    private final TextView text;

    public ViewHolderOne(final View itemView) {
        super(itemView);

        this.text = (TextView) itemView.findViewById(R.id.text);
    }

    @Override
    public void bindData(final ViewModelOne data) {
        text.setText(data.getText());
    }
}
