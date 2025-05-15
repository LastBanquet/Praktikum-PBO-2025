class Animal {

}

class Mammal extends Animal {

}

class Reptile extends Animal {

}

class Dog extends Mammal {

}

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Mammal();
        Dog dog1 = new Dog();
        Mammal mammal1 = new Mammal(); //Bikin dulu mamal1 supaya ga merah.


        System.out.println(mammal1 instanceof Animal); // true
        System.out.println(dog1 instanceof Animal);
        System.out.println (mammal1 instanceof Dog);

        if (animal1 instanceof Dog) {
            System.out.println(dog1 instanceof Mammal);
        }

    }
}
