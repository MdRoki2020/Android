package com.example.datapassingwithintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        textView=findViewById(R.id.textViewId);

        Bundle bundle=getIntent().getExtras();

        if(bundle !=null){
            String value=bundle.getString("tag");
            textView.setText(value);
        }
    }
}