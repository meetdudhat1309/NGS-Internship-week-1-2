package oop.assignmentQ05;

abstract class Book {
    private String id;
    private String title;
    private String author;
    private int availableCopies;

    public Book(String id, String title, String author, int availableCopies) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.availableCopies = availableCopies;
    }

    public int getAvailableCopies() {
        return availableCopies;
    }

    public void issueBook(){
        if (availableCopies>0) availableCopies--;
        else System.out.println("Book not available!");
    }

    public void returnBook(){
        availableCopies++;
    }
}
