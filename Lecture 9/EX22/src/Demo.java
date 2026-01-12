public class Demo {
    public static void main(String[] args) {
        Student student = new Student("Student", "07667843", 1005, 1323);
        StudentFileStream studentFileStream = new StudentFileStream();
        String fileName="student.txt";
        studentFileStream.writeToFIle(student,fileName);
        studentFileStream.readFromFile(fileName);
    }
}
