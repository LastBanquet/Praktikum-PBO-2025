package library.main;
import library.model.Book;
import library.model.Member;
import java.util.ArrayList;

public class LibrarySystem {
    //Deklarasi ArrayList untuk Book dan Member
    private ArrayList<Book> books = new ArrayList<Book>();
    private ArrayList<Member> members = new ArrayList<Member>();

    //Method untuk menambahkan buku
    public void addBook(Book book) {
        books.add(book);
    }

    //Method untuk menambahkan anggota
    public void addMember(Member member) {
        members.add(member);
    }

    //Method untuk menampilkan daftar buku
    public void displayBooks() {
        System.out.println("Daftar Buku:");
        for (Book book : books) {
            System.out.println("Judul Buku  : " + book.getTitle());
            System.out.println("Penulis     : " + book.getAuthor());
            System.out.println("Tahun Terbit: " + book.getYearPublished());
            System.out.println();
        }
    }

    //Main method
    public static void main(String[] args) {
        //Membuat instance dari LibrarySystem
        LibrarySystem system = new LibrarySystem();

        //Menambahkan buku
        Book b1 = new Book("The Sleep Book: How to Sleep Well Every Night", "Guy Meadows", 2014);
        Book b2 = new Book("Galaxies: Inside the Universe's Star Cities", "David J. Eicher", 2020);
        Book b3 = new Book("The Library of Babel", "Jourge Luis Borges", 1941);
        system.addBook(b1);
        system.addBook(b2);
        system.addBook(b3);

        //Menambahkan anggota
        Member m1 = new Member("Wanshi", "ID01");
        Member m2 = new Member("Rube", "ID02");
        Member m3 = new Member("Lune", "ID03");
        system.addMember(m1);
        system.addMember(m2);
        system.addMember(m3);

        //Menambahkan data peminjaman
        m1.borrowBook(b1);
        m2.borrowBook(b2);
        m3.borrowBook(b3);

        //Menampilkan daftar buku
        system.displayBooks();

        //Menampilkan data peminjaman
        System.out.println("Data Peminjaman Buku:");
        for (Member member : system.members) {
            System.out.println("Nama Anggota: " + member.getName());
            System.out.println("ID Anggota  : " + member.getMemberId());
            member.displayBorrowedBooks();
            System.out.println();
        }
    }
}
