import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        
        for (int number : list) {
            sum += number;
        }      
        return sum;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        int size = list.size();
        return (double) sum(list) / size;
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        double result = 0;
        double listAverage = average(list);
        
        for (double member : list) {
            result += Math.pow(((member - listAverage)), 2);
        }
        result = result / (list.size() - 1);
        return result;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
