import java.util.Scanner;

public class PostTest2_ManajemenKeuangan {
    String nama;
    int usia;
    double jumlahUang;
    double pengeluaran;

    public PostTest2_ManajemenKeuangan(String nama, int usia, double jumlahUang, double pengeluaran) {
        this.nama = nama;
        this.usia = usia;
        this.jumlahUang = jumlahUang;
        this.pengeluaran = pengeluaran;
    }

    public double hitungSisaUang() {
        return jumlahUang - (pengeluaran * 30);
    }

    public double hitungBulanBertahan() {
        return jumlahUang / (pengeluaran * 30);
    }

    public String cekStatusKeuangan() {
        double bulanBertahan = hitungBulanBertahan();
        if (bulanBertahan < 1) return "PERINGATAN: Keuangan Anda kurang stabil!";
        if (bulanBertahan > 6) return "Keuangan Anda dalam kondisi aman.";
        return "Keuangan Anda stabil.";
    }

    public boolean usiaDiAtas30() {
        return usia > 30;
    }

    public boolean usia30DanUang10Juta() {
        return usia > 30 && jumlahUang > 10000000;
    }

    public boolean usiaDiBawah30AtauUang5Juta() {
        return usia < 30 || jumlahUang > 5000000;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan Usia: ");
        int usia = scanner.nextInt();

        System.out.print("Masukkan Jumlah Uang: ");
        double jumlahUang = scanner.nextDouble();

        System.out.print("Masukkan Pengeluaran Harian: ");
        double pengeluaran = scanner.nextDouble();

        //Menggunakan new untuk membuat object baru dari suatu class, jadi tidak perlu menulis ulang line 1-13
        PostTest2_ManajemenKeuangan keuangan = new PostTest2_ManajemenKeuangan(nama, usia, jumlahUang, pengeluaran);

        System.out.println("\n=== LAPORAN KEUANGAN ===");
        System.out.println("Nama: " + keuangan.nama);
        System.out.println("Usia: " + keuangan.usia);
        System.out.println("Jumlah Uang: Rp" + keuangan.jumlahUang);
        System.out.println("Pengeluaran Harian: Rp" + keuangan.pengeluaran);
        System.out.println("Sisa Uang dalam 30 Hari: Rp" + keuangan.hitungSisaUang());
        System.out.println("Estimasi Bertahan: " + keuangan.hitungBulanBertahan() + " bulan");
        System.out.println("Status Keuangan: " + keuangan.cekStatusKeuangan());

        System.out.println("\n=== PERBANDINGAN USIA & UANG ===");
        System.out.println("Apakah usia lebih dari 30? " + keuangan.usiaDiAtas30());
        System.out.println("Apakah usia > 30 dan uang > 10 juta? " + keuangan.usia30DanUang10Juta());
        System.out.println("Apakah usia < 30 atau uang > 5 juta? " + keuangan.usiaDiBawah30AtauUang5Juta());

        System.out.print("\nMasukkan jumlah hutang: ");
        double hutang = scanner.nextDouble();

        //Mengambil nilai absolut dari hutang menggunakan math.abs, supaya tidak perlu if-else manual
        double hutangAbsolut = Math.abs(hutang);
        double pengeluaranDibulatkan = Math.ceil(pengeluaran);
        int bonusTakTerduga = 100000 + (int)(Math.random() * 900000);

        double totalUangAkhir = keuangan.hitungSisaUang() + bonusTakTerduga;

        System.out.println("\n=== RANGKUMAN KEUANGAN ===");
        System.out.println("Nilai absolut dari hutang: Rp" + hutangAbsolut);
        System.out.println("Pengeluaran harian setelah pembulatan: Rp" + pengeluaranDibulatkan);
        System.out.println("Bonus tak terduga: Rp" + bonusTakTerduga);
        System.out.println("Total uang yang dimiliki setelah pengeluaran dan bonus: Rp" + totalUangAkhir);

        scanner.close();
    }
}
