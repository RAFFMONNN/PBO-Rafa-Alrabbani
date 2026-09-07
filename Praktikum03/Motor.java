package Praktikum03;

public class Motor {
    private String platNomor;
    private boolean statusMesin;
    private int kecepatan;

    public void displayInfo() {
        System.out.println("Plat Nomor: " + platNomor);
        System.out.println("Status Mesin: " + (this.statusMesin ? "On" : "Off"));
        System.out.println("Kecepatan: " + this.kecepatan + " km/h");
        System.out.println("================================");
    }

    public String getPlatNomor() {
        return platNomor;
    }
    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }
    // == 
    public boolean getStatusMesin() {
        return statusMesin;
    }
    public void setStatusMesin(boolean statusMesin) {
        this.statusMesin = statusMesin;
    }
    // ==
    public int getKecepatan() {
        return kecepatan;
    }
    public void setKecepatan(int kecepatan) {//modifkasi kecepatan maks 100
        if (!statusMesin && kecepatan > 0) {
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        } else if (kecepatan > 100) {
            System.out.println("Kecepatan tidak boleh lebih dari 100 km/jam");
            this.kecepatan = 100; // dibatasi otomatis ke nilai maksimal
        } else if (kecepatan < 0) {
            System.out.println("Kecepatan tidak boleh bernilai negatif");
        } else {
            this.kecepatan = kecepatan;
        }
    }
    
}
