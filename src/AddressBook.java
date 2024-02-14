import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    static List<Contacts> addressBook = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");
        Scanner sc = new Scanner(System.in);
        addContact();

    }

    private static void addContact(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your details \n Firstname \n lastname \n address \n city \n zip, \n phonenum \n email \n ");
        String FName = sc.nextLine();
        String LName = sc.nextLine();
        String Address = sc.nextLine();
        String City = sc.nextLine();
        String Zip = sc.next();
        String Num = sc.next();
        String Email = sc.nextLine();

        Contacts contact = new Contacts(FName, LName, Address, City, Zip, Num, Email);
        addressBook.add(contact);
        System.out.println("Contact added successfully");
    }
}
