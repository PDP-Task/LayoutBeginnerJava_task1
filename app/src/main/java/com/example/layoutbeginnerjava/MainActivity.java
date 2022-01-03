package com.example.layoutbeginnerjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.layoutbeginnerjava.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding bin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bin = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(bin.getRoot());

        initView();

    }
    public void initView() {
        bin.btnSecond.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this,SecondActivity.class);
            intent.putExtra("key","Name: Samandar\nAge: 18");
            startActivity(intent);
        });
    }
}