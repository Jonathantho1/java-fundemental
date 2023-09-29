package com.juaracoding.oop.polymorphism;

public class MainApp {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.sum(1,2);
        calculator.sum(1,2,3);
        calculator.sum(1.24,2.5);

        //basic Class dan Object
        BangunDatar bangunDatar = new BangunDatar();
        bangunDatar.draw();

        //cara instance method overloading
        BangunDatar kotak = new Kotak();
        kotak.draw();
    }
}
