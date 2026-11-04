package Praktikum09;

public abstract class AlatElektronik {
    public double harga;
    public String merk;
    public String warna;

    public void getInfo() {
        System.out.println("Merk          : " + merk);
        System.out.println("Warna         : " + warna);
        System.out.println("Harga         : " + harga);
    }
}
