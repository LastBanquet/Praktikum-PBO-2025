import java.util.Scanner;

public class DiskonTotalBelanja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input total belanja
        System.out.print("Masukkan total belanja: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Error: Masukkan angka yang valid!");
            return;
        }
        double totalBelanja = scanner.nextDouble();
        scanner.nextLine(); // Dipakai untuk membersihkan buffer agar nextLine() berikutnya bisa menangkap input pengguna dengan benar.

        // Validasi total belanja yang tidak boleh negatif. Kalau pengguna memasukkan nilai negatif = Error
        if (totalBelanja < 0) {
            System.out.println("Error: Total belanja tidak bisa kurang dari nol!");
            return;
        }

        // Input tipe member/keanggotaan
        System.out.print("Pilih status keanggotaan (Platinum/Gold/Silver/Non-Member): ");
        String member = scanner.nextLine().trim().toLowerCase(); //To lower case, memastikan input tidak case sensitive, sementara trim menghilangkan spasi yang tidak sengaja diinput pengguna.

        double diskonBelanja = 0;

        // Menentukan diskon menggunakan if-else
        if (totalBelanja > 500000) {
            diskonBelanja = 0.20; //20% -> 0.20
        } else if (totalBelanja >= 250000) {
            diskonBelanja = 0.10; //10% -> 0.10
        }

        // Menghitung harga setelah diskon
        double hargaSetelahDiskon = totalBelanja - (totalBelanja * diskonBelanja);

        double diskonTambahan = 0; //Menggunakan switch case, menghitung diskon tambahan berdasarkan keanggotaan
        switch (member) {
            case "platinum":
                diskonTambahan = 0.05; //5%
                break;
            case "gold":
                diskonTambahan = 0.03; //3%
                break;
            case "silver":
                diskonTambahan = 0.02; //2%
                break;
            case "non-member":
                diskonTambahan = 0.00;
                break;
            default:
                System.out.println("Error: Tipe member tidak valid!");
                return;
        }

        // Menghitung total setelah diskon tambahan
        double totalSetelahDiskon = hargaSetelahDiskon - (hargaSetelahDiskon * diskonTambahan);

        // Menggunakan ternary operator untuk menampilkan apakah pelanggan mendapatkan diskon atau tidak.
        String statusDiskon = (diskonBelanja > 0 || diskonTambahan > 0) ? "Selamat! Anda mendapatkan diskon" : "Maaf, Anda tidak mendapatkan diskon kali ini.";

        // Menampilkan hasil
        System.out.println(statusDiskon);
        System.out.println("Total yang harus dibayarkan setelah diskon: Rp" + String.format("%.2f", totalSetelahDiskon)); //Menggunakan format specifier, menampilkan angka dengan 2 desimal

        scanner.close();
    }
}

//Referensi:
//Modul 3 Praktikum.
//https://www.geeksforgeeks.org/decision-making-javaif-else-switch-break-continue-jump/
//https://www.geeksforgeeks.org/format-specifiers-in-java/