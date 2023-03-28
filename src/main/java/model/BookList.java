package model;

public class BookList {
    int id;
    String name;
    String author;
    String genre;
    int isbn;
    int avialable;
    int fine;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getAvialable() {
        return avialable;
    }

    public void setAvialable(int avialable) {
        this.avialable = avialable;
    }

    public int getFine() {
        return fine;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }

    public BookList(int id, String name, String author, String genre, int isbn, int avialable, int fine) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.isbn = isbn;
        this.avialable = avialable;
        this.fine = fine;
    }
}
