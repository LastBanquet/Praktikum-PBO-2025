class Person {
    private String name;
    private int age;

    public Person(String n, int a) {
        name = n;
        age = a;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
} //Revisi 1, Menambahkan tutup kurawal untuk menutup class Person

class Employee extends Person {
    private double salary;

    public Employee(String n, int a, double s) {
        super(n, a); // Revisi 2, memanggil constructor Person dengan super() agar artibut name dan age terinisialisasi.
        salary = s;
    }

    public void showSalary() {
        System.out.println("Salary: " + salary);
        //^Revisi 3, Mengganti koma (,) dengan titik koma (;)
    }
}

public class MainApp {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", 25, 5000.0);
        //^Revisi 4, Mengubah 5.000 menjadi 5000.0 agar sesuai dengan format angka dalam tipe data double
        emp.display();
        emp.showSalary();
        //Revisi 5, Memanggil method showSalary {} supaya gaji juga dicetak
    }
}
