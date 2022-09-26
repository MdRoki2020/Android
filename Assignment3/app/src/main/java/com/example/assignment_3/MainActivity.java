package com.example.assignment_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView heading;
    private TextView description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        heading=findViewById(R.id.heading);
        description=findViewById(R.id.description);

        heading.setText("Police Lines school And College Rangpur");
        description.setText("Police Lines School and College, Rangpur is a non-government educational institution in Rangpur District, Bangladesh");
    }
}