package com.bilgee.Recap_method;

public class Student {
    // Variables
    public int age;
    public String name;
    public boolean isTired;

    // Constructor
    public Student(int age, String name, boolean isTired) {
        this.age = age;
        this.name = name;
        this.isTired = isTired;
    }


    // Methods
    // TODO - Create methods
    public String showIfSleepy () {
        if(isTired) {
           return name + " is very tired";
        }else {
            return name + " is NOT tired";
        }


    }

}
