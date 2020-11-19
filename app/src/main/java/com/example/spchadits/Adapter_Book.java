package com.example.spchadits;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Adapter_Book extends RecyclerView.Adapter<Adapter_Book.AuthorViewHolder> {

    private ArrayList<ItemBook> mExampleList;

    public static class AuthorViewHolder extends RecyclerView.ViewHolder {

        public TextView textindonesian;
        public TextView textarabic;
        //public TextView textScoreType;
        //public TextView textScoreSize;

        public AuthorViewHolder(@NonNull View itemView) {
            super(itemView);

            textindonesian = itemView.findViewById(R.id.text1);
            textarabic = itemView.findViewById(R.id.text2);
            //textScoreType = itemView.findViewById(R.id.text2);
            //textScoreSize = itemView.findViewById(R.id.text3);
        }
    }

    @NonNull
    @Override
    public AuthorViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_book, parent, false);
        AuthorViewHolder evh = new AuthorViewHolder(v);
        return evh;
    }

    @Override
    public void onBindViewHolder(@NonNull AuthorViewHolder holder, int position) {
        ItemBook currentItem = mExampleList.get(position);
        holder.textindonesian.setText(String.valueOf(currentItem.getIndonesian()));
        holder.textarabic.setText(currentItem.getArabic());
        //holder.textScoreType.setText(currentItem.getScoreType());
        //holder.textScoreSize.setText(currentItem.getScoreSize());
        //holder.textScoreType.setText(currentItem.getScore());
        //holder.textScoreSize.setText("");
    }

    @Override
    public int getItemCount() {
        return mExampleList.size();
    }

    public Adapter_Book(ArrayList<ItemBook> exampleList) {
        mExampleList = exampleList;
    }

    public Adapter_Book(HaditsBook data) {
        mExampleList = new ArrayList<>();
        List<POJOBook> list = data.getData();
        int len = list.size();
        for (int i=0;i<len;i++) {
            POJOBook item = list.get(i);
            ItemBook itemBook = new ItemBook(item);
            mExampleList.add(itemBook);
        }
    }
}
