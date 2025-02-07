import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class BookCatalog {
    List<Book> books = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }

    public void sortByISBN(){
        new sortedBookByISBN();
    }
    public void sortByISBNLambda() {
        books.sort(new sortedByISBNLambda());
    }

    public void sortByISBNAnonymous() {
        books.sort(new sortedByISBNAnonymous()::compare);
    }

    public void sortByISBNMethodRef() {
        books.sort(new sortedByISBNMethodRef());
    }

    public void sortByTitleAndPrice() {
       books.sort(new sortedByTitleAndPrice());
    }

    public void showBooks(){
        for(Book book : books){
            System.out.printf("ISBN: %-4s Title: %-10s %8.2f Year: %s%n", book.getIsbn(), book.getTitle(), book.getPrice(), book.getYear());
        }
    }
}
