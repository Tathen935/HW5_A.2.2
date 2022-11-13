import java.util.ArrayList;

public class Exam {
    private int maxValue;
    private ArrayList<Question> questions = new ArrayList<Question>();
    private ArrayList<Student> students = new ArrayList<Student>();

    public Exam(int pMaxValue, int pId, String pTask, int pValue){
        maxValue = pMaxValue;
        Question q = new Question(pId, pTask, pValue);
        questions.add(q);
    }

    public boolean register(Student pStudent){
        students.add(pStudent);
        return true;
    }

    public void addQuestion(int pId, String pTask, int pValue){
        Question q = new Question(pId, pTask, pValue);
        questions.add(q);
    }

    public ArrayList<Student> getRegisteredStudents(){
        return students;
    }

    public void setMaxValue(int pMaxValue){
        maxValue = pMaxValue;
    }
}
