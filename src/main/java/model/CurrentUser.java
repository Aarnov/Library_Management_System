package model;

public class CurrentUser {

    int id;
    String name;
    int contact;
    String email;

    public CurrentUser(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public CurrentUser(String name, int contact, String email) {
        this.name = name;
        this.contact = contact;
        this.email = email;
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
}
