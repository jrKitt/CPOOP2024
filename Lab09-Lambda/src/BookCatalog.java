/**
 * @author นายกิตติชัย รักษาวงค์ 673380028-2 Section.1
 */
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class BookCatalog {
    static List<Book> books = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }

    public void sortByISBN(){
        new sortedBookByISBN();
    }
    public void sortByISBNLambda() {
        BookComparator tester = (Book b1, Book b2)->b1.getIsbn().compareTo(b2.getIsbn());
        Collections.sort(books, tester);
    }

    public void sortByISBNAnonymous() {
        BookComparator tester = new BookComparator() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getIsbn().compareTo(o2.getIsbn());
            }
        };
        Collections.sort(books, tester);
    }

    public static int sortByISBNMethodRef(Book book1, Book book2) {
        return book1.getIsbn().compareTo(book2.getIsbn());
    }

    public void sortByISBNMethodRef(){
        BookComparator tester = BookCatalog::sortByISBNMethodRef;
        Collections.sort(books, tester);
    }

    public void sortByTitleAndPrice() {
        books.sort(Comparator.comparing(Book::getTitle).thenComparing(Book::getPrice));
    }


    public void showBooks(){
        for(Book book : books){
            System.out.printf("ISBN: %-4s Title: %-10s %8.2f Year: %s%n", book.getIsbn(), book.getTitle(), book.getPrice(), book.getYear());
        }
    }
}
