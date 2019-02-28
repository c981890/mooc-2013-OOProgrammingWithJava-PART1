import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        
        while (true) {
            System.out.print("Type a word: ");
            String word = reader.nextLine();
            if ( word.isEmpty() ) {  // could also be: word.equals("")
            // word was empty, meaning that the user only pressed enter
            break;
            }
            words.add(word); 
        }
        for (String word : words) {
            System.out.println(word);
        }
    }
}
