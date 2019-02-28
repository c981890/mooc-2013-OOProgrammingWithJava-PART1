
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program
        Scores scores = new Scores();
        
        System.out.println("Type exam scores, -1 completes: ");
        
        while (true) {
            int number = Integer.parseInt(reader.nextLine());
            if (number == -1) {
                break;
            }
            scores.add(number);
        }
        
        
        System.out.println("Grade distribution:");
        
        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");
            scores.printStars(i);
            System.out.println("");
        }
        
        scores.acceptanceScore();

        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        // doSomething(reader);
    }

    public static void doSomething(Scanner scanner) {
        String riw = scanner.nextLine();
       
    }
}
