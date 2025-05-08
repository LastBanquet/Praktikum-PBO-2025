class Bangunan {
    String nama = "Bangunan Umum";
}

class GedungSekolah extends Bangunan {
    String nama = "Gedung Sekolah ABC";

    void tampilkanInfo() {
        System.out.println("Nama milik subclass: " + nama);
        System.out.println("Nama milik superclass: " + super.nama);
    }
}

public class Main {
    public static void main(String[] args) {
        GedungSekolah SekolahGedung = new GedungSekolah();
        SekolahGedung.tampilkanInfo();
    }
}
