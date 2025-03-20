public class Main {
    public static void main(String[] args) {
        // Membuat objek Mobil
        Mobil nissan = new Mobil("B 1234 ABC", "Nissan Grand Livina", 750000);
        Mobil suzuki = new Mobil("B 5678 DEF", "Suzuki Ertiga", 480000);

        // Membuat objek Pelanggan
        // Karena soal tidak menyebutkan bahwa data harus diinput dari pengguna,
        // saya menggunakan hardcoded agar data langsung muncul di output.
        Pelanggan rube = new Pelanggan("Rube", "1201010101", "081234567890");


        System.out.println("Daftar Mobil");
        nissan.tampilkan();
        suzuki.tampilkan();

        Sewa transaksi1 = new Sewa(rube, nissan, 6);
        transaksi1.prosesSewa();

        System.out.println("Daftar Mobil Setelah Transaksi");
        nissan.tampilkan();
        suzuki.tampilkan();
    }
}
