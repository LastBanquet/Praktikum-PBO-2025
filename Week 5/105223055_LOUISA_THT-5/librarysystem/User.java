package librarysystem;

public class User {
    private String nama;
    private String idUser;

    public User(String nama, String idUser) {
        this.nama = nama;
        this.idUser = idUser;
    }

    public void pinjamBuku(Buku buku) {
        if (!buku.isStatusDipinjam()) {
            buku.pinjamBuku();
            System.out.println(nama + " meminjam buku \"" + buku.getJudul() + "\".");
        } else {
            System.out.println("Buku \"" + buku.getJudul() + "\" Tidak tersedia karena sedang dipinjam.");
        }
    }

    public void kembalikanBuku(Buku buku) {
        if (buku.isStatusDipinjam()) {
            buku.kembalikanBuku();
            System.out.println(nama + " mengembalikan buku \"" + buku.getJudul() + "\".");
        } else {
            System.out.println("Buku \"" + buku.getJudul() + "\" belum dipinjam.");
        }
    }
}
