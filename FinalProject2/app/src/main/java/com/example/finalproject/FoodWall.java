package com.example.finalproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class FoodWall extends AppCompatActivity {

    private ListView listView;
    DatabaseReference databaseReference;
    private List<Food> foodList;
    private CustomAdapter customAdapter;




    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_wall);
        this.setTitle("FoodWall");

        databaseReference= FirebaseDatabase.getInstance().getReference("foods");
        foodList=new ArrayList<>();

        customAdapter=new CustomAdapter(FoodWall.this,foodList);

        listView=findViewById(R.id.listViewId);


    }

    @Override
    protected void onStart() {
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                foodList.clear();
                for(DataSnapshot dataSnapshot1 : dataSnapshot.getChildren()){
                    Food food=dataSnapshot1.getValue(Food.class);
                    foodList.add(food);
                }
                listView.setAdapter(customAdapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });






        super.onStart();
    }
}