// (1) Book class
public class Book {

    // (2) Fields
    private String title;
    private String author;
    private double price;
    private int quantity;

    // (3) Constructor
    public Book(String title, String author, double price, int quantity) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

    // (4) Setters
    public void setTitle(String title) { this.title = title; }
    public void setAuthor(String author) { this.author = author; }
    public void setPrice(double price) { this.price = price; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    // (5) Getters
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    // (6) Print method
    public void printAtributes() {
        System.out.println(
                "Title: " + title +
                        ", Author: " + author +
                        ", Price: " + price +
                        ", Quantity: " + quantity
        );
    }
}

