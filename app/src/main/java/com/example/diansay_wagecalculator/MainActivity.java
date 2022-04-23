package com.example.diansay_wagecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText e_type,e_hours;
    String s_type;
    int hours;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e_type = findViewById(R.id.e_type);
        e_hours = findViewById(R.id.e_hours);
        next = findViewById(R.id.btn_next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hours = Integer.parseInt(e_hours.getText().toString());
                s_type = e_type.getText().toString();
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                i.putExtra("hours", hours);
                i.putExtra("type", s_type);
                startActivity(i);
            }
        });
    }
}