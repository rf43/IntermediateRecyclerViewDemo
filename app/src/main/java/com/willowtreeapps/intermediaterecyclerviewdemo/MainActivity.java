package com.willowtreeapps.intermediaterecyclerviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.willowtreeapps.intermediaterecyclerviewdemo.viewmodels.ViewModel;
import com.willowtreeapps.intermediaterecyclerviewdemo.viewmodels.ViewModelOne;
import com.willowtreeapps.intermediaterecyclerviewdemo.viewmodels.ViewModelTwo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final IntermediateAdapter adapter = new IntermediateAdapter(generateModels());
        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    private List<ViewModel> generateModels() {
        final List<ViewModel> outList = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            final String text = String.format(Locale.US, "This is item %d", i);

            if (i % 2 == 0) {
                outList.add(new ViewModelTwo(text, R.color.green));
            } else {
                outList.add(new ViewModelOne(text));
            }
        }

        return outList;
    }
}
