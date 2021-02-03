package com.example.tijiao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        EditText reqs;
        final EditText sends2;
        Button btn;
        final Intent intent = getIntent();

        reqs = findViewById(R.id.editTextTextPersonName3);
        sends2 = findViewById(R.id.editTextTextPersonName12);
        btn = findViewById(R.id.button12);

        reqs.setText(intent.getStringExtra("sends"));

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("returns",sends2.getText().toString());
                setResult(0x02,intent);
                finish();
            }
        });

    }
}