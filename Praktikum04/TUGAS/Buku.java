package Praktikum04.TUGAS;

public class Buku {
    private String idBuku;
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private boolean statusDipinjam;

    public Buku(String idBuku, String judul, String penulis, int tahunTerbit) {
        this.idBuku = idBuku;
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.statusDipinjam = false;
    }

    public String getIdBuku() {
        return idBuku;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public boolean getStatusDipinjam() {
        return statusDipinjam;
    }

    public void setStatusDipinjam(boolean status) {
        this.statusDipinjam = status;
    }

    public void tampilkanInfo() {
        System.out.println("[" + idBuku + "] " + judul + " - " + penulis + " (" + tahunTerbit + ") | Status: "
                + (statusDipinjam ? "Dipinjam" : "Tersedia"));
    }
}
