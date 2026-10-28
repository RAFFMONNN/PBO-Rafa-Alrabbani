package Praktikum08.TUGAS;

public class Main {
    public static void main(String[] args) {
        // Kendaraan k = new Kendaraan();  // ERROR: abstract class tidak bisa diinstansiasi

        // Instansiasi 2 objek subclass
        Mobil mobil1 = new Mobil("Toyota", "Hitam", 2022, 4, 5);
        System.out.println();
        SepedaListrik sepeda1 = new SepedaListrik("Polygon", "Biru", 2023, 2);
        System.out.println();

        System.out.println("=== Info Mobil ===");
        System.out.println(mobil1.getInfo());
        mobil1.nyalakan();
        mobil1.nyalakanAc();
        mobil1.matikan();

        System.out.println();
        System.out.println("=== Info Sepeda Listrik ===");
        System.out.println(sepeda1.getInfo());
        sepeda1.nyalakan();
        sepeda1.casBaterai();
        sepeda1.matikan();

        // Referensi bertipe abstract class boleh menunjuk objek subclass
        System.out.println();
        System.out.println("=== Polimorfisme lewat tipe Kendaraan ===");
        Kendaraan[] daftar = { mobil1, sepeda1 };
        for (Kendaraan k : daftar) {
            k.nyalakan();   // versi subclass yang dijalankan
        }
    }
}
