/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author vidya
 */
public class Perawatan extends Layanan {
    private String jenisPerawatan;

    public Perawatan(int idLayanan, String namaLayanan, String deskripsi, int harga,
            String namaHewan, String namaPemilik, String jenisHewan, String rasHewan, int umurHewan,
            String jenisPerawatan) {
        super(idLayanan, namaLayanan, deskripsi, harga, namaHewan, namaPemilik, jenisHewan, rasHewan, umurHewan);
        this.jenisPerawatan = jenisPerawatan;
    }

    public String getJenisPerawatan() {
        return jenisPerawatan;
    }

    public void setJenisPerawatan(String jenisPerawatan) {
        this.jenisPerawatan = jenisPerawatan;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis Layanan : Perawatan");
        System.out.println("Jenis Perawatan : " + jenisPerawatan);
    }
}
