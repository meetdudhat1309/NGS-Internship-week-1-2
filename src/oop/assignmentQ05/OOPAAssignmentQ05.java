package oop.assignmentQ05;

import oop.assignmentQ04.*;

public class OOPAAssignmentQ05 {
//    TODO: Q5: Library Management System
//    Design a Library System with the following:
//        Class Book
//            Private fields: bookId, title, author, availableCopies
//        Methods:
//            issueBook()
//            returnBook()
//        Create subclasses:
//            ReferenceBook
//            TextBook
//        Restrict issuing rules using overridden methods


    public static void main(String[] args) {
        Book b1 = new ReferenceBook("123","Mathematics","GTU",100, Person.STUDENT);
        Book b2 = new TextBook("123","Mathematics","GTU",100, Person.STUDENT);

        System.out.println(b1.getAvailableCopies());
        b1.issueBook();
        System.out.println(b1.getAvailableCopies());
        System.out.println(b2.getAvailableCopies());
        b2.issueBook();
        System.out.println(b2.getAvailableCopies());
    }
}
