public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[5];

        people[0] = new Student("Alice", 1001, "Computer Science");
        people[1] = new Staff("Bob", 2002, "Admissions");
        people[2] = new Staff("Charlie", 2003, "IT Services");
        people[3] = new Student("Diana", 1004, "Physics");

        for (int i = 0; i < people.length; i++) {
            people[i].displayDetails();
        }
    }
}
