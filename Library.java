import java.util.ArrayList;

public class Library {
    private final ArrayList<Book> books; //Final Keyword representing Aggregation

    Library(ArrayList<Book> books){
        this.books = books;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }
}
