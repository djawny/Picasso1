package com.sdaacademy.jawny.daniel.picasso1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.image1)
    ImageView mImageView1;

    @BindView(R.id.image2)
    ImageView mImageView2;

    @BindView(R.id.image3)
    ImageView mImageView3;

    @BindView(R.id.image4)
    ImageView mImageView4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setImageViews();
    }

    private void setImageViews() {
        
    }
}
