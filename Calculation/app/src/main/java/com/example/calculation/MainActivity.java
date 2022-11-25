package com.example.calculation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText1,editText2;
    private Button addedButton;
    private TextView tvResult;
    double num1,num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1=findViewById(R.id.firstValueId);
        editText2=findViewById(R.id.secondValueId);
        addedButton=findViewById(R.id.addBtnId);
        tvResult=findViewById(R.id.resultId);
        ClickListener();

    }

    private void ClickListener() {
        addedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Double.parseDouble(editText1.getText().toString());
                num2=Double.parseDouble(editText2.getText().toString());

                Double result=num1+num2;

                tvResult.setText(String.valueOf(result));
            }
        });
    }
}