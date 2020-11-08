package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String[] name = {"1","2","3","4"};
    String[] con = {"11","22","33","44"};
    FragmentManager manager;
    ArrayAdapter<String> adapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manager = getSupportFragmentManager();


        adapter = new ArrayAdapter<String>(MainActivity.this,R.layout.frament,name);
        ListView ls = findViewById(R.id.listview);
        ls.setAdapter(adapter);
        ls.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                myfragment myfragmen = (myfragment) manager.findFragmentById(R.id.fragment);
                TextView tx = myfragmen.getView().findViewById(R.id.textView2);
                tx.setText(con[position]);
            }
        });
    }
}