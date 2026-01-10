public class Main {
    public static void main(String[] args) {
        Student student = new Student("S123", "Alice");
        Professor professor = new Professor("P456", "Dr. Bob");
        DepartmentHead departmentHead = new DepartmentHead("DH789", "Dr. Carol", "Computer Science");
        StaffMember staffMember = new StaffMember("SM012", "David", "Admissions");

        System.out.println("Student Activities:");
        student.attendClass("Data Structures");
        student.attendClass("Operating Systems");
        student.displayCourses();
        System.out.println();

        System.out.println("Professor Activities:");
        professor.teacherCourse("Algorithms");
        professor.teacherCourse("Database Systems");
        professor.countResearch("Artificial Intelligence");
        professor.countResearch("Machine Learning");
        professor.displayCoursesTaught();
        professor.displayResearchTopics();
        System.out.println();

        System.out.println("Department Head Activities:");
        departmentHead.teacherCourse("Computer Networks");
        departmentHead.countResearch("Cybersecurity");
        departmentHead.manageDepartment("Information Technology");
        departmentHead.displayCoursesTaught();
        departmentHead.displayResearchTopics();
        departmentHead.displayDepartment();
        System.out.println();

        System.out.println("Staff Member Activities:");
        staffMember.manageDepartment("Student Affairs");
        staffMember.displayDepartment();
        System.out.println();

        System.out.println("University Members Information:");
        displayMemberInfo(student);
        displayMemberInfo(professor);
        displayMemberInfo(departmentHead);
        displayMemberInfo(staffMember);
    }

    public static void displayMemberInfo(UniversityMember member) {
        System.out.println("ID: " + member.getId());
        System.out.println("Name: " + member.getName());
        System.out.println("Role: " + member.getRole());
        System.out.println();
    }
}