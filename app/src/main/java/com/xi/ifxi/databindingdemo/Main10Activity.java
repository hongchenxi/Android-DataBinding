package com.xi.ifxi.databindingdemo;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.xi.ifxi.databindingdemo.databinding.ActivityMain10Binding;
import com.xi.ifxi.databindingdemo.model.User;

public class Main10Activity extends AppCompatActivity {

    private ActivityMain10Binding activityMain10Binding;
    private User user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMain10Binding = DataBindingUtil.setContentView(this, R.layout.activity_main10);
        activityMain10Binding.setHandler(new Handler());
        user = new User("ifxi", "123456");
        activityMain10Binding.setUserInfo(user);
    }

    public class Handler {
        public void onClick(View v) {

        }
    }
}
