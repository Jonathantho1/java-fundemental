package com.juaracoding;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CRUD {

    public static void main(String[] args) {

        ArrayList<String> data = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int input = 0;

        do {
            System.out.println();
            System.out.println("Data Generator");
            System.out.println("1. Read Data");
            System.out.println("2. Create new Data");
            System.out.println("3. Update Data");
            System.out.println("4. Delete Data");
            System.out.println("5. Logout");
            System.out.print("Choose what to do >>> ");
            input = sc.nextInt();

            System.out.println();

            if (input == 1) {
                read(data);

            } else if (input == 2) {
                create(data,sc,input);

            } else if (input == 3) {
                update(data,sc);

            } else if (input == 4) {
                delete(data,sc);

            } else if (input == 5) {
                System.out.println("logging out...");
            }
        } while (input != 5);
    }

    static void read(ArrayList<String> data){
        if (data.isEmpty()) {
            System.out.println("Data is still Empty");
        } else {
            System.out.println(Arrays.toString(new ArrayList[]{data}));
        }
    }

    static void create(ArrayList<String> data,Scanner sc,int input){
        System.out.print("How many new data you want to put: ");

        input = sc.nextInt(); sc.nextLine();

        for (int i = 0; i < input; i++) {
            System.out.print("Input the data: ");
            data.add(sc.nextLine());
        }
    }

    static void update(ArrayList<String> data, Scanner sc){
        System.out.print("Index number of the data start from 0: ");
        int input = sc.nextInt();
        sc.nextLine();

        System.out.print("Update Data: ");
        String inputData = sc.nextLine();

        data.set(input, inputData);
    }

    static void delete(ArrayList<String> data, Scanner sc){
        System.out.print("Delete data dengan mengisi index: ");

        data.remove(sc.nextInt());
    }

}