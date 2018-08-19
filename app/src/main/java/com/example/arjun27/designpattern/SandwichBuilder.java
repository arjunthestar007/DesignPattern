package com.example.arjun27.designpattern;

public class SandwichBuilder{

        // Off the shelf sandwich
        public static Sandwich readyMade() {
            Sandwich sandwich = new Sandwich();
            sandwich.addIngredient(new Bagel());
            sandwich.addIngredient(new SmokedSalmon());
            return sandwich;
        }
        // Customized sandwich
        public static Sandwich build(Sandwich s, Ingredient i) {
            s.addIngredient(i);
            return s;
        }
}
