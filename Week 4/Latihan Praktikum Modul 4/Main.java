import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Buat Objek Mahasiswa
        Mahasiswa mhs1= new Mahasiswa("Eko", "12345", "Teknik Informatika", 3.5);
        Mahasiswa mhs2=  new Mahasiswa("Budi", "67890", "Sistem Informasi", 1.0);

        //Menampilkan Informasi
        System.out.println("Data Mahasiswa: ");
        mhs1.tampilkanInfo();
        System.out.println();
        mhs2.tampilkanInfo();

    }
}