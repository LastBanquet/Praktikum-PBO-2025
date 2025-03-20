public class Mobil {
    private String plat, merek;
    private double harga;
    private boolean tersedia = true;

    // Konstruktor default yang menginisialisasi objek Mobil dengan nilai bawaan
    public Mobil() {
        this("XXX 000", "Unknown", 0);
    }

    public Mobil(String plat, String merek, double harga) {
        this.plat = plat;
        this.merek = merek;
        this.harga = harga;
    }

    //Getter, Metode untuk mengambil nilai dari atribut privat
    public String getPlat() {
        return plat;
    }

    public String getMerek() {
        return merek;
    }

    public double getHarga() {
        return harga;
    }

    public boolean isTersedia() {
        return tersedia;
    }

    //Setter, Metode untuk mengubah nilai atribut privat
    public void setTersedia(boolean status) {
        this.tersedia = status;
    }

    public void tampilkan() {
        System.out.println("Plat: " + plat);
        System.out.println("Merek: " + merek);
        System.out.println("Harga: " + Utility.formatUang(harga));
        System.out.println("Status: " + (tersedia ? "Tersedia" : "Disewa"));
    }

}