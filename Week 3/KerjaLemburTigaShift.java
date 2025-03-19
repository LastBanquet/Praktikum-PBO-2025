import java.util.Scanner;

public class KerjaLemburTigaShift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tarif per jam berdasarkan shift kerja
        int tarifPagi = 50000;
        int tarifSiang = 60000;
        int tarifMalam = 75000;
        int tarifLembur = 90000;
        int potonganAbsen = 100000;

        // Input data karyawan
        System.out.print("Masukkan ID Karyawan: ");
        String id = scanner.nextLine();

        System.out.print("Masukkan Nama Karyawan: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan Shift Kerja (pagi/siang/malam): ");
        String shift = scanner.nextLine().toLowerCase(); // Mengubah input menjadi huruf kecil

        System.out.print("Masukkan Total Jam Kerja dalam Seminggu: ");
        int jamKerja = scanner.nextInt();

        System.out.print("Masukkan Jumlah Hari Absen: ");
        int absen = scanner.nextInt();

        // Validasi input agar masuk akal
        if (jamKerja < 0 || jamKerja > 168 || absen < 0 || absen > 7) {
            System.out.println("Input tidak valid! Pastikan jam kerja dan absen sesuai ketentuan.");
            return;
        }
        System.out.println("Input valid, melakukan perhitungan gaji..");

        // Menentukan tarif berdasarkan shift kerja menggunakan switch case
        int tarifPerJam;
        switch (shift) {
            case "pagi":
                tarifPerJam = tarifPagi;
                break;
            case "siang":
                tarifPerJam = tarifSiang;
                break;
            case "malam":
                tarifPerJam = tarifMalam;
                break;
            default:
                System.out.println("Shift tidak valid! Mohon masukkan shift yang benar: pagi, siang, atau malam");
                return;
        }

        System.out.println("Tarif Kerja Per Jam: Rp " + tarifPerJam);

        // Menghitung gaji berdasarkan aturan yang diberikan
        int gajiPokok = jamKerja * tarifPerJam;
        System.out.println("Gaji Pokok: Rp " + gajiPokok);

        int lembur = (jamKerja > 40) ? (jamKerja - 40) * tarifLembur : 0;
        System.out.println("Lembur: Rp " + lembur);

        int potongan = (jamKerja < 30) ? (int) (gajiPokok * 0.1) : 0;
        System.out.println("Potongan <30 jam: Rp " + potongan);

        int potonganAbsenTotal = absen * potonganAbsen;
        System.out.println("Potongan Absen: Rp " + potonganAbsenTotal);

        int totalGaji = gajiPokok + lembur - potongan - potonganAbsenTotal;

        //Cetak laporan gaji karyawan
        System.out.println("\nLaporan Gaji Karyawan");
        System.out.println("================================");
        System.out.println("ID Karyawan     : " + id);
        System.out.println("Nama Karyawan   : " + nama);
        System.out.println("Shift Kerja     : " + shift);
        System.out.println("Total Jam Kerja : " + jamKerja + " jam");
        System.out.println("Jumlah Absen    : " + absen + " hari");
        System.out.printf("Total Gaji       : Rp %,d\n", totalGaji);

        scanner.close();
    }
}
