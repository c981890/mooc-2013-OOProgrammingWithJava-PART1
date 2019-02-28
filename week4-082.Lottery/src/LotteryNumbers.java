import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random random = new Random();

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
        this.random = new Random();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        // Write the number drawing here using the method containsNumber()
        int i = 0;
        int drawnNumber = 0;
        while (this.numbers.size() < 7) {
            drawnNumber = this.random.nextInt(39) + 1;
            if (!containsNumber(drawnNumber)) {
                this.numbers.add(drawnNumber);           
            }          
            i++;
        }
    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        for (int member : this.numbers) {
            if (member == number) {
                return true;
            }
        }
        return false;
    }
}
