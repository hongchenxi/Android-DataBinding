package com.xi.ifxi.databindingdemo;

import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayList;
import android.databinding.ObservableArrayMap;
import android.databinding.ObservableList;
import android.databinding.ObservableMap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.xi.ifxi.databindingdemo.databinding.ActivityMain5Binding;

import java.util.Random;

public class Main5Activity extends AppCompatActivity {

    private ObservableMap<String, String> map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        ActivityMain5Binding activityMain5Binding = DataBindingUtil.setContentView(this, R.layout.activity_main5);
        map = new ObservableArrayMap<>();
        map.put("name", "ifxi");
        map.put("age", "24");
        activityMain5Binding.setMap(map);
        ObservableList<String> list = new ObservableArrayList<>();
        list.add("if");
        list.add("xi");
        activityMain5Binding.setList(list);
        activityMain5Binding.setIndex(0);
        activityMain5Binding.setKey("name");
    }

    public void onClick(View v) {
        map.put("name", "hsifxi, hi" + new Random().nextInt(100));
    }
}
