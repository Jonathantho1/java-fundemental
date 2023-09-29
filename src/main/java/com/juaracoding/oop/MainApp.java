package com.juaracoding.oop;

import com.juaracoding.oop.fruit.fruit;

public class MainApp {
    public static void main(String[] args) {

        fruit Fruit = new fruit();
        Fruit.grams = 10;
        Fruit.calPerGrams = 500;
        System.out.println(Fruit.totalCalories());
    }
}
