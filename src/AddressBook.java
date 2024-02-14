import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    static List<Contacts> addressBook = new ArrayList<>();
    private static void searchCity(){
        Scanner scanner7 = new Scanner(System.in);
        System.out.println("Do you want to search persons in a CITY Enter 1 else 0");
        int cityNum = scanner7.nextInt();
        if(cityNum == 1) {
            System.out.println("Enter the city to get details of people in that city");
            scanner7.nextLine();
            String detailsOfCity = scanner7.nextLine();
            int cityFound=0;
            for(Contacts contact : addressBook){
                if (contact.getCity().equalsIgnoreCase(detailsOfCity)){
                    cityFound = 1;
                    break;
                }

            }
            if(cityFound == 1) {
                addressBook.stream().filter(i -> i.getCity().equals(detailsOfCity))
                        .forEach(System.out::println);
            }else {
                System.out.println("City not found");
                searchCity();
            }
        }
    }

    private static void cityWithName(){
        Scanner sc5 = new Scanner(System.in);
        System.out.println("Do you want to search persons with City Enter 1 else 0");
        int allCityNum = sc5.nextInt();
        if(allCityNum == 1) {
            addressBook.stream().map(i -> i.getCity() + " " + i.getFirstName() + " " + i.getLastName())
                    .forEach(System.out::println);
        }
        else{
            System.out.println("Exited from address book");
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<=10; i++) {
            System.out.println("Do you want to add new contact? Enter 1 else 0");
            int Add = sc.nextInt();
            if (Add == 1) {
                addContact();
            }
            else{
                break;
            }
        }
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

        System.out.println("If you want to delete enter 1 else 0");
        Scanner scanner3 = new Scanner(System.in);
        int toDelete = scanner3.nextInt();
        if (toDelete == 1){
            deleteContact();
        }
        else{
            System.out.println("No contact is deleted");
        }
        searchCity();
    }


    private static void display(){
        for(Contacts a : addressBook){
            System.out.println(a);
        }
    }
    private static void addContact(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your details \n Firstname \n lastname \n address \n city \n zip, \n phonenum \n email \n ");
        String FName = sc.nextLine();

        for(Contacts item : addressBook){
            if(FName.equals(item.getFirstName())){
                System.out.println("This contact is already available");
                addContact();
            }
        }

        String LName = sc.nextLine();
        String Address = sc.nextLine();
        String City = sc.nextLine();
        String Zip = sc.nextLine();
        String Num = sc.nextLine();
        String Email = sc.nextLine();

        Contacts contact = new Contacts(FName, LName, Address, City, Zip, Num, Email);
        addressBook.add(contact);
        System.out.println("Contact added successfully");
        display();
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

    private static void deleteContact(){
        System.out.println("Enter the fname of the contact to delete: ");
        Scanner scanner4 = new Scanner(System.in);
        String ContactToDelete = scanner4.nextLine();

        boolean contactFound = false;
        for (Contacts contact : addressBook){
            if (contact.getFirstName().equalsIgnoreCase(ContactToDelete)){
                addressBook.remove(contact);
                contactFound = true;
                System.out.println("Contact deleted successfully");
                break;
            }
        }
        if (!contactFound){
            System.out.println("Contact not found");
        }
        display();
    }


}
