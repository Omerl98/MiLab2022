package com.example.exercise2;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ListAdapter extends RecyclerView.Adapter{

    String[] mDataSet;

    public ListAdapter(String[] data) {
        mDataSet = data;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView mTextView;

        public MyViewHolder(TextView view) {
            super(view);
            mTextView = view;
        }
    }

    @Override
    public MyViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        TextView textView = new TextView(parent.getContext());
        MyViewHolder holder = new MyViewHolder(textView);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        String textForDisplay = mDataSet[position];
        ((MyViewHolder)holder).mTextView.setText(textForDisplay);
    }

    @Override
    public int getItemCount() {
        return mDataSet.length;
    }
}
