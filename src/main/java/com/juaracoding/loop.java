package com.juaracoding;
import java.util.Scanner;

public class loop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();

        for (int i = 0; i < a;i++){
           for(int j = 0; j<= a;j++){
               System.out.print("*");
           }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < a;i++){
            for(int j = 0; j<= i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < a;i++){
            for(int j = a; j > i;j--){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        while(a<5){
            System.out.println(a);
        }

        System.out.println();

        for (int i = 1; i < 5; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
    }
}
