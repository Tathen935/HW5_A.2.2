import java.util.ArrayList;

public class Student {
    private int id;
    private String name;
    private Project project;
    private ArrayList<Course> courses = new ArrayList<Course>();

    public String getName(){
        return name;
    }

    public Project getProject() {
        return project;
    }
}
