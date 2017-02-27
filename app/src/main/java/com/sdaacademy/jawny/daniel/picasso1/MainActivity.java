package com.sdaacademy.jawny.daniel.picasso1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

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

        Picasso.with(this)
                .load("https://goo.gl/JfEm9H")
                .error(R.drawable.error_image)
                .into(mImageView1);
        Picasso.with(this)
                .load(R.drawable.moto)
                .error(R.drawable.error_image)
                .into(mImageView2);
        Picasso.with(this)
                .load("file://storage/emulated/0/piwo.jpg")
                .error(R.drawable.error_image)
                .into(mImageView3);
        Picasso.with(this)
                .load("https://goo.gl/JfEm9H3")
                .error(R.drawable.error_image)
                .into(mImageView4);
    }
}
