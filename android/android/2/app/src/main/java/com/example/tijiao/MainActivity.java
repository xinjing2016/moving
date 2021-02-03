package com.example.tijiao;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText sends;
        Button button;


        sends = findViewById(R.id.editTextTextPersonName123);

        button = findViewById(R.id.button123);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("sends",sends.getText().toString());
                startActivityForResult(intent,0x01);

            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 0x01 && resultCode==0x02){

            EditText req;
            req = findViewById(R.id.editTextTextPersonName6);
            req.setText(data.getStringExtra("returns"));
        }
    }
}