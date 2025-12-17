package oop.assignmentQ05;

public class ReferenceBook extends Book{
    Person person;
    public ReferenceBook(String id, String title, String author, int availableCopies, Person person) {
        super(id, title, author, availableCopies);
        this.person = person;
    }

    @Override
    public void issueBook() {
        if (person.equals(Person.STUDENT) || person.equals(Person.PROFESSOR)){
            super.issueBook();
        }else {
            System.out.println("You are restricted to issue this book!");
        }
    }
}
