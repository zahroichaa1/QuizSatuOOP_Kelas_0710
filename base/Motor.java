package base;

public class Motor extends Kendaraan {
    private String jenisMesin;
    private double kapasitasTangki;

    public Motor(String jenisKendaraan, String nomorPolisi, String tahunKendaraan, String statusServis, String jenisMesin, double kapasitasTangki) {
        super(jenisKendaraan, nomorPolisi, tahunKendaraan, statusServis);
        this.jenisMesin = jenisMesin;
        this.kapasitasTangki = kapasitasTangki;
    }
    public String getJenisMesin() {
        return jenisMesin;
    }
    public void setJenisMesin(String jenisMesin) {
        this.jenisMesin = jenisMesin;
    }
    public double getKapasitasTangki() {
        return kapasitasTangki;
    }
    public void setKapasitasTangki(double kapasitasTangki) {
        this.kapasitasTangki = kapasitasTangki;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis Mesin: " + jenisMesin);
        System.out.println("Kapasitas Tangki: " + kapasitasTangki);
    }
    
}
