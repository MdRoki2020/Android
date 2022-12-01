package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText etfirstvalue,etsecondvalue;
    private Button btnadd,btnsubs,btnmultiply,btndivision,btnAc;
    double num1,num2;
    private TextView tvresult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etfirstvalue=findViewById(R.id.etfirstvalue);
        etsecondvalue=findViewById(R.id.etsecondvalue);
        btnadd=findViewById(R.id.btnadd);
        btnsubs=findViewById(R.id.btnsubs);
        btnmultiply=findViewById(R.id.btnmultiply);
        btndivision=findViewById(R.id.btndivision);
        btnAc=findViewById(R.id.Ac);
        tvresult=findViewById(R.id.tvresult);
        Clicklistener();
    }
    public void Clicklistener(){
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Double.parseDouble(etfirstvalue.getText().toString());
                num2=Double.parseDouble(etsecondvalue.getText().toString());
                Double result=num1+num2;
                tvresult.setText(String.valueOf(result));
            }
        });

        btnsubs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Double.parseDouble(etfirstvalue.getText().toString());
                num2=Double.parseDouble(etsecondvalue.getText().toString());
                Double result=num1-num2;
                tvresult.setText(String.valueOf(result));
            }
        });

        btnmultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Double.parseDouble(etfirstvalue.getText().toString());
                num2=Double.parseDouble(etsecondvalue.getText().toString());
                Double result=num1*num2;
                tvresult.setText(String.valueOf(result));
            }
        });

        btndivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Double.parseDouble(etfirstvalue.getText().toString());
                num2=Double.parseDouble(etsecondvalue.getText().toString());
                Double result=num1/num2;
                tvresult.setText(String.valueOf(result));
            }
        });

        btnAc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etfirstvalue.setText("");
                etsecondvalue.setText("");
            }
        });
    }
}