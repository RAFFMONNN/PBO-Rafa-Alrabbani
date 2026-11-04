package Praktikum09;

public class Kipas extends AlatElektronik {
    public String jenis;

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Jenis         : " + jenis);
    }
}
