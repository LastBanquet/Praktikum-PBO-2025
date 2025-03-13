import java.util.Scanner;

public class LatihanModul3AIUEO {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Kalimat: ");
        String kalimat = input.nextLine();

        int jumlahVokal = 0;
        char ch;

        for (int i = 0; i < kalimat.length(); i++) {
            ch = kalimat.charAt(i);
            if (ch == 'a' || ch == 'i' || ch == 'u' || ch == 'e' || ch == 'o' ||
                    ch == 'A' || ch == 'I' || ch == 'U' || ch == 'E' || ch == 'O') {
                jumlahVokal++;
            }
        }

        // Menentukan ganjil atau genap dengan switch-case, Menggunakan modulus untuk memberikan hasil bagi.
        //Jika 0 = Genap, 1= Ganjil
        switch (jumlahVokal % 2) {
            case 0:
                System.out.println("Jumlah vokal genap: " + jumlahVokal);
                break;
            case 1:
                System.out.println("Jumlah vokal ganjil: " + jumlahVokal);
                break;
        }

        // Menampilkan karakter dalam string secara terbalik
        System.out.print("Menampilkan Kalimat Secara Terbalik: ");
        for (int i = kalimat.length() - 1; i >= 0; i--) {
            System.out.print(kalimat.charAt(i));
        }
        System.out.println();

        input.close();
    }
}

//Referensi https://www.geeksforgeeks.org/java-program-to-count-number-of-vowels-in-a-string/