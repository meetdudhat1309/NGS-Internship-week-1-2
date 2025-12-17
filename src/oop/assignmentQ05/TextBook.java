package oop.assignmentQ05;

public class TextBook extends Book{
    Person person;
    public TextBook(String id, String title, String author, int availableCopies, Person person) {
        super(id, title, author, availableCopies);
        this.person = person;
    }

    @Override
    public void issueBook() {
        if (person.equals(Person.PRINCIPAL) || person.equals(Person.HOD)){
            super.issueBook();
        }else {
            System.out.println("You are restricted to issue this book:(");
        }
    }
}
