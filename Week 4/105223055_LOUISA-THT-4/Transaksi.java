public class Transaksi {
    private String id;
    private Pelanggan plg;
    private Produk prd;
    private int jml;
    private double total;
    private boolean sukses;

    public Transaksi(String id, Pelanggan plg, Produk prd, int jml) {
        this.id = id;
        this.plg = plg;
        this.prd = prd;
        this.jml = jml;
        this.total = prd.getHarga() * jml;
        this.sukses = false;
    }

    public void proses() {
        if (plg.kurangiSaldo(total) && prd.kurangiStok(jml)) {
            sukses = true;
            System.out.println("Transaksi berhasil");
        } else {
            System.out.println("Transaksi gagal");
        }
    }

    public void info() {
        System.out.println("ID Transaksi: " + id + " | Pelanggan: " + plg.getNama() + " | Produk: " + prd.getNama());
        System.out.println("Jumlah: " + jml + " | Total: Rp " + total + " | Status: " + (sukses ? "Sukses" : "Gagal"));
    }
}