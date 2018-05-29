package com.xi.ifxi.databindingdemo;

import android.databinding.DataBindingUtil;
import android.databinding.Observable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.xi.ifxi.databindingdemo.databinding.ActivityMain3Binding;
import com.xi.ifxi.databindingdemo.model.Goods;

import java.util.Random;

import javax.security.auth.login.LoginException;

public class Main3Activity extends AppCompatActivity {

    private Goods goods;
    private ActivityMain3Binding activityMain3Binding;
    private static final String TAG = "Main3Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        activityMain3Binding = DataBindingUtil.setContentView(this, R.layout.activity_main3);
        goods = new Goods("ifxi", "hi", 25);
        activityMain3Binding.setGoods(goods);
        activityMain3Binding.setGoodsHandler(new GoodsHandler());
        goods.addOnPropertyChangedCallback(new Observable.OnPropertyChangedCallback() {
            @Override
            public void onPropertyChanged(Observable sender, int propertyId) {
                if (propertyId == com.xi.ifxi.databindingdemo.BR.name) {
                    Log.e(TAG, "onPropertyChanged: BR.name");
                } else if (propertyId == BR.details) {
                    Log.e(TAG, "onPropertyChanged: BR.details");
                } else if (propertyId == BR._all) {
                    Log.e(TAG, "onPropertyChanged: BR._all");
                } else {
                    Log.e(TAG, "onPropertyChanged: 未知");
                }
            }
        });
    }

    public class GoodsHandler {
        public void changeGoodsName() {
            goods.setName("ifxi" + new Random().nextInt(100));
            goods.setPrice(new Random().nextInt(100));
        }

        public void changeGoodsDetails() {
            goods.setDetails("hi" + new Random().nextInt(100));
            goods.setPrice(new Random().nextInt(100));
        }
    }
}
