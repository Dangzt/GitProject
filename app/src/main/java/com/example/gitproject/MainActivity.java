package com.example.gitproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"第一次提交代码",Toast.LENGTH_LONG).show();
        Toast.makeText(this,"dev分支开发",Toast.LENGTH_LONG).show();
    }
}
