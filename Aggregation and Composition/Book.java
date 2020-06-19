//Book Class

    public class Book {
    private String title;
    private String author;
//Constructor

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book() {
        this.title = "";
        this.author = "";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
