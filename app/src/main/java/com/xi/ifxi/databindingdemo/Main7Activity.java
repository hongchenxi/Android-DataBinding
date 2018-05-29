package com.xi.ifxi.databindingdemo;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.widget.Toast;

import com.xi.ifxi.databindingdemo.databinding.ActivityMain7Binding;
import com.xi.ifxi.databindingdemo.model.User;

public class Main7Activity extends AppCompatActivity {

    private User user;
    private ActivityMain7Binding activityMain7Binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        activityMain7Binding = DataBindingUtil.setContentView(this, R.layout.activity_main7);
        user = new User("ifxi", "123456");
        activityMain7Binding.setUserInfo(user);
        activityMain7Binding.setUserPresenter(new UserPresenter());
    }

    public class UserPresenter {
        public void onUserNameClick(User user) {
            Toast.makeText(Main7Activity.this, "用户名：" + user.getName(), Toast.LENGTH_SHORT).show();
        }
        public void afterTextChanged(Editable s) {
            user.setName(s.toString());
            activityMain7Binding.setUserInfo(user);
        }

        public void afterUserPasswordChanged(Editable s) {
            user.setPassword(s.toString());
            activityMain7Binding.setUserInfo(user);
        }
    }

}
