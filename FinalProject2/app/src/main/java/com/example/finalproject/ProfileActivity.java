package com.example.finalproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ProfileActivity extends AppCompatActivity {

    private EditText foodName,foodCode,foodCategory,foodPrice,foodStock,foodDescription;
    private Button addedFood;
    DatabaseReference databaseReference;

    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        databaseReference= FirebaseDatabase.getInstance().getReference("foods");

        this.setTitle("Profile Activity");

        mAuth=FirebaseAuth.getInstance();

        foodName=findViewById(R.id.foodNameId);
        foodCode=findViewById(R.id.foodCodeId);
        foodCategory=findViewById(R.id.foodCategoryId);
        foodPrice=findViewById(R.id.foodPriceId);
        foodStock=findViewById(R.id.foodStockId);
        foodDescription=findViewById(R.id.foodDescriptionId);
        addedFood=findViewById(R.id.addedFoodId);


        addedFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveData();
            }

            private void saveData() {
                String foodNameVar=foodName.getText().toString().trim();
                String foodCodeVar=foodCode.getText().toString().trim();
                String foodCategoryVar=foodCategory.getText().toString().trim();
                String foodPriceVar=foodPrice.getText().toString().trim();
                String foodStockVar=foodStock.getText().toString().trim();
                String foodDescriptionVar=foodDescription.getText().toString().trim();

                String key=databaseReference.push().getKey();

                Food food = new Food(foodNameVar,foodCodeVar,foodCategoryVar,foodPriceVar,foodStockVar,foodDescriptionVar);

                databaseReference.child(key).setValue(food);
                Toast.makeText(getApplicationContext(),"Food Successfully Added",Toast.LENGTH_LONG).show();

                foodName.setText("");
                foodCode.setText("");
                foodCategory.setText("");
                foodPrice.setText("");
                foodStock.setText("");
                foodDescription.setText("");
            }

        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_layout,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId()==R.id.signOutMenuId){
            FirebaseAuth.getInstance().signOut();
            finish();
            Intent intent= new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);

    }
}