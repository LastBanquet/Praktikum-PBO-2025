public class Pelanggan {
    private String nama, ktp, hp;

    public Pelanggan(String nama, String ktp, String hp) {
        this.nama = nama;
        this.ktp = ktp;
        this.hp = hp;
    }

    public void tampilkan() {
        System.out.println("Nama: " + nama);
        System.out.println("KTP: " + ktp);
        System.out.println("HP: " + hp);
    }
}