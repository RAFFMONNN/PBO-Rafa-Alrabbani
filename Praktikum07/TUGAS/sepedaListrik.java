package TUGAS;

public class sepedaListrik extends Kendaraan {
    private int jumlahRoda;

    // Constructor tanpa parameter (overloading)
    public sepedaListrik() {
        this.jumlahRoda = 0;
        System.out.println("Constructor SepedaListrik tanpa parameter");
    }

    // Constructor berparameter (overloading), memanggil super() berparameter
    public sepedaListrik(String merk, String warna, int tahun, int jumlahRoda) {
        super(merk, warna, tahun);
        this.jumlahRoda = jumlahRoda;
        System.out.println("Constructor SepedaListrik berparameter");
    }

    // Overriding
    @Override
    public void nyalakan() {
        System.out.println("Sepeda listrik dinyalakan dengan tombol power");
    }

    // Overriding
    @Override
    public String getInfo() {
        return super.getInfo()
             + "Jumlah Roda : " + jumlahRoda + "\n";
    }

    public void casBaterai() {
        System.out.println("Baterai sepeda listrik sedang diisi");
    }
}