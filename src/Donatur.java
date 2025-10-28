public class Donatur {
    private String namaDonatur;
    private final double jumlah;

    public Donatur(String nama, double jumlahDonasi) {
        setNamaDonatur(nama);
        jumlah = jumlahDonasi;
    }

    public String getNamaDonatur() {
        return namaDonatur;
    }

    public double getJumlah() {
        return jumlah;
    }

    public void setNamaDonatur(String namaDonatur) {
        this.namaDonatur = namaDonatur;
    }
}
