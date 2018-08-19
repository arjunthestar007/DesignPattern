package com.example.arjun27.designpattern;

public class Tea implements Drink {
    @Override
    public String brand() {
        return "top";
    }

    @Override
    public String name() {
        return "3 roses";
    }

    @Override
    public String calories() {
        return "100cal";
    }
}
