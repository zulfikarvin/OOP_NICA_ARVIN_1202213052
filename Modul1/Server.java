package Modul1;

import java.util.Scanner;

public class Server {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Selamat Datang di Restoran EAD");
        System.out.println("Silahkan Register Terlebih Dahulu");
        System.out.println("========================");
        // TODO Create Database
        System.out.print("Nama : ");
        String nama = input.nextLine();
        System.out.print("No. Handphone :");
        String handphone = input.nextLine();
        
        // TODO Create Menu
        System.out.print("==================");
        System.out.println("1.Menu\n2.Pilih Menu\n3.Keluar");
        System.out.print("Masukkan Pilihan : ");
        int mainmenu = input.nextInt();

        // TODO Insert Menu to Database


        // TODO Display Main Menu

        // TODO Create User

        // Display Menu
    }
}