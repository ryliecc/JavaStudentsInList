import java.util.ArrayList;
import java.util.List;

public class Student {
    String firstName;
    String lastName;
    int matrikelNumber;

    public Student(String firstName, String lastName, int matrikelNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.matrikelNumber = matrikelNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getMatrikelNumber() {
        return matrikelNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMatrikelNumber(int matrikelNumber) {
        this.matrikelNumber = matrikelNumber;
    }


}
