import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Books {
    AddressBook Book;
    public Books(){
        this.Book = null;
    }
    public void BookService(AddressBook addressBook){
        HashMap<String, AddressBook> book = new HashMap<String, AddressBook>();
        AddressBook aBook = new AddressBook();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the Book");
        String bookName = sc.next();
        book.put(bookName, Book);
    }

}
