package com.example.maokaixin.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Method20000 method20000 = new Method20000();
        OneDexClass oneDexClass = new OneDexClass();
        oneDexClass.test();
    }
}
