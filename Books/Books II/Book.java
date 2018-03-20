public class Book {
    private int id;
    private String name;
    private String author;
    private String publisher;

    public Book (int id, String name, String author, String publisher) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
    }
    public int getID() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getAuthor() {
        return author;
    }
    public String getPublisher() {
        return publisher;
    }
}
