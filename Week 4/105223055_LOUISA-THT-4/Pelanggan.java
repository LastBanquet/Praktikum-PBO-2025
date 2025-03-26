public class Pelanggan {
    private String id;
    private String nama;
    private String email;
    private double saldo;

    public Pelanggan(String id, String nama, String email, double saldo) {
        this.id = id;
        this.nama = nama;
        this.email = email;
        this.saldo = saldo;
    }

    public void info() {
        System.out.println("ID: " + id + " | Nama: " + nama + " | Email: " + email + " | Saldo: Rp " + saldo);
    }

    public void topUp(double jml) {
        saldo += jml;
        System.out.println("Top-up berhasil! Saldo baru: Rp " + saldo);
    }

    public boolean kurangiSaldo(double jml) {
        if (saldo >= jml) {
            saldo -= jml;
            return true;
        } else {
            System.out.println("Saldo tidak cukup");
            return false;
        }
    }

    public String getNama() {
        return nama;
    }
}