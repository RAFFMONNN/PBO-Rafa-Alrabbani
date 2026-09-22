package Praktikum04.TUGAS;

import java.util.ArrayList;
import java.time.LocalDate;

public class Anggota {
    private String idAnggota;
    private String nama;
    private String alamat;
    private String noTelepon;
    private Buku bukuDipinjam; // hanya boleh 1 buku aktif, null jika tidak sedang meminjam
    private ArrayList<Peminjaman> riwayatPeminjaman; // riwayat SEMUA transaksi peminjaman (ArrayList of objects)

    public Anggota(String idAnggota, String nama, String alamat, String noTelepon) {
        this.idAnggota = idAnggota;
        this.nama = nama;
        this.alamat = alamat;
        this.noTelepon = noTelepon;
        this.bukuDipinjam = null;
        this.riwayatPeminjaman = new ArrayList<>();
    }

    public String getNama() {
        return nama;
    }

    public Buku getBukuDipinjam() {
        return bukuDipinjam;
    }

    public void pinjamBuku(Buku buku, String idPeminjaman, LocalDate tanggalPinjam) {
        if (bukuDipinjam != null) {
            System.out.println(nama + " GAGAL meminjam buku \"" + buku.getJudul()
                    + "\": masih punya pinjaman aktif atas buku \"" + bukuDipinjam.getJudul() + "\".");
            return;
        }
        if (buku.getStatusDipinjam()) {
            System.out.println(nama + " GAGAL meminjam buku \"" + buku.getJudul() + "\": buku sedang dipinjam anggota lain.");
            return;
        }
        Peminjaman peminjaman = new Peminjaman(idPeminjaman, this, buku, tanggalPinjam);
        riwayatPeminjaman.add(peminjaman);
        buku.setStatusDipinjam(true);
        bukuDipinjam = buku;
        System.out.println(nama + " berhasil meminjam buku \"" + buku.getJudul() + "\".");
    }

    public void kembalikanBuku(LocalDate tanggalKembali) {
        if (bukuDipinjam == null) {
            System.out.println(nama + " tidak sedang meminjam buku apa pun.");
            return;
        }
        Peminjaman peminjamanAktif = cariPeminjamanAktif();
        if (peminjamanAktif != null) {
            peminjamanAktif.prosesPengembalian(tanggalKembali);
        }
        System.out.println(nama + " mengembalikan buku \"" + bukuDipinjam.getJudul() + "\".");
        bukuDipinjam.setStatusDipinjam(false);
        bukuDipinjam = null;
    }

    private Peminjaman cariPeminjamanAktif() {
        for (Peminjaman p : riwayatPeminjaman) {
            if (p.getStatus().equals("Dipinjam")) {
                return p;
            }
        }
        return null;
    }

    public void tampilkanRiwayatPinjaman() {
        System.out.println("Riwayat peminjaman " + nama + ":");
        if (riwayatPeminjaman.isEmpty()) {
            System.out.println("  (belum pernah meminjam)");
            return;
        }
        for (Peminjaman p : riwayatPeminjaman) {
            p.tampilkanDetail();
        }
    }
}
