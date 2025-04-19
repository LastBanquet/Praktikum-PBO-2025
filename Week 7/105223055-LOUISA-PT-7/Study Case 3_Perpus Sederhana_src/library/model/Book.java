package library.model;

    //Buat Atribut dari class Book
public class Book {
    private String title;
    private String author;
    private int yearPublished;

    //Buat Konstruktor
    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    //Setter dan Getter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }
}


//Buat class Book dengan atribut:
//• title (String)
//• author (String)
//• yearPublished (int)