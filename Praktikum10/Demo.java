import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        // ===== 2.3 Heterogenous Collection =====
        Dosen dosen1 = new Dosen("19940201", "Widia, S.Kom. M.Kom", "199402");
        Dosen dosen2 = new Dosen("19700105", "Muhammad, S.T, M.T", "197001");
        TenagaKependidikan tendik1 = new TenagaKependidikan("19750301", "Aida, A.Md.", "Tenaga Administrasi");
        TenagaKependidikan tendik2 = new TenagaKependidikan("19650304", "Rika, S.T.", "Tenaga Laboratorium");

        ArrayList<Pegawai> daftarPegawai = new ArrayList<Pegawai>();
        daftarPegawai.add(dosen1);
        daftarPegawai.add(dosen2);
        daftarPegawai.add(tendik1);
        daftarPegawai.add(tendik2);

        System.out.println("Jumlah Pegawai: " + daftarPegawai.size());

        // ===== 2.4 Object Casting =====
        System.out.println("\n=== Akses lewat reference Dosen ===");
        System.out.println(dosen1.nip);
        System.out.println(dosen1.nama);
        System.out.println(dosen1.nidn);
        dosen1.mengajar();

        // Upcasting (implisit)
        Pegawai pegawai1 = dosen1;

        System.out.println("\n=== Setelah upcasting ke Pegawai ===");
        System.out.println(pegawai1.nip);
        System.out.println(pegawai1.nama);
        // System.out.println(pegawai1.nidn); // compile error: Pegawai tidak punya nidn
        // pegawai1.mengajar();               // compile error: Pegawai tidak punya mengajar()
        pegawai1.displayInfo(); // yang dijalankan displayInfo() milik Dosen (overriding)

        // Downcasting ke TenagaKependidikan -> ClassCastException saat runtime
        System.out.println("\n=== Downcasting ke TenagaKependidikan ===");
        try {
            TenagaKependidikan test = (TenagaKependidikan) pegawai1;
        } catch (ClassCastException e) {
            System.out.println("Runtime error: " + e);
        }

        // Downcasting kembali ke Dosen
        System.out.println("\n=== Downcasting kembali ke Dosen ===");
        Dosen newDosen = (Dosen) pegawai1;
        System.out.println(newDosen.nama);
        System.out.println(newDosen.nidn);
        newDosen.mengajar();

        // ===== 2.5 Polymorphic Arguments & instanceof =====
        System.out.println("\n=== Polymorphic Arguments ===");
        train(dosen1);
        System.out.println();
        train(tendik1);
    }

    public static void train(Pegawai pegawai) {
        pegawai.displayInfo();
        System.out.println("Mengenalkan lingkungan kampus");
        System.out.println("Menginfokan SOP/Juknis");

        // System.out.println(pegawai.nidn);     // compile error
        // System.out.println(pegawai.kategori); // compile error
        // pegawai.mengajar();                   // compile error

        if (pegawai instanceof Dosen) {
            System.out.println("Memberikan pelatihan pedagogik");
        }
    }
}
