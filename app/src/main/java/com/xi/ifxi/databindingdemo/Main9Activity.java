package com.xi.ifxi.databindingdemo;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.xi.ifxi.databindingdemo.databinding.ActivityMain9Binding;
import com.xi.ifxi.databindingdemo.model.User;

public class Main9Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMain9Binding activityMain9Binding = DataBindingUtil.setContentView(this, R.layout.activity_main9);
        User user = new User("ifxi", "123456");
        activityMain9Binding.setUserInfo(user);
    }
}
