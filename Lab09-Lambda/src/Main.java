/**
 * @author นายกิตติชัย รักษาวงค์ 673380028-2 Section.1
 */
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        BookCatalog catalog = new BookCatalog();
        System.out.println("Book comparator testing");
        catalog.addBook(new Book("789", "C++", 300, LocalDate.of(2020, 1, 1)));
        catalog.addBook(new Book("123", "Java", 100, LocalDate.of(2020, 1, 1)));
        catalog.addBook(new Book("456", "Python", 200, LocalDate.of(2020, 1, 1)));
        catalog.showBooks();
        System.out.println("=====================================");

        System.out.println("Sorting by ISBN");
        catalog.sortByISBN();
        catalog.showBooks();
        System.out.println("=====================================");

        catalog.addBook(new Book("111", "C", 435, LocalDate.of(2020, 1, 1)));
        System.out.println("Sorting by ISBN by lambda");
        catalog.sortByISBNLambda();
        catalog.showBooks();
        System.out.println("=====================================");

        catalog.addBook(new Book("222", "C#", 12, LocalDate.of(2020, 1, 1)));
        System.out.println("Sorting by ISBN by anonymous class");
        catalog.sortByISBNAnonymous();
        catalog.showBooks();
        System.out.println("=====================================");

        catalog.addBook(new Book("333", "JavaScript", 235234, LocalDate.of(2020, 1, 1)));
        System.out.println("Sorting by ISBN by method reference");
        catalog.sortByISBNMethodRef();
        catalog.showBooks();
        System.out.println("=====================================");

        catalog.addBook(new Book("234", "C", 5555, LocalDate.of(2020, 1, 1)));
        System.out.println("Sorting by Title and Price");
        catalog.sortByTitleAndPrice();
        catalog.showBooks();
        System.out.println("=====================================");

    }
}