package com.example.lenovo.camerademo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button takePhoto,selectPic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

        initData();
    }

    public void initView(){
        takePhoto = findViewById(R.id.btn_take_photo);
        selectPic = findViewById(R.id.btn_select_pic);
    }

    public void initData(){
        takePhoto.setOnClickListener(this);
        selectPic.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Intent intent = null;
        switch(v.getId()){
            case R.id.btn_select_pic:
                break;
            case R.id.btn_take_photo:
                break;
            default:
                break;
        }
    }
}
