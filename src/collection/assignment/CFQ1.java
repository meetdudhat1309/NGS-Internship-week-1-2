package collection.assignment;

//The system must:
//Store books without duplicates
//Maintain insertion order for display
//Support fast search by ISBN
//Allow sorted views by title and by publication year
//Support concurrent read and write operations
//Allow fail-fast iteration where applicable

import java.util.LinkedHashMap;

public class CFQ1 {
    public static void main(String[] args) {
        Library library = new Library(new LinkedHashMap<>());

        Book b1 = new Book(1, "1234567890", "Mathematics", 2024);
        Book b2 = new Book(4, "2345678901", "Physics", 2020);
        Book b3 = new Book(5, "3456789012", "Graphics", 2025);
        Book b4 = new Book(2, "4567890123", "Geometry", 2021);
        Book b5 = new Book(3, "5678901234", "Algebra", 2018);

        try {
            library.addBook(b1);
            library.addBook(b2);
            library.addBook(b3);
            library.addBook(b4);
            library.addBook(b5);
        } catch (DuplicateBookNotAllowed e) {
            e.printStackTrace();
        }

        System.out.println(library.getAllBooks());

        System.out.println(library.getSortedBooksByTitle());

        System.out.println(library.getSortedBooksByPublicationYear());


        try {
            Book b = library.searchBookByISBNNo("3456789012");
            System.out.println(b);
        } catch (BookNotFoundException e) {
            e.printStackTrace();
        }
    }
}
