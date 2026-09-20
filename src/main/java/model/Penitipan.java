/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author vidya
 */
public class Penitipan extends Layanan {
    private int lamaPenitipan;

    public Penitipan(int idLayanan, String namaLayanan, String deskripsi, int harga,
            String namaHewan, String namaPemilik, String jenisHewan, String rasHewan, int umurHewan,
            int lamaPenitipan) {
        super(idLayanan, namaLayanan, deskripsi, harga, namaHewan, namaPemilik, jenisHewan, rasHewan, umurHewan);
        this.lamaPenitipan = lamaPenitipan;
    }

    public int getLamaPenitipan() {
        return lamaPenitipan;
    }

    public void setLamaPenitipan(int lamaPenitipan) {
        this.lamaPenitipan = lamaPenitipan;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis Layanan : Penitipan");
        System.out.println("Lama Penitipan: " + lamaPenitipan + " hari");
    }
}
