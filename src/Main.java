/**
 * import untuk memasukkan inputan donatur
 */
import java.util.Scanner;

/**
 * Kelas utama untuk menjalankan program DonasiApp.
 * Program akan meminta input jumlah donasi dari pengguna.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah donasi (Rp): ");
        double jumlah = input.nextDouble();

        DonasiApp donasi = new DonasiApp("Irgi", jumlah);
        donasi.tampilkanDonasi();
        System.out.println("silahkan berdonasi kembali");

        input.close();
    }
}
