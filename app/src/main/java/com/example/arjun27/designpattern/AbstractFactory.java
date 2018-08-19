package com.example.arjun27.designpattern;

public abstract class AbstractFactory {

    abstract Bread getbread(String bread);

    abstract Filling getfilling(String filling);

    abstract Drink getDrink(String drinkType);

}
