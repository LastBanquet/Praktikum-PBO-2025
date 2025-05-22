package Binding;

class Animal {
    static void suara() {
        System.out.println("Suara Hewan");
    }
    void makan (){
        System.out.println("Makan Hewan");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        //a. suara
        Animal.Suara(); //static
        a.makan();

        Animal b = new Dog();
        b.makan(); //dinamik binding
    }
}
