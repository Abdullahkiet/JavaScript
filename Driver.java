import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        
        //Association b/w book and Driver
        Book book1 = new Book("Design Patterns", "GoF");
        Book book2 = new Book("Automata", "Ulman");
        Book book3 = new Book("Network Programming", "Richard Blum");

        ArrayList<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

        //Composition b/w library and book
        //Association b/w library and driver
        Library library = new Library(books);

        ArrayList<Book> getFromLibrary = library.getBooks();
        
        //Printing Books with author
        for (Book book:books){
            System.out.println("Author: " + book.getAuthor() + " Book: " + book.getTitle());
        }
    }

}
