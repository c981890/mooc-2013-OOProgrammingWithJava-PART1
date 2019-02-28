
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ObservationDB birds = new ObservationDB();
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program

        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        //add(reader);
        while (true) {
            System.out.print("? ");
            String com = reader.nextLine();
            if (com.equals("Quit")) {
                break;
            }
            commands(reader, birds, com);
        }

    }

    public static void commands(Scanner scanner, ObservationDB birds, String com) {
        if (com.equals("Add")) {
            add(scanner, birds);
        } else if (com.equals("Statistics")) {
            birds.statistics();
        } else if (com.equals("Observation")) {
            observation(scanner, birds);
        } else if (com.equals("Show")) {
            show(scanner, birds);
        }
    }

    public static void add(Scanner scanner, ObservationDB birds) {
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Latin Name: ");
        String latinName = scanner.nextLine();
        birds.addBird(name, latinName);
    }
    
    public static void observation(Scanner scanner, ObservationDB birds) {
        System.out.print("What was observed: ");
        String name = scanner.nextLine();
        if (birds.doesItExist(birds, name)) {
            birds.addObservation(birds, name);
        } else {
            System.out.println("Is not a bird!");
        }       
    }
    
    public static void show(Scanner scanner, ObservationDB birds) {
        System.out.print("What? ");
        String name = scanner.nextLine();
        birds.findShow(birds, name);
    }
    
}
