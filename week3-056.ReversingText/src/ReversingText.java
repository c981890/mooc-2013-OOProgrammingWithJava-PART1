
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        // write your code here
        // note that method does now print anything, it RETURNS the reversed string
        
        String help = "";

        // ...
        // adding a character to the help variable
        int i = text.length();
        int j = 1;
        
        while (i >= 1) {            
            help = help + text.charAt(text.length() - j);
            i--;
            j++;
        }                
        return help;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
