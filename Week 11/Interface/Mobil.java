package Interface;

public class Mobil extends Pemilik implements Kendaraan, Pabrik {

    // Constructor Mobil harus panggil constructor Pemilik yang terima String
    public Mobil(String nama) {
        super(nama);
    }

    @Override
    public void nyalakanMesin() {
        System.out.println("Mobil Nyalakan");
    }

    @Override
    public void matikanMesin() {
        System.out.println("Mobil Matikan");
    }

    @Override
    public void produksiKendaraan() {
        System.out.println("Mobil di produksi");
    }

    @Override
    public void pemilikKendaraan() {
        System.out.println(super.nama + "punya " + nama);
    }
}
