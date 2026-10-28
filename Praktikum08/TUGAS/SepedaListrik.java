package Praktikum08.TUGAS;

public class SepedaListrik extends Kendaraan {
    private int jumlahRoda;

    public SepedaListrik() {
        this.jumlahRoda = 0;
        System.out.println("Constructor SepedaListrik tanpa parameter");
    }

    public SepedaListrik(String merk, String warna, int tahun, int jumlahRoda) {
        super(merk, warna, tahun);
        this.jumlahRoda = jumlahRoda;
        System.out.println("Constructor SepedaListrik berparameter");
    }

    @Override
    public void nyalakan() {
        System.out.println("Sepeda listrik dinyalakan dengan tombol power");
    }

    @Override
    public String getInfo() {
        return super.getInfo()
             + "Jumlah Roda : " + jumlahRoda + "\n";
    }

    public void casBaterai() {
        System.out.println("Baterai sepeda listrik sedang diisi");
    }
}