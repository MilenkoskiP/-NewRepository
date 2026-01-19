import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.*;
public class Main {
    public static void main(String[] args) {
        List <String> listOfStrings = Arrays.asList("a","b","c","d");
        List <String> collect = listOfStrings.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
        System.out.println(collect);
    }
}