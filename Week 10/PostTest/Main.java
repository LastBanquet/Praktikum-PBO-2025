class Employee {
    public double calculateSalary() {
        return 0;
    }

    public double calculateSalary(boolean withBonus) {
        return calculateSalary();
    }
}

class SoftwareEngineer extends Employee {
    @Override
    public double calculateSalary() {
        return 10000000;
    }

    @Override
    public double calculateSalary(boolean withBonus) {
        return calculateSalary() + (withBonus ? 3000000 : 0);
    }
}

class DataScientist extends Employee {
    @Override
    public double calculateSalary() {
        return 11000000;
    }

    @Override
    public double calculateSalary(boolean withBonus) {
        return calculateSalary() + (withBonus ? 3000000 : 0);
    }
}

class Intern extends Employee {
    @Override
    public double calculateSalary() {
        return 7000000;
    }

    @Override
    public double calculateSalary(boolean withBonus) {
        return calculateSalary() + (withBonus ? 700000 : 0);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new SoftwareEngineer(),
                new DataScientist(),
                new Intern()
        };

        System.out.println("Gaji Karyawan (Tanpa Bonus)");
        for (Employee emp : employees) {
            System.out.printf("%-20s: Rp %,d\n", emp.getClass().getSimpleName(), (int) emp.calculateSalary());
        } //Pakai formatter supaya rapi

        System.out.println("Gaji Karyawan (Dengan Bonus)");
        for (Employee emp : employees) {
            double gaji;
            if (emp instanceof SoftwareEngineer) {
                gaji = ((SoftwareEngineer) emp).calculateSalary(true);
            } else if (emp instanceof DataScientist) {
                gaji = ((DataScientist) emp).calculateSalary(true);
            } else if (emp instanceof Intern) {
                gaji = ((Intern) emp).calculateSalary(true);
            } else {
                gaji = emp.calculateSalary(); // fallback
            }
            System.out.printf("%-20s: Rp %,d\n", emp.getClass().getSimpleName(), (int) gaji);
        }   //Pakai formatter supaya rapi
    }
}
