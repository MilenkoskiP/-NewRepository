import java.util.stream.Collectors;
import java.util.*;
public class Demo  {
    public static Student createStudent(String name, int indexNo, int age) {
        return new Student().withName(name).withIndexNo(indexNo).withAge(age);
    }

        public static void printValues(Student student) {
            System.out.println("Name: " + student.getName() + ", Index No: " + student.getIndexNo() + " and Age: " + student.getAge());
        }

        public static void main(String[] args) {
        List <String> names = Arrays.asList("Alice", "Bob", "Charlie", "Diana", "Ethan");
        Random rand = new Random();
        List <Student> students = names.stream().map(name->createStudent(name,rand.nextInt(10000)+1,rand.nextInt(13)+18)).collect(Collectors.toList());
        students.forEach(Demo::printValues);
        }
}