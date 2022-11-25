package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView result,solution;
    MaterialButton buttonC,buttonfirststart,buttonfirstclosed;
    MaterialButton buttondivide,buttonMultiply,buttonAdd,buttonsub,buttonequal;
    MaterialButton buttonzero,buttonOne,buttonTwo,buttonThree,buttonFour,buttonFive,buttonsix,buttonSeven,
                   buttonEight,buttonNine;
    MaterialButton buttonAc,buttonDOTT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = findViewById(R.id.result);
        solution = findViewById(R.id.solution);

        assignId(buttonC,R.id.button_c);
        assignId(buttonfirststart,R.id.button_firststart);
        assignId(buttonfirstclosed,R.id.button_firstclosed);
        assignId(buttondivide,R.id.button_divide);
        assignId(buttonMultiply,R.id.button_Multiply);
        assignId(buttonAdd,R.id.button_Add);
        assignId(buttonsub,R.id.button_Sub);
        assignId(buttonzero,R.id.button_Zero);
        assignId(buttonOne,R.id.button_One);
        assignId(buttonTwo,R.id.button_Two);
        assignId(buttonThree,R.id.button_Three);
        assignId(buttonFour,R.id.button_Four);
        assignId(buttonFive,R.id.button_Five);
        assignId(buttonsix,R.id.button_six);
        assignId(buttonSeven,R.id.button_Seven);
        assignId(buttonEight,R.id.button_Eight);
        assignId(buttonNine,R.id.button_Nine);
        assignId(buttonAc,R.id.button_Ac);
        assignId(buttonDOTT,R.id.button_DOTT);
        assignId(buttonequal,R.id.button_Equal);




    }

    void assignId(MaterialButton btn,int id){
        btn = findViewById(id);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        MaterialButton button = (MaterialButton) view;
        String buttonText =button.getText().toString();
        solution.setText(buttonText);

    }
}