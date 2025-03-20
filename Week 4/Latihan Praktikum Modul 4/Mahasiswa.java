import java.util.Scanner;

public class Mahasiswa {
    String nama;
    String nim;
    String jurusan;
    double ipk;
    boolean isLulus;

//Constructor
    Mahasiswa(String nama, String nim, String jurusan, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.ipk = ipk;
        this.isLulus = cekLulus();
    }

//Method / Function
    public void tampilkanInfo (){
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("IPK: " + ipk);
        System.out.println("Status Kelulusan: " + (isLulus ? "Lulus" : "Belum Lulus"));;
    }

//Method Check Lulus jika IPK 3
    public boolean cekLulus(){
        return ipk >= 3.0;
    }

}

