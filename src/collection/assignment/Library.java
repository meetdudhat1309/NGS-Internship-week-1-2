package collection.assignment;

import java.util.*;

public class Library {
    //    <ISBN, Book>
    private LinkedHashMap<String, Book> books; // for prevent duplication

    public Library(LinkedHashMap<String, Book> books) {
        this.books = books;
    }

    public Book searchBookByISBNNo(String isbnNo) throws BookNotFoundException {
        if (books.containsKey(isbnNo)) {
            return books.get(isbnNo);
        }
        throw new BookNotFoundException("Book not found in library");
    }

    public List<Book> getSortedBooksByPublicationYear() {
        List<Book> sortedBooks = new ArrayList<>(books.values());
        Collections.sort(sortedBooks, (a, b) -> a.getPublicationYear() - b.getPublicationYear());
        return sortedBooks;
    }

    public List<Book> getSortedBooksByTitle() {
        List<Book> sortedBooks = new ArrayList<>(books.values());
        sortedBooks.sort((a, b) -> a.getName().compareTo(b.getName()));
        return sortedBooks;
    }

    public void addBook(Book book) throws DuplicateBookNotAllowed {
        if (!books.containsKey(book.getIsbnNo())) {
            books.put(book.getIsbnNo(), book);
        }else throw new DuplicateBookNotAllowed("Book with the same ISBN number is already in the library!");
    }

    public List<Book> getAllBooks(){
        return new ArrayList<>(books.values());
    }
}
