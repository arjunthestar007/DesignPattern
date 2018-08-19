package com.example.arjun27.designpattern;

public class CurrentUser {

    private String name;

    private static CurrentUser currentUser=new CurrentUser();

    private CurrentUser() {
    }

    public static CurrentUser getCurrentUser() {
        return currentUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
