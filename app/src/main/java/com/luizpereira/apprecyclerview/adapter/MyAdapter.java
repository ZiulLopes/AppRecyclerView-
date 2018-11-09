package com.luizpereira.apprecyclerview.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.luizpereira.apprecyclerview.R;
import com.luizpereira.apprecyclerview.model.ListItem;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private List<ListItem> listItems;
    private Context context;

    public MyAdapter(List<ListItem> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.list_item, viewGroup,false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        ListItem listItem = listItems.get(i);

        viewHolder.textViewheading.setText(listItem.getHeading());
        viewHolder.textViewdescription.setText(listItem.getDescription());
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView textViewheading;
        public TextView textViewdescription;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewheading = (TextView)itemView.findViewById(R.id.heading);
            textViewdescription = (TextView)itemView.findViewById(R.id.description);
        }
    }
}
