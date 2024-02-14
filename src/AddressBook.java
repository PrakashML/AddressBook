public class AddressBook {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");
        Contacts contact = new Contacts("Prakash", "K", "Lake view Road", "Chennai", "245643", "5666546546", "pk5465@gmail.com");
        System.out.println(contact.FirstName);
        System.out.println(contact.PhoneNum);
    }
}
