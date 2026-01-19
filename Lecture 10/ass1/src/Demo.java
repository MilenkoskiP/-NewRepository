import java.util.*;
import java.util.stream.Collectors;
public class Demo {

    public static void main(String[] args) {

        // (1) Create list of books
        List<Book> books = new ArrayList<>();
        books.add(new Book("Clean Code", "Robert C. Martin", 0, 0));
        books.add(new Book("Effective Java", "Joshua Bloch", 0, 0));
        books.add(new Book("The Pragmatic Programmer", "Andrew Hunt", 0, 0));
        books.add(new Book("Design Patterns", "GoF", 0, 0));
        books.add(new Book("Java Complete Reference", "Herbert Schildt", 0, 0));

        // (2) Assign random price and quantity
        Random r = new Random();
        for (Book b : books) {
            double price = 10 + r.nextDouble() * 190; // 10–200
            int quantity = r.nextInt(2001);           // 0–2000
            b.setPrice(Math.round(price * 100.0) / 100.0);
            b.setQuantity(quantity);
        }

        // (3) Print original list
        System.out.println("Original list:");
        books.forEach(Book::printAtributes);
        System.out.println();

        // (a) Sort by title
        List<Book> sortedByTitle = books.stream()
                .sorted(Comparator.comparing(Book::getTitle))
                .collect(Collectors.toList());

        System.out.println("(a) Sorted by title:");
        sortedByTitle.forEach(Book::printAtributes);
        System.out.println();

        // (b) Most expensive and cheapest
        Optional<Book> mostExpensive =
                books.stream().max(Comparator.comparingDouble(Book::getPrice));

        Optional<Book> cheapest =
                books.stream().min(Comparator.comparingDouble(Book::getPrice));

        System.out.println("(b) Most expensive:");
        mostExpensive.ifPresent(Book::printAtributes);

        System.out.println("(b) Cheapest:");
        cheapest.ifPresent(Book::printAtributes);
        System.out.println();

        // (c) Quantity > 1000
        boolean anyOver1000 =
                books.stream().anyMatch(b -> b.getQuantity() > 1000);

        System.out.println("(c) Any book with quantity > 1000?");
        System.out.println(anyOver1000 ? "YES" : "NO");
    }
}
