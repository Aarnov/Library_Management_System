package model;

import java.util.Scanner;

public class UserEntry {
    int id;
    String name;
    int contact;
    String email;
    String password;

    public UserEntry(int id, String name, int contact, String email, String password) {
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.email = email;
        this.password = password;
    }

    public UserEntry() {

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

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void Signup_User(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name: ");
        this.name=sc.nextLine();
        System.out.println("Enter Contact: ");
        this.contact=sc.nextInt();
        System.out.println("Enter Email: ");
        this.email=sc.next();
        System.out.println("Enter Password: ");
        this.password=sc.next();

    }
}
