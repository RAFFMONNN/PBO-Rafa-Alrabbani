public class Dosen extends Pegawai implements Comparable<Dosen> {
    public String nidn;

    public Dosen() {
    }

    public Dosen(String nip, String nama, String nidn) {
        super(nip, nama);
        this.nidn = nidn;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("NIDN: " + nidn);
    }

    public void mengajar() {
        System.out.println("Membuat rencana pembelajaran");
        System.out.println("Menyusun materi");
        System.out.println("Melaksanakan PBM");
        System.out.println("Melakukan evaluasi");
    }

    // Pengurutan berdasarkan nama (langkah 2.9 no. 7)
    // @Override
    // public int compareTo(Dosen otherDosen) {
    //     return this.nama.compareTo(otherDosen.nama);
    // }

    // Pengurutan berdasarkan NIDN (Pertanyaan 2.10 no. 3)
    @Override
    public int compareTo(Dosen otherDosen) {
        return this.nidn.compareTo(otherDosen.nidn);
    }
}
