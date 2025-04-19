package library.model;
import java.util.ArrayList;

public class Member {
    private String name;
    private String memberId;
    private ArrayList<Book> borrowedBooks;

    // Konstruktor
    public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
        this.borrowedBooks = new ArrayList<>();
    }

    // Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    //Method untuk pinjam buku
    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    //Method untuk menampilkan buku yang dipinjam
    public void displayBorrowedBooks() {
        System.out.println("Buku yang dipinjam oleh " + name + ":");
        for (Book book : borrowedBooks) {
            System.out.println("-" + book.getTitle());
        }
    }
}


//Buat class Member dengan atribut:
//• name (String)
//• memberId (String)
