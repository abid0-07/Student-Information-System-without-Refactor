package myPackage;


import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //System.out.println("Creating an object of CSE class\n");
        Scanner input = new Scanner(System.in);
        var s1 = new CSE();
        System.out.print("Enter name: ");
        s1.setName(input.next());
        System.out.print("\nEnter ID: ");
        s1.setId(input.next());
        System.out.print("\nEnter phone number: ");
        s1.setPhoneNumber(input.next());
        s1.display();

        //System.out.println("\n\nCreating an object of SWE class\n");
        var s2 = new SWE();
        System.out.print("Enter name: ");
        s2.setName(input.next());
        System.out.print("\nEnter ID: ");
        s2.setId(input.next());
        System.out.print("\nEnter phone number: ");
        s2.setPhoneNumber(input.next());
        s2.display();

        //System.out.println("\n\nCreating an object of ITM class\n");
        var s3 = new ITM();
        System.out.print("Enter name: ");
        s3.setName(input.next());
        System.out.print("\nEnter ID: ");
        s3.setId(input.next());
        System.out.print("\nEnter phone number: ");
        s3.setPhoneNumber(input.next());
        s3.display();

    }
}
