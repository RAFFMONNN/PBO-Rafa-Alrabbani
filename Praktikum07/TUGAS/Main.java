package TUGAS;

public class Main {
    public static void main(String[] args) {
        // Instansiasi 2 objek subclass
        Mobil mobil1 = new Mobil("Toyota", "Hitam", 2022, 4, 5);
        System.out.println();
        sepedaListrik sepeda1 = new sepedaListrik("AIMA", "Biru", 2023, 2);
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
    }
}