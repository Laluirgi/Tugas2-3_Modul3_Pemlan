public class DonasiApp extends Donatur {

    public static final String UCAPAN_TERIMA_KASIH = "Terima kasih atas donasinya!";

    public DonasiApp(String nama, double jumlahDonasi) {
        super(nama, jumlahDonasi);
    }

    public void tampilkanDonasi() {
        System.out.println("Nama Donatur: " + getNamaDonatur());
        System.out.println("Jumlah Donasi: Rp " + getJumlah());
        System.out.println(UCAPAN_TERIMA_KASIH);
    }
}
