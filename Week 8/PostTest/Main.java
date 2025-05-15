class Vehicle {
    public void startEngine() {
        System.out.println("Mesin Nyala");
    }
}

class Car extends Vehicle {
    public void startEngine() {
        System.out.println("Mesin Mobil Nyala");
    }
}

class Motorcycle extends Vehicle {
    public void startEngine() {
        System.out.println("Mesin Motor Nyala");
    }
}

class License {
    String licenseNumber;
    String validUntil;

    public License(String licenseNumber, String validUntil) {
        this.licenseNumber = licenseNumber;
        this.validUntil = validUntil;
    }
}

class Driver {
    String name;
    Vehicle vehicle;
    License license;

    public Driver(String name, Vehicle vehicle, String licenseNumber, String validUntil) {
        this.name = name;
        this.vehicle = vehicle;
        this.license = new License(licenseNumber, validUntil);
    }

    public void showInfo() {
        System.out.println("Nama Pengemudi: " + name);
        
        if (vehicle instanceof Car) {
            System.out.println("Jenis Kendaraan: Mobil");
        } else if (vehicle instanceof Motorcycle) {
            System.out.println("Jenis Kendaraan: Motor");
        }

        System.out.print("Status Mesin Kendaraan: ");
        vehicle.startEngine();

        System.out.println("Nomor Lisensi: " + license.licenseNumber);
        System.out.println("Tanggal Berlaku Lisensi: " + license.validUntil);
        System.out.println();
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Driver driver1 = new Driver("Rube", new Car(), "MOBIL01", "15-05-2033");
        Driver driver2 = new Driver("Ue", new Motorcycle(), "MOTOR01", "15-05-2032");

        driver1.showInfo();
        driver2.showInfo();
    }
}
