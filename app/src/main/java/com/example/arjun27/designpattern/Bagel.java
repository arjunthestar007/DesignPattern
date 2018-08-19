package com.example.arjun27.designpattern;

public class Bagel extends Bread{
    @Override
    public String name() {
        return "Bagel";
    }

    @Override
    public int calories() {
        return 20;
    }
}
