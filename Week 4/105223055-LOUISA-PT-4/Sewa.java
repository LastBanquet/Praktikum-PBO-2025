public class Sewa {
    private Pelanggan pelanggan;
    private Mobil mobil;
    private int durasi;
    private double totalBiaya;

    public Sewa(Pelanggan pelanggan, Mobil mobil, int durasi) {
        this.pelanggan = pelanggan;
        this.mobil = mobil;
        this.durasi = durasi;
        this.totalBiaya = Utility.hitungTotal(mobil.getHarga(), durasi);
    }

    public void prosesSewa() {
        if (!mobil.isTersedia()) {
            System.out.println("Mobil sudah disewa!\n");
            return;
        }
        mobil.setTersedia(false);
        cetakStruk();
    }

    public void cetakStruk() {
        System.out.println("\nStruk Penyewaan");
        pelanggan.tampilkan();
        System.out.println("Mobil: " + mobil.getMerek() + " (" + mobil.getPlat() + ")");
        System.out.println("Durasi: " + durasi + " hari");
        System.out.println("Total: " + Utility.formatUang(totalBiaya));
        System.out.println();

    }
}
