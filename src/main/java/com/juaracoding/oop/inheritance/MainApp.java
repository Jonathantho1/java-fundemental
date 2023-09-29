package com.juaracoding.oop.inheritance;

public class MainApp {

    public static void main(String[] args) {
        Karyawan karyawan = new Karyawan();
        karyawan.name = "Admin";

        Manager manager = new Manager();
        manager.name = "Wakanda";

        System.out.println(manager.name);

        manager.salary = 20000;
        double tax = manager.tax(0.5);

        System.out.println("Salary: "+manager.salary);
        System.out.println("After Tax Salary: "+tax);
    }
}
