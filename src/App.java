import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        
        List<String> names = new ArrayList<>();
        List<Integer> ages = new ArrayList<>();

        
        StudentReader studentReader = new StudentReader();
        
        
        studentReader.readStudentList(names, ages);

        
        System.out.println("List of students:");
        for (int i = 0; i < names.size(); i++) {
            System.out.println("Student{name='" + names.get(i) + "', age=" + ages.get(i) + "}");
        }
    }
}
