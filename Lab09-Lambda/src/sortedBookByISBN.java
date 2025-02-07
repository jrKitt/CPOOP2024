/**
 * @author นายกิตติชัย รักษาวงค์ 673380028-2 Section.1
 */
public class sortedBookByISBN implements BookComparator{
    public int compare(Book b1, Book b2) {
        return b1.getIsbn().compareTo(b2.getIsbn());
    }
}
