package com.xi.ifxi.databindingdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void startActivity(Class c) {
        startActivity(new Intent(this, c));
    }

    public void startActivity2(View v) {
        startActivity(Main2Activity.class);
    }

    public void startActivity3(View v) {
        startActivity(Main3Activity.class);
    }

    public void startActivity4(View v) {
        startActivity(Main4Activity.class);
    }

    public void startActivity5(View v) {
        startActivity(Main5Activity.class);
    }

    public void startActivity6(View v) {
        startActivity(Main6Activity.class);
    }

    public void startActivity7(View v) {
        startActivity(Main7Activity.class);
    }

}
