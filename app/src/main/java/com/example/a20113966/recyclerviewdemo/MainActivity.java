package com.example.a20113966.recyclerviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.a20113966.recyclerviewdemo.Adapter.RecyclerAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private LinearLayoutManager mLayoutManager;
    private RecyclerAdapter mAdapter;
    private GridLayoutManager mGridLayoutManager;
    private ArrayList<Integer> myDataset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myDataset = new ArrayList<Integer>();

        myDataset.add(R.drawable.image_1);
        myDataset.add(R.drawable.image_2);
        myDataset.add(R.drawable.image_3);
        myDataset.add(R.drawable.image_4);
        myDataset.add(R.drawable.image_5);
        myDataset.add(R.drawable.image_6);
        myDataset.add(R.drawable.image_7);
        myDataset.add(R.drawable.image_8);
        myDataset.add(R.drawable.image_9);
        myDataset.add(R.drawable.image_10);
        myDataset.add(R.drawable.image_11);
        myDataset.add(R.drawable.image_12);
        myDataset.add(R.drawable.image_13);
        myDataset.add(R.drawable.image_14);
        myDataset.add(R.drawable.image_15);


        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(this);
        mLayoutManager.canScrollVertically();



        GridLayoutManager manager = new GridLayoutManager(this, 3);
        mRecyclerView.setLayoutManager(manager);

        // specify an adapter (see also next example)
        mAdapter = new RecyclerAdapter(myDataset, getApplicationContext());
        mRecyclerView.setAdapter(mAdapter);

    }
    }
