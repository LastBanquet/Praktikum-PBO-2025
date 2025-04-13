package universitas;

import java.util.ArrayList;

public class ManajemenMahasiswa {
    private ArrayList<Mahasiswa> daftarMahasiswa;

    public ManajemenMahasiswa() {
        daftarMahasiswa = new ArrayList<>();
    }

    public void tambahMahasiswa(Mahasiswa m) {
        daftarMahasiswa.add(m);
        System.out.println("Mahasiswa baru berhasil ditambahkan ke dalam daftar");
    }

    public void tampilkanSemua() {
        System.out.println("Menampilkan seluruh data mahasiswa:");
        for (Mahasiswa m : daftarMahasiswa) {
            m.tampilkanData();
        }
    }

    public void tampilkanIPKTertinggi() {
        if (daftarMahasiswa.isEmpty()) {
            System.out.println("Data mahasiswa masih kosong. Silakan tambahkan terlebih dahulu.");
            return;
        }

        Mahasiswa tertinggi = daftarMahasiswa.get(0);
        for (Mahasiswa m : daftarMahasiswa) {
            if (m.getIpk() > tertinggi.getIpk()) {
                tertinggi = m;
            }
        }

        System.out.println("Mahasiswa dengan IPK Tertinggi:");
        tertinggi.tampilkanData();
    }
}
