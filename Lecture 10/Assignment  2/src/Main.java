import java.util.stream.Collectors;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        List <String> names = Arrays.asList("Melisandre","Sansa","Jon","Daenerys","Joffery");
        List <String> longnames = names.stream().filter(s -> s.length() > 6).collect(Collectors.toList());
        longnames.forEach(System.out::println);
    }
}