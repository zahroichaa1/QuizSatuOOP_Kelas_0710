import base.Kendaraan;
import base.Mobil;
import base.Motor;

public class Main {
    public static void main(String[] args) {
        Kendaraan kendaraan = new Kendaraan("AG 1234 CD", "2020", "Servis Berkala");
        Motor motor = new Motor("S 1234 CD", "2020", "Servis Berkala", "4-tak", 15.5);
        Mobil mobil = new Mobil("N 5678 EF", "2019", "Servis Ringan", 4, "Otomatis");

        System.out.println("\nInformasi Kendaraan:");
        kendaraan.tampilkanInfo();
        
        System.out.println("Informasi Motor:");
        motor.tampilkanInfo();

        System.out.println("\nInformasi Mobil:");
        mobil.tampilkanInfo();
        
        System.out.println("\nMengubah status servis motor...");
        motor.ubahStatusServis("Servis Berat");
        System.out.println("\nInformasi Motor setelah diubah:");
        motor.tampilkanInfo();
        System.out.println("\nMengubah status servis mobil...");
        mobil.ubahStatusServis("Servis Berat");
        System.out.println("\nInformasi Mobil setelah diubah:");
        mobil.tampilkanInfo();
    }
}
