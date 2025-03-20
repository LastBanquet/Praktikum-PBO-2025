public class Utility {
    public static double hitungTotal(double harga, int hari) {
        return hari > 5 ? harga * hari * 0.9 : harga * hari;
    }
    //2f= format specifier untuk menampilkan angka dengan dua desimal
    public static String formatUang(double angka) {
        return "Rp" + String.format("%,.2f", angka);
    }
}
