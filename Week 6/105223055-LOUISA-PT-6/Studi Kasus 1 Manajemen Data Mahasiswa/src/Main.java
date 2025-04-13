import universitas.Mahasiswa;
import universitas.ManajemenMahasiswa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ManajemenMahasiswa manajemen = new ManajemenMahasiswa();
        int pilihan;

        do {
            System.out.println("=== MENU ===");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Tampilkan Semua Mahasiswa");
            System.out.println("3. Tampilkan Mahasiswa dengan IPK Tertinggi");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan NIM          : ");
                    String nim = input.nextLine();
                    System.out.print("Masukkan Nama         : ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan Program Studi: ");
                    String prodi = input.nextLine();
                    System.out.print("Masukkan IPK          : ");
                    double ipk = input.nextDouble();
                    input.nextLine();

                    Mahasiswa m = new Mahasiswa(nim, nama, prodi, ipk);
                    manajemen.tambahMahasiswa(m);
                    break;

                case 2:
                    manajemen.tampilkanSemua();
                    break;

                case 3:
                    manajemen.tampilkanIPKTertinggi();
                    break;

                case 4:
                    System.out.println("Sampai jumpa, semoga harimu menyenangkan :D");
                    break;

                default:
                    System.out.println("Pilihan tidak valid, silahkan coba lagi.");
                    break;
            }

            System.out.println();
        } while (pilihan != 4);

        input.close();
    }
}
