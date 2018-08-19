package com.example.arjun27.designpattern;

public class BreadFactory extends AbstractFactory {

    @Override
    Bread getbread(String bread) {
        if(bread=="BRI"){
            return new Brioche();
        }
        else if(bread == "BAG"){
            return new Baguette();
        }
        else if(bread == "ROL"){
            return new Roll();
        }
        return null;
    }

    @Override
    Filling getfilling(String filling) {
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
