package model;

import java.util.Scanner;


public class BookEntry {
    int id;
    String name;
    String author;
    String genre;
    int isbn;
    int avialable;
    int fine;

    public BookEntry(int id, String name, String author, String genre, int isbn, int avialable, int fine) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.isbn = isbn;
        this.avialable = avialable;
        this.fine = fine;
    }

    public BookEntry() {

    }

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

    public void populate_book(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter book name: ");
        this.name=sc.nextLine();
        System.out.println("Enter author name: ");
        this.author=sc.nextLine();
        System.out.println("Enter genre: ");
        this.genre=sc.nextLine();
        System.out.println("Enter isbn: ");
        this.isbn=sc.nextInt();
        System.out.println("Enter avilablity: ");
        this.avialable=sc.nextInt();
        System.out.println("Enter fine: ");
        this.fine=sc.nextInt();


    }

}
