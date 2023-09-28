package com.bilgee.Recap_method;

public class Main {
    public static void main(String[] args) {

        // Object creation AKA Instantiation
        // När man skapar en objekt alltid börja med klassens namn. Det heter datatype
        Student benny = new Student(15,"Benny", true);
        Student frida = new Student(22,"Frida", false);

        // Set object Values


        // Print object values
        System.out.println(benny.name);
        System.out.println(benny.age);
        System.out.println(benny.showIfSleepy());

        System.out.println(frida.name);
        System.out.println(frida.age);
        System.out.println(frida.showIfSleepy());



    }

}
