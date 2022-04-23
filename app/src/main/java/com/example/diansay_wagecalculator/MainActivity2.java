package com.example.diansay_wagecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    int hours, othours, wage, otwage, totalwage;
    String s_type;
    TextView total_wage, ot_wage, reg_wage, total_hours, ot_hours;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        hours = intent.getIntExtra("hours", 0);
        s_type = intent.getStringExtra("type");
        if (s_type.equals("regular") || s_type.equals("Regular")) {
            if (hours > 8) {
                othours = hours - 8;
                otwage = othours * 115;

            }
            wage = (hours - othours) * 100;
            totalwage = wage + otwage;
        } else if (s_type.equals("probationary") || s_type.equals("Probationary")) {
            if (hours > 8) {
                othours = hours - 8;
                otwage = othours * 100;

            }
            wage = (hours - othours) * 90;
            totalwage = wage + otwage;
        } else if (s_type.equals("part time") || s_type.equals("part-time") || s_type.equals("Part Time") || s_type.equals("Part-Time")) {
            if (hours > 8) {
                othours = hours - 8;
                otwage = othours * 90;

            }
            wage = (hours - othours) * 75;
            totalwage = wage + otwage;
        } else {
            if (hours > 8) {
                othours = hours - 8;
                otwage = othours * 115;

            }
            wage = (hours - othours) * 100;
            totalwage = wage + otwage;
        }
        total_wage = findViewById(R.id.total_wage);
        total_wage.setText(String.valueOf(totalwage));
        ot_wage = findViewById(R.id.ot_wage);
        ot_wage.setText(String.valueOf(otwage));
        reg_wage = findViewById(R.id.reg_wage);
        reg_wage.setText(String.valueOf(wage));
        total_hours = findViewById(R.id.total_hours);
        total_hours.setText(String.valueOf(hours));
        ot_hours = findViewById(R.id.ot_hours);
        ot_hours.setText(String.valueOf(othours));
        back = findViewById(R.id.btn_back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity2.this,MainActivity.class));
            }
        });
    }
}