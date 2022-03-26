package com.example.milespergalon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    EditText editText;
    EditText editText2;

    TextView textView;

    double galon;
    double miles;
    double result;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editTextNumberDecimal);

        editText2 = findViewById(R.id.editTextNumberDecimal2);

        textView = findViewById(R.id.textView4);





    }


    public void calculate(View view){


        galon = Double.valueOf(String.valueOf(editText.getText()));

        miles = Double.valueOf(String.valueOf(editText2.getText()));

        result =  miles / galon;


        textView.setText(result+"");





    }





}
