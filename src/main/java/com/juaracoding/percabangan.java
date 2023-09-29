package com.juaracoding;
import java.util.Scanner;

public class percabangan {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int score;

        do {
            score = input.nextInt();
            
            if (score <= 100 && score >= 91){
                System.out.println("Your grade is A");
            }
            else if (score <= 90 && score >= 81) {
                System.out.println("Your grade is B");
            }
            else if(score <= 80 && score >= 71){
                System.out.println("Your grade is C");
            }
            else if(score <= 70 && score >= 61){
                System.out.println("your grade is D");
            }
            else if (score <= 60 && score >= 1) {
                System.out.println("your grade is E");
            }
            else if (score == 0) {
                System.out.println("Your grade is F");
            }
        }while(score < 0 || score > 100);
    }
}