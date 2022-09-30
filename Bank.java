package tipedata;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        int saldo = 100000;
        Scanner masukan = new Scanner(System.in);
        System.out.println("SELAMAT DATANG DI BANK");
        System.out.println("saldo saat ini: " + saldo);
        System.out.println("simpan uang: ");
        saldo += masukan.nextInt();
        System.out.println("saldo saat ini : " + saldo);
        System.out.println("ambil uang: ");
        saldo -= masukan.nextInt();
        System.out.println("saldo saat ini: " + saldo);
    }
 
}
