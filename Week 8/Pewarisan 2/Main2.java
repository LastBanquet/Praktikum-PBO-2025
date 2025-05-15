//Has A
class Engine {
    void start() {
        System.out.println("Mesin nyala");
    }
}

class Car {
    Engine engine = new Engine();

    void drive() {
        engine.start();
        System.out.println("Mobil jalan");
    }
}


//Sample
public class Main2 {
    public static void main(String[] args) {
        Car Car = new Car();
        Car.drive();
    }
}
