package com.example.arjun27.designpattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

// generates objects to represent the different types of bread our sandwich builder app might offer

public class MainActivity extends AppCompatActivity {
    TextView textView1,textView2,textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView1=findViewById(R.id.textView1);
        textView2=findViewById(R.id.textView2);
        textView3=findViewById(R.id.textView3);

        CurrentUser currentUser= CurrentUser.getCurrentUser();
        currentUser.setName("arjun");
        currentUser.getName();



    }
}
