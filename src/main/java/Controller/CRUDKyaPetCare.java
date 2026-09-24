/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import java.util.ArrayList;
import java.util.Scanner;
import model.Layanan;
import model.Perawatan;
import model.Penitipan;

/**
 *
 * @author vidya
 */
public class CRUDKyaPetCare {
    private ArrayList<Layanan> daftarLayanan;
    private Scanner scanner;
    private CekKyaPetCare cek;

    public CRUDKyaPetCare(Scanner scanner, CekKyaPetCare cek) {
        this.scanner = scanner;
        this.cek = cek;
        this.daftarLayanan = new ArrayList<>();

        daftarLayanan.add(new Perawatan(1, "Perawatan Kucing", "Grooming Kutu & potong kuku", 120000, "Kiya", "Kansa", "Kucing", "Himalayan", 2, "Grooming"));
        daftarLayanan.add(new Penitipan(2, "Penitipan Anjing", "Jasa titip beberapa hari", 150000, "Karbondioksida", "Vidiya", "Anjing", "Chihuahua", 2, 3));
    }

    public void tambahLayanan() {
        System.out.println("\n+---------------------+");
        System.out.println("| Tambah Data Layanan |");
        System.out.println("+---------------------+");
        System.out.println("| 1. Perawatan        |");
        System.out.println("| 2. Penitipan        |");
        System.out.println("+---------------------+");
        int jenis = cek.inputPilihan(scanner, "Pilih jenis layanan (1-2): ", 1, 2);

        int id = cek.inputAngkaPositif(scanner, "ID Layanan: ");

        if (cariLayanan(id) != null) {
            System.out.println("ID ini sudah digunakan!");
            return;
        }

        String namaLayanan = cek.inputString(scanner, "Nama Layanan: ");
        String deskripsi = cek.inputString(scanner, "Deskripsi: ");
        int harga = cek.inputAngkaPositif(scanner, "Harga: ");
        String namaHewan = cek.inputString(scanner, "Nama Hewan: ");
        String namaPemilik = cek.inputString(scanner, "Nama Pemilik: ");
        String jenisHewan = cek.inputString(scanner, "Jenis Hewan: ");
        String rasHewan = cek.inputString(scanner, "Ras Hewan: ");
        int umurHewan = cek.inputAngkaPositif(scanner, "Umur Hewan: ");

        if (jenis == 1) {
            String jenisPerawatan = cek.inputString(scanner, "Jenis Perawatan: ");

            Perawatan layanan = new Perawatan(id, namaLayanan, deskripsi, harga, namaHewan, namaPemilik, jenisHewan, rasHewan, umurHewan, jenisPerawatan);

            daftarLayanan.add(layanan);
        } else {
            int lamaPenitipan = cek.inputAngkaPositif(scanner, "Lama Penitipan (hari): ");

            Penitipan layanan = new Penitipan(id, namaLayanan, deskripsi, harga, namaHewan, namaPemilik, jenisHewan, rasHewan, umurHewan, lamaPenitipan);

            daftarLayanan.add(layanan);
        }

        System.out.println("Horee! data sudah berhasil ditambahkan.");
    }

    public void tampilkanLayanan() {
        System.out.println("\n+--------------------------------------+");
        System.out.println("|             Data Layanan             |");
        System.out.println("+--------------------------------------+");

        if (daftarLayanan.isEmpty()) {
            System.out.println("Belum ada data layanan.");
            return;
        }

        for (Layanan layanan : daftarLayanan) {
            System.out.println("+--------------------------------------+");
            layanan.tampilkanInfo();
            layanan.cetakStatus();
        }

        System.out.println("+--------------------------------------+");
    }

    public void updateLayanan() {
        System.out.println("\n+--------------------------------------+");
        System.out.println("|          Update Data Layanan         |");
        System.out.println("+--------------------------------------+");

        int id = cek.inputAngkaPositif(scanner, "Masukkan ID Layanan: ");
        Layanan layanan = cariLayanan(id);

        if (layanan == null) {
            System.out.println("Maaff, data tidak berhasil untuk ditemukan!");
            return;
        }

        String namaLayanan = cek.inputString(scanner, "Nama Layanan Baru: ");
        String deskripsi = cek.inputString(scanner, "Deskripsi Baru: ");
        int harga = cek.inputAngkaPositif(scanner, "Harga Baru: ");
        String namaHewan = cek.inputString(scanner, "Nama Hewan Baru: ");
        String namaPemilik = cek.inputString(scanner, "Nama Pemilik Baru: ");
        String jenisHewan = cek.inputString(scanner, "Jenis Hewan Baru: ");
        String rasHewan = cek.inputString(scanner, "Ras Hewan Baru: ");
        int umurHewan = cek.inputAngkaPositif(scanner, "Umur Hewan Baru: ");

        layanan.setNamaLayanan(namaLayanan);
        layanan.setDeskripsi(deskripsi);
        layanan.setHarga(harga);
        layanan.setNamaHewan(namaHewan);
        layanan.setNamaPemilik(namaPemilik);
        layanan.setJenisHewan(jenisHewan);
        layanan.setRasHewan(rasHewan);
        layanan.setUmurHewan(umurHewan);

        if (layanan instanceof Perawatan) {
            Perawatan perawatan = (Perawatan) layanan;
            String jenisPerawatan = cek.inputString(scanner, "Jenis Perawatan Baru: ");
            perawatan.setJenisPerawatan(jenisPerawatan);
        } else if (layanan instanceof Penitipan) {
            Penitipan penitipan = (Penitipan) layanan;
            int lamaPenitipan = cek.inputAngkaPositif(scanner, "Lama Penitipan Baru (hari): ");
            penitipan.setLamaPenitipan(lamaPenitipan);
        }

        System.out.println("\nHoree! data sudah berhasil diupdate.");
    }

    public void hapusLayanan() {
        System.out.println("\n+--------------------------------------+");
        System.out.println("|          Hapus Data Layanan          |");
        System.out.println("+--------------------------------------+");

        int id = cek.inputAngkaPositif(scanner, "Masukkan ID Layanan: ");
        Layanan layanan = cariLayanan(id);

        if (layanan == null) {
            System.out.println("Maaff, data tidak berhasil untuk ditemukan!");
            return;
        }

        layanan.tampilkanInfo();
        boolean yakin = cek.inputYaTidak(scanner, "\nYakin ingin menghapus data ini? (ya/tidak): ");

        if (yakin) {
            daftarLayanan.remove(layanan);
            System.out.println("\nData layanan berhasil dihapus!");
        } else {
            System.out.println("\nPenghapusan data dibatalkan.");
        }
    }

    private Layanan cariLayanan(int id) {
        for (Layanan layanan : daftarLayanan) {
            if (layanan.getIdLayanan() == id) {
                return layanan;
            }
        }

        return null;
    }
}
