package com.praktikum.main;

import com.praktikum.user.*;

import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {

        Admin admin = new Admin("Gilbert", "006", "Admin006", "Password006");
        Mahasiswa mahasiswa = new Mahasiswa("Gilbert Tetuko Julian Hunsam", "202410370110006");

        int  pilihan;
        Scanner opsi = new Scanner(System.in);
        User user;

        System.out.println("Pilihan login: ");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan pilihan: ");

        pilihan = opsi.nextInt();
        opsi.nextLine();

        if (pilihan == 1) {
            System.out.print("Masukkan username: ");
            String username = opsi.nextLine();
            System.out.print("Masukkan password: ");
            String password = opsi.nextLine();

            if (username.equals("Admin006") && password.equals("Password006")) {
                user = admin;
                user.login(username, password);
                user.displayAppMenu();
            }
        } else if (pilihan == 2) {
            System.out.print("Masukkan nama: ");
            String nama = opsi.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = opsi.nextLine();

            if (nama.equals("Gilbert Tetuko Julian Hunsam") && nim.equals("202410370110006")) {
                user = mahasiswa;
                user.login(nama, nim);
                user.displayAppMenu();
            }
        } else {
            System.out.println("Pilihan tidak tersedia, coba lagi.");
        }
    }
}