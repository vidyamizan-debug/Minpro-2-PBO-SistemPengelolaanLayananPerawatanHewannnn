/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.kyapetcareminpro2;
import java.util.Scanner;
import Controller.CekKyaPetCare;
import Controller.CRUDKyaPetCare;
import View.Menu;

/**
 *
 * @author vidya
 */
public class KyaPetCareMinpro2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CekKyaPetCare cek = new CekKyaPetCare();
        CRUDKyaPetCare crud = new CRUDKyaPetCare(scanner, cek);
        Menu menu = new Menu();

        boolean berjalan = true;

        while (berjalan) {
            menu.tampilkanMenuUtama();

            int pilihan = cek.inputPilihan(scanner, "Pilih menu (1-5): ", 1, 5);

            switch (pilihan) {
                case 1:
                    crud.tambahLayanan();
                    break;

                case 2:
                    crud.tampilkanLayanan();
                    break;

                case 3:
                    crud.updateLayanan();
                    break;

                case 4:
                    crud.hapusLayanan();
                    break;

                case 5:
                    berjalan = false;
                    System.out.println("\nSampai jumpa lagi nanti!");
                    break;

                default:
                    System.out.println("Pilihan menu tidak tersedia!");
                    break;
            }
        }

        scanner.close();
    }
}
