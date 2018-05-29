package com.xi.ifxi.databindingdemo;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.xi.ifxi.databindingdemo.databinding.ActivityMain3Binding;
import com.xi.ifxi.databindingdemo.databinding.ActivityMain4Binding;
import com.xi.ifxi.databindingdemo.model.ObservableGoods;

import java.util.Random;

public class Main4Activity extends AppCompatActivity {

    private ObservableGoods observableGoods;
    private ActivityMain4Binding activityMain4Binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        activityMain4Binding = DataBindingUtil.setContentView(this, R.layout.activity_main4);
        observableGoods = new ObservableGoods("ifxi", "hello", 23);
        activityMain4Binding.setObservableGoods(observableGoods);
        activityMain4Binding.setObservableGoodsHandler(new ObservableGoodsHandler());

    }

    public class ObservableGoodsHandler {
        public void changeGoodsName() {
            observableGoods.getName().set("ifxi" + new Random().nextInt(100));
        }

        public void changeGoodsDetails() {
            observableGoods.getDetails().set("hi" + new Random().nextInt(100));
        }

    }
}
