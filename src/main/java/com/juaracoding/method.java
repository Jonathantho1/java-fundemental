package com.juaracoding;

public class method {
    public static void main(String[] args) {

//        double sisiA = 5;
//        double luaskotakA = sisiA*sisiA;
//        System.out.println(luaskotakA);
//
//        double sisiB = 10;
//        double luaskotakB = sisiB*sisiB;
//        System.out.println(luaskotakB);

        luasKotak(5);
        luasKotak(10);
        System.out.println(luasSegitiga(4,6));
        System.out.println(luasSegitiga(8,10));
        String username = setUsername("admin");
        System.out.println(username);
        System.out.println(compareNumber(1,2));
    }
    static void luasKotak(double sisi){
        double luas = sisi*sisi;
        System.out.println(luas);
    }
    static double luasSegitiga(double alas, double tinggi){
        return 0.5*alas*tinggi;
    }

    static String setUsername(String username){
        return username;
    }
    static boolean compareNumber(int a, int b){
        return a == b;
    }

    // buat method membuat kotak dan pola segitiga
}
