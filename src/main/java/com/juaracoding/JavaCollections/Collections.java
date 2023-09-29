package com.juaracoding.JavaCollections;

import java.util.ArrayList;

public class Collections {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        //menambahkan items = add
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        //mengakses satu atau lebih items = get
        System.out.println(cars.get(0));

        //mengubah item = set
        cars.set(0,"toyota");

        //menghapus item = remove
        cars.remove(3);
        System.out.println(cars);

        //collections untuk melihat berapa banyak data = size

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        //beda for index dan for each
        for (String data:cars) {
            System.out.println(data);
        }


    }
}
