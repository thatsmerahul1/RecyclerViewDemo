package com.example.a20113966.recyclerviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class DetailActivity extends AppCompatActivity {

    private RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        relativeLayout = (RelativeLayout) findViewById(R.id.rlDetailLayout);

        Integer imageName = getIntent().getIntExtra("picName",0);
        if(imageName != null && imageName != 0)
        {
            relativeLayout.setBackground(getResources().getDrawable(imageName));
        }



    }
}
