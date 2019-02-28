
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a year: ");
        int year = Integer.parseInt(reader.nextLine());
        
        int modBy4 = year%4;
        int modBy100 = year%100;
        int modBy400 = year%400;
        
        if (modBy4 == 0) {
            if (modBy100 == 0 && modBy400 != 0) {
            System.out.println("The year is not leap year.");
            } else {
                System.out.println("The year is a leap year.");
            }
        } else {
            System.out.println("The year is not leap year.");
        }     
               
            
    }
}
