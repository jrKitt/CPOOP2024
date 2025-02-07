import java.util.Comparator;
public class sortedByISBNMethodRef implements BookComparator {
    public int compare(Book b1, Book b2) {
        return Comparator.comparing(Book::getIsbn).compare(b1, b2);
    }
}
