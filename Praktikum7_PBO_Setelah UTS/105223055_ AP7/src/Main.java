package Praktikum;

class Kendaraan { //SC
    String merek ="Toyota";

    Kendaraan (){
        System.out.println("Ini adalah Konstruktor");
    }
    void jalan (){
        System.out.println("Kendaraan sedang berjalan");
    }
}

class Mobil extends Kendaraan { //Anak
    String merek ="BMW";
    Mobil(){
        super ();
        System.out.println("Ini konstruktor child");
    }

    void printInfo (){
        System.out.println("Merek mobil Child " + merek);
        System.out.println("Merek mobil parent " + super.merek);

    }

    void klakson () {
        System.out.println("Mobil " + super.merek  + " klakson");
    }
    void tabrak () {
        System.out.println("Mobil " + super.merek + " tabrak pengguna jalan");
    }
    void kabur () {
        System.out.println("Mobil " + super.merek + " kabur setelah menabrak pengguna jalan");
    }

}

public class Main {
    public static void main(String[] args) {
        Mobil jazz = new Mobil();

        jazz.printInfo();
        jazz.jalan();
        jazz.klakson();
        jazz.tabrak();
        jazz.kabur();


    }
}