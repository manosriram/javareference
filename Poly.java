import java.io.*;
import java.util.*;

class Vehicle {
    String regNo;
    int model;

    Vehicle(String s, int r) {
        regNo = s;
        model = r;
    }

    void display() {
        System.out.println("RegNo : " + regNo + " model : " + model);
    }
}

class Car extends Vehicle {
    int wheels;

    Car(String s, int m, int n) {
        super(s, m);
        wheels = n;
    }

    void display() {
        System.out.println("Car : ");
        System.out.println("No of Wheels : " + wheels);
        super.display();
    }
}

class Auto extends Vehicle {
    int wheels;

    Auto(String s, int m, int n) {
        super(s, m);
        wheels = n;
    }

    void display() {
        System.out.println("Auto : ");
        System.out.println("No of Wheels : " + wheels);
        super.display();
    }
}

class Poly {
    public static void main(String args[]) {

        Car c = new Car("AP31 BT450", 1234, 4);
        Auto au = new Auto("AP31 1234", 9898, 3);

        c.display();
        au.display();
    }
}