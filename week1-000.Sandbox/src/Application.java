
import java.util.*;

// This is not an exercise but a "sandbox" where you can freely test
// whatever you want
public class Application {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        
        


    }
    
    public static int insertNumber (Scanner reader) {
        while (true) {
            System.out.print("Write a number: ");
            try {
                int num = Integer.parseInt(reader.nextLine());
                System.out.println("Looks good!");
                return num; // or you can use break;
            } catch (Exception e) {
                System.out.println("You have not written a proper number.");
            }
        }
    }
}
