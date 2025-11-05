public class Staff extends Person {
    String department;

    public Staff(String name, int universityId, String department) {
        super(name, universityId);
        this.department = department;
    }
    @Override
    public void displayDetails() {
        String name = null;
        System.out.println("Staff: " + name + ", ID: " + universityId + ", Department: " + department);
    }
}
