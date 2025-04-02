package librarysystem;

public class Perpustakaan {
    private Buku[] koleksiBuku = new Buku[10];
    private int jumlahBuku = 0;

    public void tambahBuku(Buku buku) {
        if (jumlahBuku < koleksiBuku.length) {
            koleksiBuku[jumlahBuku] = buku;
            jumlahBuku++;
            System.out.println("Buku \"" + buku.getJudul() + "\" berhasil ditambahkan ke perpustakaan.");
        } else {
            System.out.println("Perpustakaan penuh, tidak bisa menambahkan buku.");
        }
    }

    public void tampilkanBuku() {
        if (jumlahBuku == 0) {
            System.out.println("Perpustakaan kosong.");
            return;
        }

        System.out.println("Daftar Buku Perpustakaan:");
        for (int i = 0; i < jumlahBuku; i++) {
            Buku buku = koleksiBuku[i];
            System.out.println(buku.getJudul() + " oleh " + buku.getPenulis() + " (" + buku.getTahunTerbit() + ")");
            System.out.println("Status: " + (buku.isStatusDipinjam() ? "Dipinjam" : "Tersedia"));
        }
    }
}
