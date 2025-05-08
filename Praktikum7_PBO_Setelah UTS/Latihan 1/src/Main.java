package Praktikum;

class Hewan {
    String suara = "Suara kelas Hewan";

    Hewan() {
        System.out.println("Ini adalah konstruktor Hewan");
    }
}

class Kucing extends Hewan {
    String suara = "Suara kelas Kucing";

    Kucing() {
        super();
        System.out.println("Ini adalah konstruktor Kucing");
    }

    void tampilkanSuara() {
        System.out.println("Suara milik Kucing: " + suara);
        System.out.println("Suara milik Hewan: " + super.suara);
    }
}

public class Main {
    public static void main(String[] args) {
        Kucing meong = new Kucing();
        meong.tampilkanSuara();
    }
}
