package Praktikum04.TUGAS;

import java.time.LocalDate;

public class Peminjaman {
    private String idPeminjaman;
    private Anggota anggota;
    private Buku buku;
    private LocalDate tanggalPinjam;
    private LocalDate tanggalKembali;
    private String status; // "Dipinjam" atau "Dikembalikan"

    public Peminjaman(String idPeminjaman, Anggota anggota, Buku buku, LocalDate tanggalPinjam) {
        this.idPeminjaman = idPeminjaman;
        this.anggota = anggota;
        this.buku = buku;
        this.tanggalPinjam = tanggalPinjam;
        this.tanggalKembali = null;
        this.status = "Dipinjam";
    }

    public String getIdPeminjaman() {
        return idPeminjaman;
    }

    public String getStatus() {
        return status;
    }

    public void prosesPengembalian(LocalDate tanggalKembali) {
        this.tanggalKembali = tanggalKembali;
        this.status = "Dikembalikan";
    }

    public void tampilkanDetail() {
        System.out.println("  [" + idPeminjaman + "] " + buku.getJudul()
                + " | Pinjam: " + tanggalPinjam
                + " | Kembali: " + (tanggalKembali == null ? "-" : tanggalKembali)
                + " | Status: " + status);
    }
}
