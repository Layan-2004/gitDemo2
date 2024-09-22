import java.util.List;
import java.util.Scanner;

public class StudentReader {

    
    public void readStudentList(List<String> names, List<Integer> ages) {
        Scanner scanner = new Scanner(System.in);
        String addMore = "yes";

        while (addMore.equalsIgnoreCase("yes")) {
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();

            System.out.print("Enter student age: ");
            int age = scanner.nextInt();
            scanner.nextLine();  

            
            names.add(name);
            ages.add(age);

            System.out.print("Do you want to add another student? (yes/no): ");
            addMore = scanner.nextLine();
        }

        
        scanner.close();
    }
}
