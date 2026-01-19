import java.util.stream.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        List <String> initialListOfNames = Arrays.asList("Reflection", "Collection", "Stream", "Java", "Storing");

        System.out.println("Demonstration of filter method: ");
        List <String> result = initialListOfNames.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());
        System.out.println(result);
        System.out.println();

        System.out.println("Demonstration of sorted method: ");
        List <String> sortedList = initialListOfNames.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);
        System.out.println();

        List <Integer> numbers = Arrays.asList(2, 3, 4, 5, 2);

        System.out.println("Collect method returns a set: ");
        Set <Integer> Squareset = numbers.stream().map(x -> x*x).collect(Collectors.toSet());
        System.out.println(Squareset);
        System.out.println();

        System.out.println("Demonstration of forEach method: ");
        numbers.stream().forEach(x -> System.out.println(x));
        System.out.println();

        System.out.println("Demonstration of allMatch method: ");
        boolean isBiggerthan1 = numbers.stream().allMatch(x -> x > 1);
        System.out.println("Is every number in the list NOT smaller than 1? " + isBiggerthan1);
        System.out.println();

        System.out.println("Demonstration of oneMatch method: ");
        boolean isSmallerThan1 = numbers.stream().noneMatch(x -> x < 1);
        System.out.println("Is every number in the list NOT smaller than 1? " + isSmallerThan1);
    }
}