import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student angie = new Student("Angela", "Merkel", 161);
        Student daddy = new Student("Gregor", "Gysi", 1312);
        Student lilOldie = new Student("Philipp", "Amthor", 420);

        List<Student> students = new ArrayList<>();

        students.add(angie);
        students.add(daddy);
        students.add(lilOldie);

        School schoolOfSwag = new School(students);

        System.out.println(schoolOfSwag.findStudent(1312));

        Student myselfLol = new Student("Rylie", "Castell", 420161);
        schoolOfSwag.addStudent(myselfLol);
        System.out.println(schoolOfSwag.findStudent(420161));
    }


}
