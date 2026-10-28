package Praktikum08.TUGAS;


    public abstract class Kendaraan {
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

    // Method abstract: tidak punya isi, WAJIB di-override oleh subclass
    public abstract void nyalakan();

    // Method konkret: punya isi, diwarisi apa adanya
    public void matikan() {
        System.out.println("Kendaraan dimatikan");
    }

    // Method konkret yang di-override subclass
    public String getInfo() {
        return "Merk  : " + merk + "\n"
             + "Warna : " + warna + "\n"
             + "Tahun : " + tahun + "\n";
    }
}
