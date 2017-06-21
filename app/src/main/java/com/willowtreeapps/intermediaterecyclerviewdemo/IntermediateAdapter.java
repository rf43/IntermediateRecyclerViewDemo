package com.willowtreeapps.intermediaterecyclerviewdemo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.willowtreeapps.intermediaterecyclerviewdemo.viewholders.ViewHolder;
import com.willowtreeapps.intermediaterecyclerviewdemo.viewholders.ViewHolderOne;
import com.willowtreeapps.intermediaterecyclerviewdemo.viewholders.ViewHolderTwo;
import com.willowtreeapps.intermediaterecyclerviewdemo.viewmodels.ViewModel;
import com.willowtreeapps.intermediaterecyclerviewdemo.viewmodels.ViewModelOne;

import java.util.ArrayList;
import java.util.List;

public class IntermediateAdapter extends RecyclerView.Adapter<ViewHolder> {

    private static final int LAYOUT_ONE = R.layout.item_layout_one;
    private static final int LAYOUT_TWO = R.layout.item_layout_two;

    private List<ViewModel> models = new ArrayList<>();

    IntermediateAdapter(final List<ViewModel> viewModels) {
        if (viewModels != null) {
            this.models.addAll(viewModels);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {
        final View view = LayoutInflater.from(parent.getContext()).inflate(viewType, parent, false);

        switch (viewType) {
            case LAYOUT_ONE:
                return new ViewHolderOne(view);
            case LAYOUT_TWO:
            default:
                return new ViewHolderTwo(view);
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        holder.bindData(models.get(position));
    }

    @Override
    public int getItemCount() {
        return models.size();
    }

    @Override
    public int getItemViewType(final int position) {
        // We will just assume only one or the other here
        if (models.get(position) instanceof ViewModelOne) {
            return LAYOUT_ONE;
        } else {
            return LAYOUT_TWO;
        }
    }
}
