import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        
        System.out.print("In reverse order: ");
        int i = name.length();
        int j = 1;
        
        while (i >= 1) {
            System.out.print(name.charAt(name.length() - j));
            i--;
            j++;
        }
    }
}
