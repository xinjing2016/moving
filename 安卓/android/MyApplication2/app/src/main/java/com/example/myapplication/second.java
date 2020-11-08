package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button returnButton;
        TextView textView;
        TextView textView4;

        returnButton = findViewById(R.id.returnButton);
        textView = findViewById(R.id.textView);
        textView4 = findViewById(R.id.textView4);

        Intent intent = getIntent();
        String name = intent.getStringExtra("username");
        String passwords = intent.getStringExtra("password");
        textView.setText("name is "+name);
        textView4.setText(passwords);

        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}