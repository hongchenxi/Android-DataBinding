package com.xi.ifxi.databindingdemo;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.xi.ifxi.databindingdemo.databinding.ActivityMain2Binding;
import com.xi.ifxi.databindingdemo.model.User;

public class Main2Activity extends AppCompatActivity {

    private User user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMain2Binding activityMain2Binding =  DataBindingUtil.setContentView(this, R.layout.activity_main2);
        user = new User("ifxi", "123456");
        activityMain2Binding.setUserInfo(user);
    }
}
