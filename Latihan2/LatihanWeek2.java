import java.util.Scanner;

public class LatihanWeek2 {
    public static void main(String[] args) {
        int umur, NIM;
        String nama;
        double tinggi;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama Anda: ");
        nama = input.nextLine();

        System.out.print("Masukkan NIM Anda: ");
        NIM = input.nextInt();

        System.out.print("Masukkan Umur Anda: ");
        umur = input.nextInt();

        System.out.print("Masukkan Tinggi Badan Anda: ");
        tinggi = input.nextDouble();

        System.out.println("\nData yang Anda masukkan:");
        System.out.println("Nama Anda: " + nama);
        System.out.println("NIM Anda: " + NIM);
        System.out.println("Umur Anda: " + umur);
        System.out.println("Tinggi badan Anda: " + tinggi);

        // Perhitungan aritmatika
        double hasilUsia = (umur * 2) + (10.0 / 5) - 3;
        System.out.println("\nHasil Aritmatika: " + hasilUsia);

        // Operator perbandingan
        boolean lebihDari18 = umur > 18;
        System.out.println("\nApa usia Anda lebih dari 18 tahun? " + lebihDari18);

        boolean usiaTinggi = (umur > 18) && (tinggi > 160); //Kedua kondisi harus benar, jika salah satu salah = false
        System.out.println("\nApakah usia lebih dari 18 dan tinggi lebih dari 160 cm? " + usiaTinggi);

        // Konversi Tipe Data int -> double, tinggi badan -> casting
        System.out.println("\nHasil Konversi Tipe Data: ");
        System.out.println("Usia dalam bentuk double: " + (double) umur);
        System.out.println("Tinggi dalam bentuk int: " + (int) tinggi);

        input.close();
    }
}
