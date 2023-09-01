import java.util.ArrayList;
import java.util.List;

public class School {
    List<Student> studentsOfPunk = new ArrayList<>();

    public void addStudent(String firstName, String lastName, int matrikelNumber){
        Student student = new Student(firstName, lastName, matrikelNumber);
        studentsOfPunk.add(student);
    }

    @Override
    public String toString() {
        return "School{" +
                "studentsOfPunk=" + studentsOfPunk +
                '}';
    }

    public Student findStudent(int matrikelNumber){
        Student current = new Student();
        int schoolSize = studentsOfPunk.size();

        for(int i = 0; i < schoolSize; i++){
            current = studentsOfPunk.get(i);
            if(current.matrikelNumber == matrikelNumber){
                return current;
            }
        }
        return current;
    }

    public void removeStudent(int matrikelNumber){
        Student current = new Student();
        int schoolSize = studentsOfPunk.size();

        for(int i = 0; i < schoolSize; i++){
            current = studentsOfPunk.get(i);
            if(current.matrikelNumber == matrikelNumber){
                studentsOfPunk.remove(current);
            }
        }
    }
}
