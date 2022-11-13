import java.util.ArrayList;
public class Project {
    private String name;
    private ArrayList<Student> students = new ArrayList<Student>();

    private Course course;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addMember(Student pStudent){
        students.add(pStudent);
    }

    public ArrayList<Student> getMembers(){
        return students;
    }
}
