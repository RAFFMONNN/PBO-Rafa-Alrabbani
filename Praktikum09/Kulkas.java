package Praktikum09;

public class Kulkas extends AlatElektronik {
    public int jumlahPintu;

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Jumlah Pintu  : " + jumlahPintu);
    }
}
