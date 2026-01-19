import java.util.*;
import java.util.function.Predicate;
public class Main {
    public static void main(String[] args) {
        Predicate<Student> p1 = s -> s.stuName.startsWith("L");
        Predicate<Student> p2 = s -> s.stuAge < 28 && s.stuName.startsWith("P");
        List<Student> list = Student.getStudents();

        boolean b1 = list.stream().noneMatch(p1);
        System.out.println("list.stream().noneMatch(p1): " + b1);

        boolean b2 = list.stream().noneMatch(p2);
        System.out.println("list.stream().noneMatch(p2): " + b2);
    }
}