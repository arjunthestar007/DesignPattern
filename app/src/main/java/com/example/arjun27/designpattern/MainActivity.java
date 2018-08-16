package com.example.arjun27.designpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

// generates objects to represent the different types of bread our sandwich builder app might offer

public class MainActivity extends AppCompatActivity {
    TextView textView1,textView2,textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView1=findViewById(R.id.textView1);
        textView2=findViewById(R.id.textView2);
        textView3=findViewById(R.id.textView3);

        BreadFactory breadFactory = new BreadFactory();
        Bread bag=breadFactory.getBread("BAG");
        Bread bri=breadFactory.getBread("BRI");
        Bread rol=breadFactory.getBread("ROL");

        textView1.setText(new StringBuilder()
                .append(bag.name()).append(bag.calories())
                .toString());

        textView2.setText(new StringBuilder()
                .append(bri.name()).append(bri.calories())
                .toString());

        textView3.setText(new StringBuilder()
                .append(rol.name()).append(rol.calories())
                .toString());
    }
}
