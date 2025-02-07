import java.time.LocalDate;

public class Book extends Object{
    private String isbn;
    private String title;
    private double price;
    private LocalDate year;

    public Book(){
        super();
    }
    public Book(String isbn, String title, double price, LocalDate year){
        this.isbn = isbn;
        this.title = title;
        this.price = price;
        this.year = year;
    }

    public String getIsbn(){
        return isbn;
    }
    public String getTitle(){
        return title;
    }
    public double getPrice(){
        return price;
    }
    public LocalDate getYear(){
        return year;
    }

    public void setIsbn(String isbn){
        this.isbn = isbn;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setYear(LocalDate year){
        this.year = year;
    }


    public String sho(){
        return isbn + " " + title + " " + price + " " + year;
    }
}
