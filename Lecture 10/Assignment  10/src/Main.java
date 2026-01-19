import java.util.stream.Collectors;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        List <Integer> initialListOfNumbers = Arrays.asList(2,3,4,5,2);
        System.out.println("Map method demo: ");
        List <Integer> square = initialListOfNumbers.stream().map(x -> x*x).collect(Collectors.toList());
        System.out.println("Squares are: " + square);
        System.out.println();

        List <String> listOfStings = Arrays.asList("a", "b", "c");
        List <String> collect = listOfStings.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
        System.out.println("Upper Case letters are: " + collect);
        System.out.println();

        List <String> initialListOfNames = Arrays.asList("Reflection", "Collection", "Stream", "Java", "Sorting");
        List <String> result = initialListOfNames.stream().filter(x -> x.startsWith("S")).collect(Collectors.toList());
        System.out.println("Filtered results are: " + result);
        System.out.println();

        List <String> sortedList = initialListOfNames.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted results are: " + sortedList);
        System.out.println();

        Set <Integer> setNumbers = initialListOfNumbers.stream().map( x -> x*x).collect(Collectors.toSet());
        System.out.println("Sets are: " + setNumbers);
        System.out.println();

        initialListOfNumbers.stream().map( x -> x*x).forEach( y -> System.out.println(y));
        System.out.println();

        boolean isBiggerThen = initialListOfNumbers.stream().allMatch(x -> x > 1);
        System.out.println("Are all numbers in the list bigger then 1: " + isBiggerThen);
        System.out.println();

        boolean isSmaller = initialListOfNumbers.stream().noneMatch( x -> x > 1);
        System.out.println("Are all numbers in the list smaller then 1: " + isSmaller);
        System.out.println();

    }
}