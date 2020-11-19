package com.example.spchadits;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Adapter_Chapter extends RecyclerView.Adapter<Adapter_Chapter.AuthorViewHolder> {

    private ArrayList<ItemChapter> mExampleList;

    public static class AuthorViewHolder extends RecyclerView.ViewHolder {

        public TextView textTlIndonesian;
        public TextView textTlArabic;
        //public TextView textScoreType;
        //public TextView textScoreSize;

        public AuthorViewHolder(@NonNull View itemView) {
            super(itemView);

            textTlIndonesian = itemView.findViewById(R.id.text1);
            textTlArabic = itemView.findViewById(R.id.text2);
            //textScoreType = itemView.findViewById(R.id.text2);
            //textScoreSize = itemView.findViewById(R.id.text3);
        }
    }

    @NonNull
    @Override
    public AuthorViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_chapter, parent, false);
        AuthorViewHolder evh = new AuthorViewHolder(v);
        return evh;
    }

    @Override
    public void onBindViewHolder(@NonNull AuthorViewHolder holder, int position) {
         ItemChapter currentItem = mExampleList.get(position);
        holder.textTlIndonesian.setText(String.valueOf(currentItem.getIndonesian()));
        holder.textTlArabic.setText(currentItem.getArabic());
        //holder.textScoreType.setText(currentItem.getScoreType());
        //holder.textScoreSize.setText(currentItem.getScoreSize());
        //holder.textScoreType.setText(currentItem.getScore());
        //holder.textScoreSize.setText("");
    }

    @Override
    public int getItemCount() {
        return mExampleList.size();
    }

    public Adapter_Chapter(ArrayList<ItemChapter> exampleList) {
        mExampleList = exampleList;
    }

    public Adapter_Chapter(HaditsChapter data) {
        mExampleList = new ArrayList<>();
        List<POJOChapter> list = data.getData();
        int len = list.size();
        for (int i=0;i<len;i++) {
            POJOChapter item = list.get(i);
            ItemChapter itemChapter = new ItemChapter(item);
            mExampleList.add(itemChapter);
        }
    }
}
