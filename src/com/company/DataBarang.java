package com.company;

import java.util.ArrayList;

public class DataBarang {

    ArrayList<Barang> dataBarang = new ArrayList<Barang>();

    void tambahBarang(Barang data){
        this.dataBarang.add(data);
    }
    void hapusBarang(String kode){
        this.dataBarang.removeIf(item -> item.kodeBarang == kode);
    }
    void editBarang(){
        this.dataBarang.set(Integer.parseInt(String.valueOf(15)), new Barang("B016", "Buku Tulis", "Hippo", "kosong"));
    }
    void tampilBarang(){
        System.out.println("------------------------------------------------------------------------");
        for(Barang unit: this.dataBarang){
            unit.print();
        }
    }
}
