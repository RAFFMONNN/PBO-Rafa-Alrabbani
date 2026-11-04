package Praktikum09;

public class SmartFridge extends Kulkas implements Audible {
    public int volume;
    public String ukuranLayar;

    @Override
    public void naikkanVolume() {
        volume += 1;
    }

    @Override
    public void turunkanVolume() {
        volume -= 1;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Ukuran Layar  : " + ukuranLayar);
        System.out.println("Volume        : " + volume);
    }
}
