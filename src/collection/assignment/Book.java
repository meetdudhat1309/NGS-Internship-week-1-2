package collection.assignment;

public class Book {
    private int id;
    private String isbnNo;
    private String name;
    private int publicationYear;

    public Book(int id, String isbnNo, String name, int publicationYear) {
        this.id = id;
        this.isbnNo = isbnNo;
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public String getIsbnNo() {
        return isbnNo;
    }

    @Override
    public String toString() {
        return "\nBook{" +
                "id=" + id +
                ", isbnNo='" + isbnNo + '\'' +
                ", name='" + name + '\'' +
                ", publicationYear=" + publicationYear +
                '}';
    }
}
