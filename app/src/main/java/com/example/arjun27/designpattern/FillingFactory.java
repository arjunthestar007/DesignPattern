package com.example.arjun27.designpattern;

public class FillingFactory  extends AbstractFactory{

    @Override
    Bread getbread(String bread) {
        if(bread=="BRI"){
            return new Brioche();
        }
        return null;
    }

    @Override
    Filling getfilling(String filling) {
        if (filling == null) {
            return null;
        }
        if (filling == "CHE") {
            return new Cheese();
        } else if (filling == "TOM") {
            return new Tomato();
        }
        return null;
    }

    @Override
    Drink getDrink(String drinkType) {

        if(drinkType=="TEA"){
            return new Tea();
        }
        return null;
    }
}
