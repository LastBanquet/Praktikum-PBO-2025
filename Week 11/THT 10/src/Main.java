//Abstract class
abstract class Kendaraan {
    protected String platNomor;
    protected String merk;
    protected int tahunProduksi;

    public Kendaraan(String platNomor, String merk, int tahunProduksi) {
        this.platNomor = platNomor;
        this.merk = merk;
        this.tahunProduksi = tahunProduksi;
    }

    public void tampilkanInfo() {
        System.out.println("Plat Nomor: " + platNomor);
        System.out.println("Merk: " + merk);
        System.out.println("Tahun Produksi: " + tahunProduksi);
    }

    public abstract double hitungBiayaSewa(int hari);
    public abstract boolean perluSupir();
}

//Interface DapatDisewa
interface DapatDisewa {
    double hitungBiayaSewa(int hari);
    boolean perluSupir();
}

//Interface Muatan
interface Muatan {
    double kapasitasMuatan(); // dalam kg
}

//Class MobilPribadi
class MobilPribadi extends Kendaraan implements DapatDisewa {
    public MobilPribadi(String plat, String merk, int tahun) {
        super(plat, merk, tahun);
    }

    public double hitungBiayaSewa(int hari) {
        return hari * 300000;
    }

    public boolean perluSupir() {
        return false;
    }
}

//Class Bus
class Bus extends Kendaraan implements DapatDisewa {
    public Bus(String plat, String merk, int tahun) {
        super(plat, merk, tahun);
    }

    public double hitungBiayaSewa(int hari) {
        return hari * 800000;
    }

    public boolean perluSupir() {
        return true;
    }
}

//Class Truk
class Truk extends Kendaraan implements DapatDisewa, Muatan {
    public Truk(String plat, String merk, int tahun) {
        super(plat, merk, tahun);
    }

    public double hitungBiayaSewa(int hari) {
        return hari * 1000000;
    }

    public boolean perluSupir() {
        return true;
    }

    public double kapasitasMuatan() {
        return 5000.0; // 5 ton
    }
}

//Main class
public class Main {
    public static void main(String[] args) {
        Kendaraan[] daftarKendaraan = {
                new MobilPribadi("MP01", "Toyota", 2020),
                new Bus("BS02", "Hino", 2022),
                new Truk("TR03", "Isuzu", 2015)
        };

        for (Kendaraan k : daftarKendaraan) {
            k.tampilkanInfo();
            System.out.println("Biaya Sewa 3 hari: Rp " + k.hitungBiayaSewa(3));
            System.out.println("Perlu Supir: " + (k.perluSupir() ? "Ya" : "Tidak"));

            if (k instanceof Muatan) {
                System.out.println("Kapasitas Muatan: " + ((Muatan) k).kapasitasMuatan() + " kg");
            }
            //Pemisah tiap tipe kendaraan
            System.out.println("-------------------------");
        }
    }
}
