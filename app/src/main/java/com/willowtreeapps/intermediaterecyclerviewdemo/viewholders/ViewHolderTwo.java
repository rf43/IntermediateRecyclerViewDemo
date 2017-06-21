package com.willowtreeapps.intermediaterecyclerviewdemo.viewholders;

import android.view.View;
import android.widget.TextView;

import com.willowtreeapps.intermediaterecyclerviewdemo.R;
import com.willowtreeapps.intermediaterecyclerviewdemo.viewmodels.ViewModelTwo;

public class ViewHolderTwo extends ViewHolder<ViewModelTwo> {

    private final View colorBox;
    private final TextView text;

    public ViewHolderTwo(final View itemView) {
        super(itemView);

        colorBox = itemView.findViewById(R.id.color_box);
        text = (TextView) itemView.findViewById(R.id.text);
    }

    @Override
    public void bindData(final ViewModelTwo data) {
        text.setText(data.getText());
        colorBox.setBackgroundColor(itemView.getResources().getColor(data.getColorRes()));
    }
}
