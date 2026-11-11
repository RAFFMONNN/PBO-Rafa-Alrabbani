// Percobaan Pertanyaan 2.6 no. 5:
// object diinstansiasi dari Pegawai lalu di-downcast menjadi Dosen
public class DowncastTest {
    public static void main(String[] args) {
        Pegawai pegawai = new Pegawai("19800101", "Budi");
        Dosen dosen = (Dosen) pegawai; // lolos compile, error saat runtime
        System.out.println(dosen.nidn);
    }
}
