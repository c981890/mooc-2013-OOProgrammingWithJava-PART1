
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        Scanner reader = new Scanner(System.in);
        
        ArrayList<Student> list = new ArrayList<Student>();
        
//        Student pekka = new Student("Pekka Mikkola", "013141590");
//        System.out.println("name: " + pekka.getName());
//        System.out.println("studentnumber: " + pekka.getStudentNumber());
//        System.out.println(pekka);
        
        while (true) {
            System.out.print("name: ");
            String name = reader.nextLine();
            if (name.equals("")) {
                break;
            }
            
            System.out.print("studentnumber: ");
            String studentNumber = reader.nextLine();
            
            list.add(new Student(name, studentNumber));            
        }
        
        for (Student member : list) {
            System.out.println(member);
        }
        
        System.out.print("Give search term: ");
        String searchTerm = reader.nextLine();
        
        System.out.println("Result: ");
        
        for (Student member : list) {
            String name = member.getName();
            if (name.contains(searchTerm)) {
                System.out.println(member.toString());
            }
        }
    }
}
