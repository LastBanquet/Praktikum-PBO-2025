class Animal {
    public void suara() {
        System.out.println("Cetak suara");
    }
}

class Dog extends Animal {
    @Override
    public void suara() {
        System.out.println("GUK GUK GUKKKKKKK");
    }

    public void makan(String lauk, String minuman) {
        System.out.println("Hewan Makan" + lauk +" dan Minum " + minuman);
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.suara();

        Animal d = new Dog();
        d.suara(); // polymorphism
        d.makan("ayam");
        d.makan("Ayam Goreng");

        Dog anjing = new Dog();
        anjing.makan("Tulang", "Aqua"); //method milik class sendiri.

    }

}
