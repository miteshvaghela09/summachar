package com.example.summachar;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.NewsViewHolder> {

    private ArrayList<Newsdata> newsdata;
    public static class NewsViewHolder extends RecyclerView.ViewHolder {
        public TextView head;
        public ImageView imageView;
        public TextView name;
        public TextView desc;
        private TextView date;
        public NewsViewHolder(@NonNull View itemView) {
            super(itemView);
            head = itemView.findViewById(R.id.headline);
            imageView = itemView.findViewById(R.id.image);
            name = itemView.findViewById(R.id.name);
            desc = itemView.findViewById(R.id.description);
            date = itemView.findViewById(R.id.date);


        }
    }

    public NewsAdapter(ArrayList<Newsdata> newsdataArrayList){
        newsdata = newsdataArrayList;
    }
    @NonNull
    @Override
    public NewsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.example,parent,false);
        NewsViewHolder viewHolder = new NewsViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull NewsViewHolder holder, int position) {
            Newsdata newsdata1 = newsdata.get(position);
            holder.head.setText(newsdata1.getHeadline());
            holder.imageView.setImageResource(newsdata1.getImage());
            holder.name.setText(newsdata1.getText());
            holder.desc.setText(newsdata1.getDescription());
            holder.date.setText(newsdata1.getDate());


    }

    @Override
    public int getItemCount() {
        return newsdata.size();
    }




}
