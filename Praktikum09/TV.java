package Praktikum09;

public class TV extends AlatElektronik implements Audible {
    public String jenisLayar;
    public int volume;

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
        System.out.println("Jenis Layar   : " + jenisLayar);
        System.out.println("Volume        : " + volume);
    }
}
