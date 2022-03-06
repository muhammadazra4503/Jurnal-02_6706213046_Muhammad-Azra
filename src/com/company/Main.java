package com.company;

public class Main {
    public static void main(String[] args) {
        DataBarang toko = new DataBarang();

        // menambah beberapa data barang ke dalam array list
        toko.tambahBarang(new Barang("A005", "Spidol","Snowman board marker","Ada"));
        toko.tambahBarang(new Barang("A006", "Pulpen","Snowman","Ada"));
        toko.tambahBarang(new Barang("A007", "Pulpen","Joyko","Ada"));
        toko.tambahBarang(new Barang("A009", "Pulpen","Faster","Ada"));
        toko.tambahBarang(new Barang("A015", "Pulpen","Standard R6","Ada"));
        toko.tambahBarang(new Barang("A014", "Pensil","Faber Castell","Ada"));
        toko.tambahBarang(new Barang("A022", "Pensil","Joyko","Ada"));
        toko.tambahBarang(new Barang("A023", "Pensil","Steadler","Ada"));
        toko.tambahBarang(new Barang("A024", "Pensil","Kenko","Ada"));
        toko.tambahBarang(new Barang("A025", "Pensil","Artline","kosong"));
        toko.tambahBarang(new Barang("B011", "Buku Tulis", "Sidu", "ada"));
        toko.tambahBarang(new Barang("B012", "Buku Tulis", "Bola Dunia", "ada"));
        toko.tambahBarang(new Barang("B013", "Buku Tulis", "Kiky", "ada"));
        toko.tambahBarang(new Barang("B014", "Buku Tulis", "Platinum", "ada"));
        toko.tambahBarang(new Barang("B021", "Kertas", "HVS", "ada"));
        toko.tambahBarang(new Barang("B022", "Kertas", "Folio", "ada"));
        toko.tambahBarang(new Barang("B023", "Kertas", "Karton", "ada"));
        toko.tambahBarang(new Barang("B024", "Kertas", "Origami", "ada"));
        toko.tambahBarang(new Barang("B025", "Kertas", "Manila", "ada"));
        toko.tambahBarang(new Barang("C011", "Tempat Pensil", "AMCO","kosong"));
        toko.tambahBarang(new Barang("C012", "Tempat Pensil", "Plastik","ada"));
        toko.tambahBarang(new Barang("C012", "Tas", "Eiger","ada"));
        toko.tambahBarang(new Barang("C012", "Tas", "Pacsafe","ada"));
        toko.tambahBarang(new Barang("C012", "Rak Buku", "Joyko","ada"));

        // Untuk menampilkan data barang arraylist
        toko.tampilBarang();

        // Untuk menghapus data barang
        toko.hapusBarang("A015");

        // Untuk menampilkan data barang yang telah berubah atau mengalami perubahan
        toko.tampilBarang();

        // Untuk mengedit data barang
        toko.editBarang();

        // Untuk menampilkan data barang yang telah berubah atau mengalami perubahan
        toko.tampilBarang();
    }
}

