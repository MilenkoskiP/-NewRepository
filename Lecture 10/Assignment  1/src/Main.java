import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
public class Main {
    public static void main(String[] args) {
        List<Integer> initialListOfNumbers = Arrays.asList(1, 2, 3, 4, 5);
    System.out.println("Demostation of map method: ");
    List <Integer> square =  initialListOfNumbers.stream().map(x -> x*x).collect(Collectors.toList());
    System.out.println(square);
    }
}