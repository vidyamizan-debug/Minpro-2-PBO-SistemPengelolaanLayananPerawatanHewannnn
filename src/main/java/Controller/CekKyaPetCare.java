/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import java.util.Scanner;

/**
 *
 * @author vidya
 */
public class CekKyaPetCare {
    public int inputAngka(Scanner scanner, String pesan) {
        while (true) {
            System.out.print(pesan);
            String input = scanner.nextLine();

            try {
                return Integer.parseInt(input.trim());
            } catch (NumberFormatException e) {
                System.out.println("ID yang dimasukkan harus berupa angka!");
            }
        }
    }

    public int inputAngkaPositif(Scanner scanner, String pesan) {
        while (true) {
            int angka = inputAngka(scanner, pesan);

            if (angka > 0) {
                return angka;
            }

            System.out.println("ID yang dimasukkan harus lebih dari 0!");
        }
    }

    public String inputString(Scanner scanner, String pesan) {
        while (true) {
            System.out.print(pesan);
            String input = scanner.nextLine();

            if (!input.trim().isEmpty()) {
                return input;
            }

            System.out.println("Data tidak boleh kosong!");
        }
    }

    public int inputPilihan(Scanner scanner, String pesan, int min, int max) {
        while (true) {
            int pilihan = inputAngka(scanner, pesan);

            if (pilihan >= min && pilihan <= max) {
                return pilihan;
            }

            System.out.println("Pilihan hanya " + min + " sampai " + max + "!");
        }
    }

    public boolean inputYaTidak(Scanner scanner, String pesan) {
        while (true) {
            System.out.print(pesan);
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("ya")) {
                return true;
            } else if (input.equalsIgnoreCase("tidak")) {
                return false;
            }

            System.out.println("Jawaban harus 'ya' atau 'tidak'!");
        }
    }
}
