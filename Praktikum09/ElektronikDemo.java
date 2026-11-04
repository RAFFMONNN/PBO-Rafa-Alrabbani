package Praktikum09;

public class ElektronikDemo {
    public static void main(String[] args) {
        Kulkas kulkas = new Kulkas();
        kulkas.merk = "Sharp";
        kulkas.warna = "Silver";
        kulkas.harga = 3500000;
        kulkas.jumlahPintu = 2;

        TV tv = new TV();
        tv.merk = "Samsung";
        tv.warna = "Hitam";
        tv.harga = 5000000;
        tv.jenisLayar = "LED";
        tv.volume = 10;
        tv.naikkanVolume();
        tv.naikkanVolume();
        tv.turunkanVolume();

        System.out.println("=== Info Kulkas ===");
        kulkas.getInfo();
        System.out.println();
        System.out.println("=== Info TV ===");
        tv.getInfo();
    }
}
