/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author vidya
 */
public class Layanan {
    private final int idLayanan;
    protected String namaLayanan;
    protected String deskripsi;
    protected int harga;
    protected String namaHewan;
    protected String namaPemilik;
    protected String jenisHewan;
    protected String rasHewan;
    protected int umurHewan;

    public Layanan(int idLayanan, String namaLayanan, String deskripsi, int harga,
            String namaHewan, String namaPemilik, String jenisHewan, String rasHewan, int umurHewan) {
        this.idLayanan = idLayanan;
        this.namaLayanan = namaLayanan;
        this.deskripsi = deskripsi;
        this.harga = harga;
        this.namaHewan = namaHewan;
        this.namaPemilik = namaPemilik;
        this.jenisHewan = jenisHewan;
        this.rasHewan = rasHewan;
        this.umurHewan = umurHewan;
    }

    public int getIdLayanan() {
        return idLayanan;
    }

    public String getNamaLayanan() {
        return namaLayanan;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public int getHarga() {
        return harga;
    }

    public String getNamaHewan() {
        return namaHewan;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public String getJenisHewan() {
        return jenisHewan;
    }

    public String getRasHewan() {
        return rasHewan;
    }

    public int getUmurHewan() {
        return umurHewan;
    }

    public void setNamaLayanan(String namaLayanan) {
        this.namaLayanan = namaLayanan;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setNamaHewan(String namaHewan) {
        this.namaHewan = namaHewan;
    }

    public void setNamaPemilik(String namaPemilik) {
        this.namaPemilik = namaPemilik;
    }

    public void setJenisHewan(String jenisHewan) {
        this.jenisHewan = jenisHewan;
    }

    public void setRasHewan(String rasHewan) {
        this.rasHewan = rasHewan;
    }

    public void setUmurHewan(int umurHewan) {
        this.umurHewan = umurHewan;
    }

    public void tampilkanInfo() {
        System.out.println("ID Layanan    : " + idLayanan);
        System.out.println("Nama Layanan  : " + namaLayanan);
        System.out.println("Deskripsi     : " + deskripsi);
        System.out.println("Harga         : Rp" + harga);
        System.out.println("Nama Hewan    : " + namaHewan);
        System.out.println("Nama Pemilik  : " + namaPemilik);
        System.out.println("Jenis Hewan   : " + jenisHewan);
        System.out.println("Ras Hewan     : " + rasHewan);
        System.out.println("Umur Hewan    : " + umurHewan + " tahun");
    }

    public final void cetakStatus() {
        System.out.println("Status        : Layanan Aktif");
    }
}
