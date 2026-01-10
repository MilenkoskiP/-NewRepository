import java.util.ArrayList;
import java.util.List;

public class Professor implements UniversityMember, Educator, Researcher {

    private String id;
    private String name;
    private String role;
    List<String> coursesTaught;
    List<String> researchTopics;

    public Professor(String id, String name) {
        this.id = id;
        this.name = name;
        this.role = "Professor";
        this.coursesTaught = new ArrayList<>();
        this.researchTopics = new ArrayList<>();
    }


    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public String getRole(){
        return role;
    }

    @Override
    public void teacherCourse(String courseName) {
        coursesTaught.add(courseName);
    }

    @Override
    public void countResearch(String topic) {
        researchTopics.add(topic);
        System.out.println(name + "is conducting research on: " + topic);
    }

    public void displayCoursesTaught(){
        System.out.println(name + "is teaching the following courses: ");
        for(String course : coursesTaught){
            System.out.println("- " + course);
        }
    }

    public void displayResearchTopics(){
        System.out.println(name + "is conducting research on: ");
        for(String topic : researchTopics){
            System.out.println("- " + topic);
        }
    }
}