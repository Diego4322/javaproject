package com.myproject;

public class Main {
    public static void main(String[] args) {
        // Superclass object
        Vehicle genericVehicle = new Vehicle("Generic Motors", 1999);
        genericVehicle.displayInfo();
        genericVehicle.startEngine();

        // Subclass object
        Car tesla = new Car("Tesla Model 3", 2024, 4, true);
        tesla.displayInfo();   
        tesla.startEngine();   
        tesla.honkHorn();     
        tesla.chargeBattery();
    }
}
