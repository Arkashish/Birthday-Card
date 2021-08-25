package com.example.birthdayapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class BirthdayGreeting extends AppCompatActivity {
    TextView textview2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday_greeting);
        textview2 = findViewById(R.id.textView2);
        String name = getIntent().getStringExtra("name");
        textview2.setText("Happy Birthday "+name);
    }
}