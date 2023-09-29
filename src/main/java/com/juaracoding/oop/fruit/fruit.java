package com.juaracoding.oop.fruit;

public class fruit {
    public int grams;
    public int calPerGrams;

    public int totalCalories(){
        return grams*calPerGrams;
    }
}
