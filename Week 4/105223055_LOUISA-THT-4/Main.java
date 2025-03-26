Scanner input = new Scanner(System.in);

public class Main {
    public static void main(String[] args) {
        Produk prd1 = new Produk("01", "Laptop", 1500000, 10);
        Pelanggan plg1 = new Pelanggan("01", "Rube", "HoshiSho@mail.com", 10000000);

        System.out.println("Info Awal Sebelum Transaksi");
        prd1.info();
        plg1.info();

        System.out.print("\nMasukkan jumlah top-up saldo: Rp ");
        double jumlahTopUp = input.nextDouble();
        plg1.topUp(jumlahTopUp); 

        Transaksi t1 = new Transaksi("01", plg1, prd1, 1);
        t1.proses();
        t1.info();

        System.out.println("\nInformasi Setelah Transaksi");
        plg1.info();
        prd1.info();
    }
}
