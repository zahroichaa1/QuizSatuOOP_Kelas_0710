import base.Kendaraan;
import base.Mobil;
import base.Motor;

public class Main {
    public static void main(String[] args) {
        Motor motor1 = new Motor("Motor", "B 1234 CD", "2020", "Servis Berkala", "4-tak", 15.5);
        Mobil mobil1 = new Mobil("Mobil", "B 5678 EF", "2019", "Servis Ringan", 4, "Otomatis");

        System.out.println("Informasi Motor:");
        motor1.tampilkanInfo();

        System.out.println("\nInformasi Mobil:");
        mobil1.tampilkanInfo();
    }
}
