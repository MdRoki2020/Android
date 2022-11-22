package com.example.finalproject;

import android.widget.Button;

public class Food {
    private String foodNameVar;
    private String foodCodeVar;
    private String foodCategoryVar;
    private String foodPriceVar;
    private String foodStockVar;
    private String foodDescriptionVar;

    public Food(){

    }


    public Food(String foodNameVar, String foodCodeVar, String foodCategoryVar, String foodPriceVar, String foodStockVar, String foodDescriptionVar) {
        this.foodNameVar = foodNameVar;
        this.foodCodeVar = foodCodeVar;
        this.foodCategoryVar = foodCategoryVar;
        this.foodPriceVar = foodPriceVar;
        this.foodStockVar = foodStockVar;
        this.foodDescriptionVar = foodDescriptionVar;
    }


    public String getFoodNameVar() {
        return foodNameVar;
    }

    public void setFoodNameVar(String foodNameVar) {
        this.foodNameVar = foodNameVar;
    }

    public String getFoodCodeVar() {
        return foodCodeVar;
    }

    public void setFoodCodeVar(String foodCodeVar) {
        this.foodCodeVar = foodCodeVar;
    }

    public String getFoodCategoryVar() {
        return foodCategoryVar;
    }

    public void setFoodCategoryVar(String foodCategoryVar) {
        this.foodCategoryVar = foodCategoryVar;
    }

    public String getFoodPriceVar() {
        return foodPriceVar;
    }

    public void setFoodPriceVar(String foodPriceVar) {
        this.foodPriceVar = foodPriceVar;
    }

    public String getFoodStockVar() {
        return foodStockVar;
    }

    public void setFoodStockVar(String foodStockVar) {
        this.foodStockVar = foodStockVar;
    }

    public String getFoodDescriptionVar() {
        return foodDescriptionVar;
    }

    public void setFoodDescriptionVar(String foodDescriptionVar) {
        this.foodDescriptionVar = foodDescriptionVar;
    }
}
