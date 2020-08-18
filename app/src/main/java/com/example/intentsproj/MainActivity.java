package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ok = findViewById(R.id.OkButton);
        final EditText num1_input = findViewById(R.id.No1Input);
        final EditText num2_input = findViewById(R.id.No2Input);


        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                LayoutInflater li = getLayoutInflater();

                View layout = li.inflate(R.layout.custom_toast, (ViewGroup)
                        findViewById(R.id.custom_toast_layout));


                Toast toast = new Toast(getApplicationContext());
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                toast.setView(layout);
                toast.show();

                //convert string to int
                String num_1= num1_input.getText().toString();
                int finalnum_1=Integer.parseInt(num_1);

                String num_2= num2_input.getText().toString();
                int finalnum_2=Integer.parseInt(num_2);

                Intent i = new Intent(getApplicationContext(),SecondActivity.class);


                i.putExtra("Num1Val", finalnum_1);
                i.putExtra("Num2Val", finalnum_2);

                startActivity(i);
            }
        });


    }
}