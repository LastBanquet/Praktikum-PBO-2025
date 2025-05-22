class PaymentMethod {
    public void processPayment(double amount) {
        System.out.println("Memproses pembayaran sebesar: Rp " + amount);
    }

    public void processPayment(double amount, String currency) {
        System.out.println("Memproses pembayaran sebesar: " + currency + " " + amount);
    }
}

class CreditCard extends PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("[Credit Card] Pembayaran sebesar Rp " + amount + " telah diproses.");
    }

    @Override
    public void processPayment(double amount, String currency) {
        System.out.println("[Credit Card] Pembayaran sebesar " + currency + " " + amount + " telah diproses.");
    }
}

class EWallet extends PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("[E-Wallet] Pembayaran sebesar Rp " + amount + " telah berhasil.");
    }

    @Override
    public void processPayment(double amount, String currency) {
        System.out.println("[E-Wallet] Pembayaran sebesar " + currency + " " + amount + " berhasil diproses.");
    }
}

class BankTransfer extends PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("[Bank Transfer] Pembayaran sebesar Rp " + amount + " telah selesai diproses.");
    }

    @Override
    public void processPayment(double amount, String currency) {
        System.out.println("[Bank Transfer] Pembayaran sebesar " + currency + " " + amount + " telah selesai.");
    }
}

public class Main {
    public static void main(String[] args) {
        PaymentMethod[] metode = {
                new CreditCard(),
                new EWallet(),
                new BankTransfer()
        };

        System.out.println("Pembayaran Default");
        for (PaymentMethod m : metode) {
            m.processPayment(250000);
        }

        System.out.println("Pembayaran dengan Mata Uang");
        for (PaymentMethod m : metode) {
            m.processPayment(123000, "USD");
        }
    }
}
