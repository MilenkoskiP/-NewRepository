import java.util.List;
import java.util.function.Predicate;
import java.util.ArrayList;
class Student{
    int stuId;
    int stuAge;
    String stuName;
    Student(int id, int age, String name){
        this.stuId = id;
        this.stuAge = age;
        this.stuName = name;
    }
    public int getStuId() {
        return stuId;
    }
    public int getStuAge() {
        return stuAge;
    }
    public String getStuName() {
        return stuName;
    }

    public static List<Student> getStudents(){
        List<Student> list = new ArrayList<>();
        list.add(new Student(11, 28, "Lucy"));
        list.add(new Student(28, 27, "Kiku"));
        list.add(new Student(32, 30, "Dani"));
        list.add(new Student(49, 27, "Steve"));
        return list;
    }
}