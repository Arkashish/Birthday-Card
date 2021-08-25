package com.example.birthdayapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText txtname;
//    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        txtname = findViewById(R.id.textname);
//        intent = findViewById(R.id.inten)
//        button.setOnClickListener();
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String name;
//                name = txtname.editableText.toString();
//
//            }
//        });

    }

    public void createcard(View view) {
//        val textname;
        String name;
        name = txtname.getText().toString();
        Toast.makeText(this, "Creating card for " + name, Toast.LENGTH_SHORT).show();
        Intent intent = new  Intent(MainActivity.this,BirthdayGreeting.class);
        intent.putExtra("name",name);
        startActivity(intent);

    }
}