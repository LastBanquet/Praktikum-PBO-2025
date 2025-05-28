class Transportasi {
    private String nama;
    private int jumlahKursi;
    private String tujuan;

    public Transportasi(String nama, int jumlahKursi, String tujuan) {
        this.nama = nama;
        this.jumlahKursi = jumlahKursi;
        this.tujuan = tujuan;
    }

    public String getNama() {
        return nama;
    }

    public int getJumlahKursi() {
        return jumlahKursi;
    }

    public String getTujuan() {
        return tujuan;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJumlahKursi(int jumlahKursi) {
        this.jumlahKursi = jumlahKursi;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    public double hitungHargaTiket() {
        return 100000;
    }
}

class Bus extends Transportasi {
    public Bus(String nama, int jumlahKursi, String tujuan) {
        super(nama, jumlahKursi, tujuan);
    }

    @Override
    public double hitungHargaTiket() {
        return super.hitungHargaTiket() * 1.10;
    }

    public double hitungHargaTiket(String kelasLayanan) {
        double base = hitungHargaTiket();
        return switch (kelasLayanan.toLowerCase()) {
            case "bisnis" -> base * 1.25;
            case "vip" -> base * 1.50;
            default -> base;
        };
    }
}

class Kereta extends Transportasi {
    public Kereta(String nama, int jumlahKursi, String tujuan) {
        super(nama, jumlahKursi, tujuan);
    }

    @Override
    public double hitungHargaTiket() {
        return super.hitungHargaTiket() * 1.20;
    }

    public double hitungHargaTiket(String kelasLayanan) {
        double base = hitungHargaTiket();
        return switch (kelasLayanan.toLowerCase()) {
            case "bisnis" -> base * 1.25;
            case "vip" -> base * 1.50;
            default -> base;
        };
    }
}

class Pesawat extends Transportasi {
    public Pesawat(String nama, int jumlahKursi, String tujuan) {
        super(nama, jumlahKursi, tujuan);
    }

    @Override
    public double hitungHargaTiket() {
        return super.hitungHargaTiket() * 1.50;
    }

    public double hitungHargaTiket(String kelasLayanan) {
        double base = hitungHargaTiket();
        return switch (kelasLayanan.toLowerCase()) {
            case "bisnis" -> base * 1.25;
            case "vip" -> base * 1.50;
            default -> base;
        };
    }
}

public class Main {
    public static void main(String[] args) {
        Transportasi[] daftarTransportasi = {
                new Bus("Bus", 40, "Bandung"),
                new Kereta("Kereta", 80, "Surabaya"),
                new Pesawat("Pesawat", 150, "Medan")
        };

        for (Transportasi t : daftarTransportasi) {
            System.out.printf("%s ke %s - Harga tiket (default): %.2f\n", t.getNama(), t.getTujuan(), t.hitungHargaTiket());

            if (t instanceof Bus bus) {
                System.out.printf("%s ke %s - Harga tiket (Bisnis): %.2f\n", bus.getNama(), bus.getTujuan(), bus.hitungHargaTiket("Bisnis"));
            } else if (t instanceof Kereta kereta) {
                System.out.println(kereta.getNama() + " ke " + kereta.getTujuan() + " - Harga tiket (VIP): " + kereta.hitungHargaTiket("VIP"));
            } else if (t instanceof Pesawat pesawat) {
                System.out.println(pesawat.getNama() + " ke " + pesawat.getTujuan() + " - Harga tiket (Ekonomi): " + pesawat.hitungHargaTiket("Ekonomi"));
            }

            System.out.println();
        }
    }
}
