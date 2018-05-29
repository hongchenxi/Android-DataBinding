package com.xi.ifxi.databindingdemo;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.xi.ifxi.databindingdemo.databinding.ActivityMain6Binding;
import com.xi.ifxi.databindingdemo.model.ObservableGoods;

public class Main6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMain6Binding activityMain6Binding = DataBindingUtil.setContentView(this, R.layout.activity_main6);
        ObservableGoods goods = new ObservableGoods("ifxi", "hi", 23);
        activityMain6Binding.setGoods(goods);
    }
}
