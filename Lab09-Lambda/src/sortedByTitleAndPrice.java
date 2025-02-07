/**
 * @author นายกิตติชัย รักษาวงค์ 673380028-2 Section.1
 */
import java.util.Comparator;
public class sortedByTitleAndPrice implements BookComparator {
    public int compare(Book b1, Book b2) {
        return Comparator.comparing(Book::getTitle).thenComparing(Book::getPrice).compare(b1, b2);
    }
}