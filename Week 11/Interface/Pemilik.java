package Interface;

import java.security.PublicKey;

public abstract class Pemilik {
    String nama;

    Pemilik(String nama) {
        this.nama = nama;
    }
    public abstract void pemilikKendaraan();
}
