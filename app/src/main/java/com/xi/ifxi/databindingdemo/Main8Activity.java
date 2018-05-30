package com.xi.ifxi.databindingdemo;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;

import com.xi.ifxi.databindingdemo.databinding.ActivityMain8Binding;
import com.xi.ifxi.databindingdemo.model.User;

public class Main8Activity extends AppCompatActivity {

    private ActivityMain8Binding activityMain8Binding;
    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMain8Binding = DataBindingUtil.setContentView(this, R.layout.activity_main8);
        activityMain8Binding.setUserInfo(user);
        activityMain8Binding.setUserPresenter(new UserPresenter());
    }

    public class UserPresenter {

        public void onUserNameClick(User user) {

        }
        public void afterTextChanged(Editable s) {

        }

        public void afterUserPasswordChanged(Editable s) {

        }
    }
}
