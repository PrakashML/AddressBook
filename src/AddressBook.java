import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    static List<Contacts> addressBook = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");
        Scanner sc = new Scanner(System.in);
        addContact();
        System.out.println("Want to edit enter 1 or for no edit enter 0");
        int toEdit = sc.nextInt();

        if (toEdit==1){
            System.out.println("Enter fname to edit");
            Scanner scanner2 = new Scanner(System.in);
            String contact = scanner2.nextLine();
            editContact(contact);
            System.out.println("All contacts in the address book");
            for(Contacts c : addressBook){
                System.out.println(c);
            }
        }
        else {
            System.out.println("No changes done in Contact Data");
        }
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
    private static void editContact(String firstName){
        for(Contacts contact : addressBook){
            if(contact.getFirstName().equalsIgnoreCase(firstName)){
                System.out.println("Editing contact: " + contact);
                Scanner scanner1 = new Scanner(System.in);

                System.out.println("Enter your details \n Firstname \n lastname \n address \n city \n zip, \n phonenum \n email \n ");
                contact.setFirstName(scanner1.nextLine());
                contact.setLastName(scanner1.nextLine());
                contact.setAddress(scanner1.nextLine());
                contact.setCity(scanner1.nextLine());
                contact.setZip(scanner1.next());
                contact.setPhoneNum(scanner1.next());
                scanner1.nextLine();
                contact.setEmail(scanner1.nextLine());
                System.out.println("Contact edited successfully.");
            }

        }

    }

}
