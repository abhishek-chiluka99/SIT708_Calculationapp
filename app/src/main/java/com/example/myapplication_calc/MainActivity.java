package com.example.myapplication_calc;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        EditText num1, num2;
        Button addbtn, subbtn;
        TextView result;


        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        addbtn = findViewById(R.id.addbtn);
        subbtn = findViewById(R.id.subbtn);
        result = findViewById(R.id.result);

        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val1, val2, sum;

                val1 = Integer.parseInt(num1.getText().toString());
                val2 = Integer.parseInt(num2.getText().toString());
                sum = val1 + val2;
                result.setText("The addition value:" + sum);

            }
        });

        subbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val1, val2, sum;

                val1 = Integer.parseInt(num1.getText().toString());
                val2 = Integer.parseInt(num2.getText().toString());
                sum = val1 - val2;
                result.setText("The Subraction value:" + sum);
            }
        });



    }
}