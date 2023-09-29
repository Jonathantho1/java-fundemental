package com.juaracoding;
import java.util.Arrays;
import java.util.Scanner;

public class javaArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

       int [] arr = new int[5];
        String [] arr2 = {"honda","yamaha","ducati"};

       for (int i = 0; i < arr.length; i++) {
           arr[i] = input.nextInt();
       }
       System.out.println(Arrays.toString(arr));

        System.out.println();
       //for each
        for (String i: arr2) {
            System.out.println(i);
        }

        //array data  buah
        String [] buah = {"Jeruk","Melon","Pisang","Nangka","Kelapa"};
        Arrays.sort(buah);
        System.out.println(Arrays.toString(buah));
        System.out.print("Cari data buah apa: ");
        String cari = input.nextLine();
        Boolean fine = false;
        int index = 0;

        for (int i = 0; i < buah.length; i++) {
            if(buah[i].equalsIgnoreCase(cari)){
                fine = true;
                index = i;
                break;
            }
        }
        if(fine){
            System.out.println("Buah "+cari+" ditemukan pada index ke-"+index);
        }
        else {
            System.out.println("Buah tidak ditemukan");
        }

        //tugas buat program mencari kata terpanjang dari nama buah
    }
}
