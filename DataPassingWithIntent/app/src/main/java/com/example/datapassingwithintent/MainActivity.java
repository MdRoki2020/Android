package com.example.datapassingwithintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.buttonId);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,DetailsActivity.class);
                intent.putExtra("tag","Daffodil International University is a private research university located in Daffodil Smart City, Ashulia, Dhaka, Bangladesh. It was established on 24 January 2002 under the Private University Act of 1992 which was replaced by Private University Act 2010");
                startActivity(intent);
            }
        });
    }
}