package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editText1,editText2;
    private Button addBtn,subBtn,MulBtn,DivBtn;
    private TextView result;
    double num1,num2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1=findViewById(R.id.editTextId1);
        editText2=findViewById(R.id.editTextId2);

        addBtn=findViewById(R.id.addBtnId);
        subBtn=findViewById(R.id.subBtnId);
        MulBtn=findViewById(R.id.mulBtnId);
        DivBtn=findViewById(R.id.divBtnId);
        result=findViewById(R.id.resultId);

        clickListener();
    }

    private void clickListener() {
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Double.parseDouble(editText1.getText().toString());
                num2=Double.parseDouble(editText2.getText().toString());

                Double added = num1+num2;

                result.setText(String.valueOf(added));
            }
        });
    }
}