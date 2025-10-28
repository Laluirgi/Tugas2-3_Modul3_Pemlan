/**
 * Kelas Donatur disini merupakan data dasar seorang donatur.
 * Kelas ini memiliki atribut nama dan jumlah donasi yang akna digunakan oleh kelas bawannya.
 */
public class Donatur {
    /** Nama donatur */
    private String namaDonatur;

    /** Jumlah donasi*/
    private final double jumlah;

    /**
     * Konstruktor untuk membuat objek Donatur baru.
     */
    public Donatur(String nama, double jumlahDonasi) {
        setNamaDonatur(nama);
        jumlah = jumlahDonasi;
    }

    /**
     * Mengambil nama donatur.
     * @return namaDonatur
     */
    public String getNamaDonatur() {
        return namaDonatur;
    }

    /**
     * Mengambil jumlah donasi.
     * @return jumlah donasi
     */
    public double getJumlah() {
        return jumlah;
    }

    /**
     * Mengatur nama donatur.
     * @param namaDonatur nama donatur yang akan diset
     */
    public void setNamaDonatur(String namaDonatur) {
        this.namaDonatur = namaDonatur;
    }
}
