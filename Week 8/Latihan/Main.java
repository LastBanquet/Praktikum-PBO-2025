// Superclass Animal
class Animal {
    HealthRecord record;

    public Animal(String recordNumber, String recordDate) {
        this.record = new HealthRecord(recordNumber, recordDate);
    }

    public void makeSound() {
        System.out.println("Suara hewan");
    }

    public void showHealthRecord() {
        System.out.println("Nomor Rekam Medis: " + record.recordNumber);
        System.out.println("Tanggal Dibuat: " + record.recordDate);
    }
}

// Subclass Dog
class Dog extends Animal {
    public Dog(String recordNumber, String recordDate) {
        super(recordNumber, recordDate);
    }

    public void makeSound() {
        System.out.println("Guk-Guk!");
    }
}

// Subclass Cat
class Cat extends Animal {
    public Cat(String recordNumber, String recordDate) {
        super(recordNumber, recordDate);
    }

    public void makeSound() {
        System.out.println("Meong!");
    }
}

//Kelas HealthRecord (komposisi di Animal)
class HealthRecord {
    String recordNumber;
    String recordDate;

    public HealthRecord(String recordNumber, String recordDate) {
        this.recordNumber = recordNumber;
        this.recordDate = recordDate;
    }
}

//Kelas Owner (HAS-A Animal agregasi)
class Owner {
    String name;
    Animal pet;

    public Owner(String name, Animal pet) {
        this.name = name;
        this.pet = pet;
    }

    public void showInfo() {
        System.out.println("Nama Pemilik: " + name);
        System.out.print("Suara Hewan : ");
        pet.makeSound();

        if (pet instanceof Dog) {
            System.out.println("Jenis Hewan : Anjing");
        } else if (pet instanceof Cat) {
            System.out.println("Jenis Hewan : Kucing");
        }

        pet.showHealthRecord();
        System.out.println();
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Owner owner1 = new Owner("Rube", new Dog("ANJING01", "15-05-2025"));
        Owner owner2 = new Owner("Ue", new Cat("KUCENG01", "15-05-2025"));

        owner1.showInfo();
        owner2.showInfo();
    }
}
