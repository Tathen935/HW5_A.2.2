import java.util.ArrayList;
public class Course {
    private int id;
    private String name;
    private int maxCapacity;
    private boolean isFull;

    private Department department;
    private ArrayList<Professor> professoren = new ArrayList<Professor>();
    private ArrayList<Student> students = new ArrayList<Student>();

    private ArrayList<Project> projects = new ArrayList<Project>();

    private ArrayList<Exam> exams = new ArrayList<Exam>();

    public Course(int pId, String pName, int pMaxCapacity, Professor pProfessor){
        id = pId;
        name = pName;
        maxCapacity = pMaxCapacity;
        professoren.add(pProfessor);
    }

    public void enroll(Student pStudent){
        students.add(pStudent);
    }
    public void apply(){}

    public void setMaxCapacity(int pMaxCapacity){
        maxCapacity = pMaxCapacity;
    }

    public ArrayList<Professor> getProfessoren(){
        return professoren;
    }

    public void getTA(){}
    public void setTA(){}
    public void setName(String pName){
        name = pName;
    }
}
