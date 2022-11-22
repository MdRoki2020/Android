package com.example.finalproject;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class CustomAdapter extends ArrayAdapter<Food> {

    private Activity context;
    private List<Food> foodList;

    public CustomAdapter(Activity context,List<Food> foodList) {
        super(context,R.layout.sample_layout, foodList);
        this.context = context;
        this.foodList = foodList;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView,ViewGroup parent) {

        LayoutInflater layoutInflater=context.getLayoutInflater();
        View view=layoutInflater.inflate(R.layout.sample_layout,null,true);

        Food food= foodList.get(position);

        TextView t1=view.findViewById(R.id.foodNameID);
        TextView t2=view.findViewById(R.id.foodCodeID);
        TextView t3=view.findViewById(R.id.foodPriceID);
        TextView t4=view.findViewById(R.id.foodCategoryID);
        TextView t5=view.findViewById(R.id.foodPriceID);
        TextView t6=view.findViewById(R.id.foodDescriptionID);

        t1.setText("Food Name: "+food.getFoodNameVar());
        t2.setText("Food Code: "+food.getFoodCodeVar());
        t3.setText("Food Category: "+food.getFoodCategoryVar());
        t4.setText("Food Price: "+food.getFoodPriceVar());
        t5.setText("Food Stock: "+food.getFoodStockVar());
        t6.setText("Food Description: "+food.getFoodDescriptionVar());


        return view;
    }
}
