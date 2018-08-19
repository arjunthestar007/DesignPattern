package com.example.arjun27.designpattern;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class Sandwich {
    private static final String TAG = "Sandwich";

    List<Ingredient> ingredients = new ArrayList<>();

    // Add ingredient
    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }


    public void getCalories() {
        int cal = 0;

        for (Ingredient ingredient : ingredients) {
            cal += ingredient.calories();
        }
        Log.d(TAG, "getCalories: " + cal);
    }

    public List<Ingredient> getSandwich() {

        for (Ingredient i : ingredients) {
            Log.d(TAG, i.name() + " : " + i.calories() + " kcal");
        }
        return ingredients;
    }

}
