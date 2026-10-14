package TUGAS;

public class Kendaraan {
    protected String merk;
    protected String warna;
    protected int tahun;

    // Constructor tanpa parameter (overloading)
    public Kendaraan() {
        this.merk = "Tidak diketahui";
        this.warna = "Tidak diketahui";
        this.tahun = 0;
        System.out.println("Constructor Kendaraan tanpa parameter");
    }

    // Constructor berparameter (overloading)
    public Kendaraan(String merk, String warna, int tahun) {
        this.merk = merk;
        this.warna = warna;
        this.tahun = tahun;
        System.out.println("Constructor Kendaraan berparameter");
    }

    public void nyalakan() {
        System.out.println("Kendaraan dinyalakan");
    }

    public void matikan() {
        System.out.println("Kendaraan dimatikan");
    }

    public String getInfo() {
        return "Merk  : " + merk + "\n"
             + "Warna : " + warna + "\n"
             + "Tahun : " + tahun + "\n";
    }
}