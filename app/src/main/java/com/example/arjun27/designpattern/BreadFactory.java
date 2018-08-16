package com.example.arjun27.designpattern;

public class BreadFactory {

    public Bread getBread(String breadType){

        if(breadType=="BRI"){
            return new Brioche();
        }
        else if(breadType == "BAG"){
            return new Baguette();
        }
        else if(breadType == "ROL"){
            return new Roll();
        }
        return null;
    }

}
