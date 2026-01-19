import java.util.stream.Collectors;
import java.util.*;
public class Demo2 {
    public static Student createStudent(String name, int indexNo, int age) {
        return new Student().withName(name).withIndexNo(indexNo).withAge(age);
    }
    public static void printValues(Student student) {
        System.out.println("Name: " + student.getName() + ", Student index number: " + student.getIndexNo() + " and Student age: " + student.getAge());
    }
    public static void main(String[] args) {
        List <String> names = Arrays.asList("Peter", "Paul", "Alison", "Saba", "Lily");
        Random rand = new Random();
        List <Student> students = names.stream().map(s -> createStudent(s, rand.nextInt(1000)+1, rand.nextInt(13)+18)).collect(Collectors.toList());
        System.out.println("Student list:");
        students.forEach(Demo2::printValues);
        System.out.println();

        List <Student> pstudents = students.stream().filter(s -> s.getName().startsWith("P")).collect(Collectors.toList());

        System.out.println("Print all students with name that starts with P: ");
        pstudents.forEach(Demo2::printValues);
        System.out.println();

        boolean allYoungerThan25 = students.stream().allMatch(s -> s.getAge() < 25);
        System.out.println("Are all students younger than 25? " + allYoungerThan25);
        boolean allOlderThan25 = students.stream().allMatch(s -> s.getAge() > 25);
        System.out.println("Are all students older than 25? " + allOlderThan25);
        boolean anyYoungerThan25 = students.stream().anyMatch( s -> s.getAge() < 25);
        System.out.println("Is there a student younger that 25? " + anyYoungerThan25);
    }
}
