package Praktikum03;

public class Anggota {

    private int nomorKTP;
    private String nama;
    private int limitPinjaman;
    private int jumlahPinjaman;

    public Anggota(int nomorKTP, String nama, int limitPinjaman) {
        this.nomorKTP = nomorKTP;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman = 0;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNomorKTP() {
        return nomorKTP;
    }

    public void setNomorKTP(int nomorKTP) {
        this.nomorKTP = nomorKTP;
    }

    public int getLimitPinjaman() {
        return limitPinjaman;
    }

    public void setLimitPinjaman(int limitPinjaman) {
        if (limitPinjaman < 0) {
            System.out.println("Limit pinjaman tidak boleh bernilai negatif");
        } else {
            this.limitPinjaman = limitPinjaman;
        }
    }

    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public void pinjam(int jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah pinjaman harus lebih dari 0");
        } else if (jumlah + jumlahPinjaman > limitPinjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit");
        } else {
            jumlahPinjaman += jumlah;
            System.out.println("Pinjaman berhasil. Jumlah pinjaman saat ini: " + jumlahPinjaman);
        }
    }

    public void angsur(int jumlah) {
        double minimalAngsuran = jumlahPinjaman * 0.1; // MODIFIKASI ANGSURAN MINIMAL 10% DARI JUMLAH PINJAMAN
        if (jumlah <= 0) {
            System.out.println("Jumlah angsuran harus lebih dari 0");
        } else if (jumlah < minimalAngsuran) {
            System.out.println("Maaf, jumlah angsuran harus minimal 10% dari jumlah pinjaman");
        } else if (jumlah > jumlahPinjaman) {
            System.out.println("Maaf, jumlah angsuran melebihi jumlah pinjaman");
        } else {
            jumlahPinjaman -= jumlah;
            System.out.println("Angsuran berhasil. Jumlah pinjaman saat ini: " + jumlahPinjaman);
        }
    }

}
