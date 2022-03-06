package com.company;

import java.util.ArrayList;

public class BAG {

    ArrayList<Barang> itemC = new ArrayList<Barang>();

    void tambahBarang2(Barang data){
        this.itemC.add(data);
    }
    void hapusBarang2(String kode){
        this.itemC.removeIf(item -> item.kodeBarang == kode);
    }
    void editBarang2(){
        this.itemC.set(Integer.parseInt(String.valueOf(15)), new Barang("B017", "Buku Tulis", "Sidu", "kosong"));
    }
    void tampilBarang2(){
        System.out.println("------------------------------------------------------------------------");
        for(Barang unit: this.itemC){
            unit.print();
        }
    }


}
