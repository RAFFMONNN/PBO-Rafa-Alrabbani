package Praktikum08.TUGAS;


public class Mobil extends Kendaraan {
    private int jumlahPintu;
    private int jumlahKursi;

    public Mobil() {
        this.jumlahPintu = 0;
        this.jumlahKursi = 0;
        System.out.println("Constructor Mobil tanpa parameter");
    }

    public Mobil(String merk, String warna, int tahun, int jumlahPintu, int jumlahKursi) {
        super(merk, warna, tahun);
        this.jumlahPintu = jumlahPintu;
        this.jumlahKursi = jumlahKursi;
        
        System.out.println("Constructor Mobil berparameter");
    }

    public void nyalakan() {
        System.out.println("Mobil dinyalakan dengan menekan tombol start");
    }

    public String getInfo() {
        return super.getInfo()
             + "Jumlah Pintu : " + jumlahPintu + "\n"
             + "Jumlah Kursi : " + jumlahKursi + "\n";
    }

    public void nyalakanAc() {
        System.out.println("AC mobil dinyalakan");
    }
}
    
