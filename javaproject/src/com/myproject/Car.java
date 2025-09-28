package com.myproject;

public class Car extends Vehicle {
    private int doors;
    private boolean electric;

    public Car(String brand, int year, int doors, boolean electric) {
        super(brand, year); // call Vehicle constructor
        this.doors = doors;
        this.electric = electric;
    }

    public void honkHorn() {
        System.out.println(getBrand() + " goes 'Beep beep!'");
    }

    public void chargeBattery() {
        if (electric) {
            System.out.println(getBrand() + " is charging its battery.");
        } else {
            System.out.println(getBrand() + " is not electric and doesn’t need charging.");
        }
    }
}
//javac src/com/myproject/*.java
//java -cp src com.myproject.Main