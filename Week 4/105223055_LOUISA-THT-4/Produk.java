public class Produk {
    private String kode;
    private String nama;
    private double harga;
    private int stok;

    public Produk(String kode, String nama, double harga, int stok) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public void info() {
        System.out.println("Kode: " + kode + " | Nama: " + nama + " | Harga: Rp " + harga + " | Stok: " + stok);
    }

    public boolean kurangiStok(int jml) {
        if (stok >= jml) {
            stok -= jml;
            return true;
        } else {
            System.out.println("Stok tidak cukup");
            return false;
        }
    }

    public double getHarga() {
        return harga;
    }

    public String getNama() {
        return nama;
    }
}