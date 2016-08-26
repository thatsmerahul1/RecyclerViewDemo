package com.example.a20113966.recyclerviewdemo.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.a20113966.recyclerviewdemo.DetailActivity;
import com.example.a20113966.recyclerviewdemo.R;

import java.util.ArrayList;

/**
 * Created by 20113966 on 26-08-2016.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private ArrayList<Integer> mDataset;
    private Context mContext;

    public RecyclerAdapter(ArrayList<Integer> myDataset, Context context) {
        mDataset = myDataset;
        mContext = context;
    }


    public void add(int position, Integer item) {
        mDataset.add(position, item);
        notifyItemInserted(position);
    }

    public void remove(Integer item) {
        int position = mDataset.indexOf(item);
        mDataset.remove(position);
        notifyItemRemoved(position);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item, parent, false);
        // set the view's size, margins, paddings and layout parameters
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        final Integer imgSrc = mDataset.get(position);
        holder.imgMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(mContext, DetailActivity.class);
                myIntent.putExtra("picName", mDataset.get(position));
                myIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                mContext.startActivity(myIntent);
            }
        });
        holder.imgMain.setBackgroundResource(imgSrc);
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public ImageView imgMain;

        public ViewHolder(View v) {
            super(v);
            imgMain = (ImageView) v.findViewById(R.id.imgIcon);
        }
    }
}
