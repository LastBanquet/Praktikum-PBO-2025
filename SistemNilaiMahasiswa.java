import java.util.Scanner;

public class SistemNilaiMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Input Data Mahasiswa sesuai rekuitment yang diminta si Dosen.
        System.out.print("Nama Mahasiswa: ");
        String nama = input.nextLine();
        System.out.print("NIM: ");
        String NIM = input.next();
        System.out.print("Usia: ");
        int usia = input.nextInt();
        System.out.print("Jumlah Mata Kuliah : ");
        int jumlahMK = input.nextInt();

        //Kedua variable ini ditaruh belakangan karena baru digunakan setelah jumlah matkul diketahui.
        double totalNilai = 0;
        double nilaiMK;

        //Input Nilai Mata Kuliah
        for (int i = 0; i < jumlahMK; i++) {
            System.out.print("Nilai Mata Kuliah: " + (i + 1) + " : ");
            nilaiMK = input.nextDouble();
            totalNilai = totalNilai + nilaiMK;
        }

        //Menghitung Rata-rata Nilai
        double rataRata = totalNilai / jumlahMK;

        //Konversi Rata-rata ke IPK pakai percabangan.
        double IPK;
        if (rataRata >= 85) {
            IPK = 4.0;
        } else if (rataRata >= 70) {
            IPK = 3.0;
        } else if (rataRata >= 60) {
            IPK = 2.0;
        } else {
            IPK = 1.0;
        }

        //Evaluasi Akademiik.
        System.out.println("1. Mahasiswa berusia > 22 tahun? " + (usia > 22));
        System.out.println("2. IPK >= 3.5 dan Mata Kuliah > 4? " + (IPK >= 3.5 && jumlahMK > 4));
        System.out.println("3. IPK < 2.5 atau Mata Kuliah < 4? " + (IPK < 2.5 || jumlahMK < 4));

        //Membuat nomor random antrian dengan library math
        int nomorAntrian = (int) (Math.random() * 100) + 1;

        //Urutan Nama->NIM->Usia->Jumlah Matkul->IPK Berdasarka skala 4.0-> Nomor antrian acak. Coba styling" tipis.
        System.out.println("===================================");
        System.out.println("        LAPORAN AKADEMIK           ");
        System.out.println("===================================");

        System.out.println("Nama:               " + nama);
        System.out.println("NIM:                " + NIM);
        System.out.println("Usia:               " + usia);
        System.out.println("Jumlah Mata Kuliah: " + jumlahMK);
        System.out.println("IPK:                " + IPK);
        System.out.println("Nomor Antrian:      " + nomorAntrian);

        input.close();
    }
}
