public class sortedByISBNLambda implements BookComparator {
    public int compare(Book b1, Book b2) {
        return b1.getIsbn().compareTo(b2.getIsbn());
    }
}
