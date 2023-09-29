package com.juaracoding;

public class Main {
    public static void main(String[] args) {

        int a = 100;
        int b = 120;
        String name = "JuaraCoding";

        System.out.println(a+b);

        //method String
        //Upper
        System.out.println(name.toUpperCase());
        //Lower
        System.out.println(name.toLowerCase());
        //subString
        System.out.println(name.substring(0,4));

        String path = "juara coding";
        System.out.println(path.replace(" ","_"));
    }
}