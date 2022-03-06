package com.company;

public class Barang {
    // atribut
    String namaBarang, kodeBarang, jenisBarang, stokSaatIni;

    Barang(String kode, String jenis, String nama, String stok){
        this.kodeBarang = kode;
        this.jenisBarang = jenis;
        this.namaBarang = nama;
        this.stokSaatIni = stok;
    }

    // method untuk menampilkan object Barang
    void print(){
        System.out.println("Kode Barang: " + this.kodeBarang);
        System.out.println("Jenis Barang: " + this.jenisBarang);
        System.out.println("Nama Barang: " + this.namaBarang);
        System.out.println("Stok Saat Ini: " + this.stokSaatIni);
    }
}
