package com.luizpereira.apprecyclerview.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.luizpereira.apprecyclerview.R;
import com.luizpereira.apprecyclerview.adapter.MyAdapter;
import com.luizpereira.apprecyclerview.model.ListItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;

    private List<ListItem> listItens;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView)findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listItens = new ArrayList<>();

        for (int i = 0; i <= 10; i++){
            ListItem listItem = new ListItem(
                    "heading" + i + 1,
                    "Lorem ipsum dummy text..."
            );

            listItens.add(listItem);
        }

        adapter = new MyAdapter(listItens, this);

        recyclerView.setAdapter(adapter);
    }
}
