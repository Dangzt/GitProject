package com.example.gitproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: 修改bug");
        Log.d(TAG, "onCreate: 第二次开发代码");
        Log.d(TAG, "onCreate: 第三次开发代码");
        Log.d(TAG, "onCreate: 第四次开发代码");
        Log.d(TAG, "onCreate: 最新开发二");
        Log.d(TAG, "onCreate: 最新开发三");
    }
}
