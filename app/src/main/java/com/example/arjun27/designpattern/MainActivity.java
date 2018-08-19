package com.example.arjun27.designpattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

// generates objects to represent the different types of bread our sandwich builder app might offer

public class MainActivity extends AppCompatActivity {
    TextView textView1, textView2, textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SandwichBuilder builder = new SandwichBuilder();
        Sandwich custom = new Sandwich();

        // Simulate user selections
        custom=builder.build(custom,new Bagel());
        custom=builder.build(custom,new SmokedSalmon());
        custom.getCalories();
        custom.getSandwich();


        // Build a ready made sandwich
        Sandwich offTheShelf = SandwichBuilder.readyMade();
        offTheShelf.getSandwich();
        offTheShelf.getCalories();


    }
}