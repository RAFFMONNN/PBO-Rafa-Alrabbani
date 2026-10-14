public class Dosen extends Pegawai {

    public String nidn;

    public Dosen()  {
        System.out.println("Ini adalah constructor class Dosen");
    }
    
    public String getAllInfo() {
        String info = "";
        info += "NIP: " + nip + "\n";
        info += "Nama: " + nama + "\n";
        info += "Gaji: " + gaji + "\n";
        info += "NIDN: " + nidn + "\n";
        return info;
    }
}
