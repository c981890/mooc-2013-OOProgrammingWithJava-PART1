
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int guessesNumber = 0;

        // program your solution here. Do not touch the above lines!
        System.out.println(numberDrawn);
        
        while (true) {
            System.out.println("Guess a number: ");
            int number = Integer.parseInt(reader.nextLine());
            guessesNumber++;
            if (number > numberDrawn) {
                System.out.println("The number is lesser, guesses made: " + guessesNumber);
            } else if (number < numberDrawn) {   
                System.out.println("The number is greater, guesses made: " + guessesNumber);        
            } else if (number == numberDrawn) {
                System.out.println("Congratulations, your guess is correct!");
                break;
            }
        }
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
