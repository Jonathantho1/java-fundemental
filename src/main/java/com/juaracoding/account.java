package com.juaracoding;
import java.util.Scanner;

public class account {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String Username = input.nextLine();
        String Password = input.nextLine();
        String Email = input.nextLine();
        String phoneNum = input.nextLine();
        int Umur = input.nextInt();
        boolean isActive = input.nextBoolean();

        System.out.println("Username: "+ Username);
        System.out.println("Password: "+ Password);
        System.out.println("Email: "+ Email);
        System.out.println("Phone Number: "+phoneNum);
        System.out.println("Date of Birth: "+ Umur);
        System.out.println("Active Status: " + isActive);
    }
}
