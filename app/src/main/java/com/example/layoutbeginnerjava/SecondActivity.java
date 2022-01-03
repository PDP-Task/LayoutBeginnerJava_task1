package com.example.layoutbeginnerjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.layoutbeginnerjava.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {
    ActivitySecondBinding bin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bin = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(bin.getRoot());

        String name = getIntent().getStringExtra("key");
        bin.textView.setText(name.toString());
    }
}