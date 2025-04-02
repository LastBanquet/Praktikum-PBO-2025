import librarysystem.Buku;
import librarysystem.Perpustakaan;
import librarysystem.User;

public class Main {
    public static void main(String[] args) {
        Perpustakaan perpustakaan = new Perpustakaan();

        Buku b1 = new Buku("Don Quixote 1", "Miguel de Cervantes", 1605);
        Buku b2 = new Buku("The Little Prince", "Antoine de Saint-Exupery", 1943);
        Buku b3 = new Buku("Heaven Official's Blessing 1", "Mo Xiang Tong Xiu", 2021);
        Buku b4 = new Buku("Dumb Husky and His White Cat Shizun 1", "Rou Bao Bu Chi Rou", 2017);

        perpustakaan.tambahBuku(b1);
        perpustakaan.tambahBuku(b2);
        perpustakaan.tambahBuku(b3);
        perpustakaan.tambahBuku(b4);
        System.out.println();

        perpustakaan.tampilkanBuku();
        System.out.println();

        User user1 = new User("Rube", "User1");

        user1.pinjamBuku(b1);
        user1.pinjamBuku(b2);
        user1.pinjamBuku(b3);
        System.out.println();

        perpustakaan.tampilkanBuku();
        System.out.println();

        user1.kembalikanBuku(b3);
        System.out.println();

        perpustakaan.tampilkanBuku();
        System.out.println();
    }
}
