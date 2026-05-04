package base;

public class Mobil extends Kendaraan {
    private int jumlahPintu;
    private String tipeTransmisi;

    public Mobil(String nomorPolisi, String tahunKendaraan, String statusServis, int jumlahPintu, String tipeTransmisi) {
        super(nomorPolisi, tahunKendaraan, statusServis);
        this.jumlahPintu = jumlahPintu;
        this.tipeTransmisi = tipeTransmisi;
    }
    public int getJumlahPintu() {
        return jumlahPintu;
    }
    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }
    public String getTipeTransmisi() {
        return tipeTransmisi;
    }
    public void setTipeTransmisi(String tipeTransmisi) {
        this.tipeTransmisi = tipeTransmisi;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Pintu: " + jumlahPintu);
        System.out.println("Tipe Transmisi: " + tipeTransmisi);
    }
    public void ubahStatusServis(String statusBaru) {
        setStatusServis(statusBaru);
    }
}


