import java.util.stream.Stream;
public class Main {
    public static void main(String[] args) {
        Stream.iterate(1, x -> x + 1).filter(x -> x % 3 == 0).limit(1000).forEach(System.out::println);
    }
}