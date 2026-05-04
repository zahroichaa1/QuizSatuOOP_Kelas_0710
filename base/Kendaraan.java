package base;

public class Kendaraan {
    private String jenisKendaraan;
    private String nomorPolisi;
    private String tahunKendaraan;
    private String statusServis;

    public Kendaraan(String jenisKendaraan, String nomorPolisi, String tahunKendaraan, String statusServis) {
        this.jenisKendaraan = jenisKendaraan;
        this.nomorPolisi = nomorPolisi;
        this.tahunKendaraan = tahunKendaraan;
        this.statusServis = statusServis;
    }

    public String getJenisKendaraan(){
        return jenisKendaraan;
    }

    public String getNomorPolisi(){
        return nomorPolisi;
    }

    public String getTahunKendaraan(){
        return tahunKendaraan;
    }

    public String getStatusServis(){
        return statusServis;
    }
    public void setJenisKendaraan(String jenisKendaraan){
        this.jenisKendaraan = jenisKendaraan;
    }
    public void setNomorPolisi(String nomorPolisi){
        this.nomorPolisi = nomorPolisi;
    }
    public void setTahunKendaraan(String tahunKendaraan){
        this.tahunKendaraan = tahunKendaraan;
    }
    public void setStatusServis(String statusServis){
        this.statusServis = statusServis;
    }

    public void tampilkanInfo() {
        System.out.println("Jenis Kendaraan: " + jenisKendaraan);
        System.out.println("Nomor Polisi: " + nomorPolisi);
        System.out.println("Tahun Kendaraan: " + tahunKendaraan);
        System.out.println("Status Servis: " + statusServis);
    }
}