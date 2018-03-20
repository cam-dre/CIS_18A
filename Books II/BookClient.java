// =================================================================================
// File: HW_7b - Books
// =================================================================================
// Programmer: Cameron Perry
// Class: CIS 18A
// =================================================================================
import java.util.ArrayList;

public class BookClient {
    public static void main(String[] args) {
        // ArrayList created
        ArrayList<Book> list = new ArrayList<Book>();

        // three book objects created and initialized with values
        Book book1 = new Book(100, "C++ Programming", "Deitel", "Synergy");
        Book book2 = new Book(101, "Java", "Gaddis", "McGraw Hill");
        Book book3 = new Book(100, "XML", "C.J.", "Smith Wiley");

        // book objects added to ArrayList
        list.add(book1);
        list.add(book2);
        list.add(book3);
        
        // for-each loop used to display all three book objects
        for (Book book : list)
            System.out.println(book.getID() + " " + book.getName() + " "
                    + book.getAuthor() + " " +  book.getPublisher());
    }
}

/* =====OUTPUT======================================================================
100 C++ Programming Deitel Synergy                                                           
101 Java Gaddis McGraw Hill                                                                         
100 XML C.J. Smith Wiley
==================================================================================*/