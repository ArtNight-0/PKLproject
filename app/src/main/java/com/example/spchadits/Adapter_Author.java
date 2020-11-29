package com.example.spchadits;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Adapter_Author extends RecyclerView.Adapter<Adapter_Author.AuthorViewHolder> {

    public static List<Item_Author> mExampleList;
    private List<Item_Author> mExampleListALL;

//    private static final String TAG = "RecyclerAdapter";
//    List<Item_Author> authorList;
//    List<Item_Author> authorListALL;

//    Adapter_Author(List<Item_Author> mExampleList) {
//        this.mExampleList = mExampleList;
//        mExampleListALL = new ArrayList<>(mExampleList);
//    }


//Filterr

//    public Filter getFilter() {
//        return filter;
//    }
//    Filter filter = new Filter() {
//        @Override
//        //run on BG
//        protected FilterResults performFiltering(CharSequence charSequence) {
//            List<Item_Author> filteredlist = new ArrayList<>();
//            if (charSequence.toString().isEmpty()){
//                filteredlist.addAll(authorList);
//            }else{
//                for (Item_Author author: authorListALL){
//                    if (author.getName().contains(charSequence.toString().toLowerCase())){
//                        filteredlist.add(author);
//                    }
//                }
//            }
//
//            FilterResults filterResults = new FilterResults();
//            filterResults.values = filteredlist;
//            return filterResults;
//        }
//
//        @Override
//        protected void publishResults(CharSequence constraint, FilterResults results) {
//            authorList.clear();
//            authorList.addAll((Collection<? extends Item_Author>) results.values);
//            notifyDataSetChanged();
//        }
//    };



    public static class AuthorViewHolder extends RecyclerView.ViewHolder {
        public TextView textName;
        public TextView textDescription;
        //public TextView textScoreType;
        //public TextView textScoreSize;

        public AuthorViewHolder(@NonNull View itemView) {
            super(itemView);

            textName = itemView.findViewById(R.id.text1);
            textDescription = itemView.findViewById(R.id.text2);
            //textScoreType = itemView.findViewById(R.id.text2);
            //textScoreSize = itemView.findViewById(R.id.text3);
        }
    }

    Adapter_Author(List<Item_Author> mExampleList)
    {
        this.mExampleList = mExampleList;
        mExampleListALL = new ArrayList<>(mExampleList);
    }

    @NonNull
    @Override
    public AuthorViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_author, parent, false);
        AuthorViewHolder evh = new AuthorViewHolder(v);
        return evh;
    }

    @Override
    public void onBindViewHolder(@NonNull AuthorViewHolder holder, int position) {
        Item_Author currentItem = mExampleList.get(position);
        holder.textName.setText(String.valueOf(currentItem.getName()));
        holder.textDescription.setText(currentItem.getDescription());
        //holder.textScoreType.setText(currentItem.getScoreType());
        //holder.textScoreSize.setText(currentItem.getScoreSize());
        //holder.textScoreType.setText(currentItem.getScore());
        //holder.textScoreSize.setText("");
    }

    @Override
    public int getItemCount() {
        return mExampleList.size();
    }



    public Adapter_Author(HaditsAuthor data) {
        mExampleList = new ArrayList<>();
        List<POJOAuthor> list = data.getData();
        int len = list.size();
        for (int i=0;i<len;i++) {
            POJOAuthor item = list.get(i);
            Item_Author itemAuthor = new Item_Author(item);
            mExampleList.add(itemAuthor);
        }
    }

    Adapter_Author(ArrayList<Item_Author> arrayList) {
        this.mExampleList = arrayList;
    }


    //
//    @Override
//    public Filter getFilter() {
//
//        return filter;
//    }

//    private Filter filter = new Filter() {
//        @Override
//        protected FilterResults performFiltering(CharSequence constraint) {
//            List<Item_Author> filteredlist = new ArrayList<>();
//
//            if (constraint == null || constraint.length() == 0) {
//                filteredlist.addAll(mExampleListALL);
//            } else {
//                String filterpattern = constraint.toString().toLowerCase().trim();
//
//                for (Item_Author item : mExampleListALL) {
//                    if (item.getName().toLowerCase().contains(filterpattern)) {
//                        filteredlist.add(item);
//                    }
//                }
//            }
//            FilterResults results = new FilterResults();
//            results.values = filteredlist;
//            return results;
//
//        }
//
//        @Override
//        protected void publishResults(CharSequence constraint, FilterResults results) {
//            mExampleList.clear();
//            mExampleList.addAll((Collection<? extends Item_Author>) results.values);
//            notifyDataSetChanged();
//
//        }
//    };

    void setFilter(ArrayList<Item_Author> filterList) {
        mExampleList = new ArrayList<>();
        mExampleList.addAll(filterList);
        notifyDataSetChanged();
    }
}
