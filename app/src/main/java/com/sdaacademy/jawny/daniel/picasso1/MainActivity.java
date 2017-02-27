package com.sdaacademy.jawny.daniel.picasso1;

import android.Manifest;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
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
        checkPermissions();
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
                .load("https://goo.gl/JfEm9H3")
                .error(R.drawable.error_image)
                .into(mImageView4);
    }

    private void checkPermissions() {
        int status = ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE);
        if (status == PackageManager.PERMISSION_GRANTED) {
            Picasso.with(this)
                    .load("file:///storage/emulated/0/DCIM/Camera/piwo.jpg")
                    .error(R.drawable.error_image)
                    .into(mImageView3);
        } else {
            String[] allPermissions = {Manifest.permission.READ_EXTERNAL_STORAGE};
            ActivityCompat.requestPermissions(this, allPermissions, 5);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == 5) {
            int result = grantResults[0];
            if (result == PackageManager.PERMISSION_GRANTED) {
                Picasso.with(this)
                        .load("file:///storage/emulated/0/DCIM/Camera/piwo.jpg")
                        .error(R.drawable.error_image)
                        .into(mImageView3);
            }
        }
    }
}
