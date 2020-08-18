package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView Num_11 = findViewById(R.id.Num_1_txt_1);
        TextView Num_22 = findViewById(R.id.Num_2_txt_2);

        Button plus = findViewById(R.id.plus_btn);
        Button minus = findViewById(R.id.minus_btn);
        Button multiplication = findViewById(R.id.multiply_btn);
        Button division = findViewById(R.id.division_btn);


        Intent i = getIntent();
        final int num_01 = i.getIntExtra("Num1Val",0);
        final int num_02 = i.getIntExtra("Num2Val",0);

        Num_11.setText(String.valueOf(num_01));
        Num_22.setText(String.valueOf(num_02));

    // Addition
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView answer = findViewById(R.id.answer_txt);


                int final_1 = num_01 + num_02;
                answer.setText(String.valueOf(num_01 +" + "+ num_02 +"= " +final_1));


            }
        });


        // Substraction

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView answer = findViewById(R.id.answer_txt);


                int final_1 = num_01 - num_02;
                answer.setText(String.valueOf(num_01 +" - "+ num_02 +"= " +final_1));
            }
        });

        // Multiplication
        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView answer = findViewById(R.id.answer_txt);


                int final_1 = num_01 * num_02;
                answer.setText(String.valueOf(num_01 +" * "+ num_02 +"= " +final_1));
            }
        });

        // Division

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView answer = findViewById(R.id.answer_txt);


                float final_1 = num_01 / num_02;
                answer.setText(String.valueOf(num_01 +" / "+ num_02 +"= " +final_1));
            }
        });

    }
}