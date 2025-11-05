public class Student extends Person {
    String major;

    public Student(String name, int universityId, String major) {
        super(name, universityId);
        this.major = major;
    }

    @Override
    public void displayDetails() {
        String name = null;
        System.out.println("Student: " + name + ", ID: " + universityId + ", Major: " + major);
    }
}
