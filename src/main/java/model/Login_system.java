package model;

import java.util.Scanner;

public class Login_system {
    String email;
    String password;

    public void signup(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Email: ");
        this.email=sc.next();
        System.out.println("Enter Password:");
        this.password=sc.next();

        if(this.email.equals("admin@gmail.com")&&this.password.equals("adminhero")){

        }
    }

}
