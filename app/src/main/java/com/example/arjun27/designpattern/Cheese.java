package com.example.arjun27.designpattern;

public class Cheese implements Filling {
    @Override
    public String name() {
        return "Cheese";
    }

    @Override
    public String calories() {
        return " : 50 kcal";
    }
}
