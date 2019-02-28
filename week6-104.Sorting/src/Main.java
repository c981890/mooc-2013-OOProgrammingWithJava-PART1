
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write testcode here
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }

    public static int smallest(int[] array) {
        // write the code here
        int smallest = array[0];
        for (int member : array) {
            if (member < smallest) {
                smallest = member;
            }
        }
        return smallest;
    }

    public static int indexOfTheSmallest(int[] array) {
        // code goes here
        int indexOfSmallest = 0;
        int smallest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                indexOfSmallest = i;
            }
        }
        return indexOfSmallest;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        // write the code here
        int indexOfSmallest = index;
        int smallest = array[index];
        for (int i = index; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                indexOfSmallest = i;
            }
        }
        return indexOfSmallest;
    }

    public static void swap(int[] array, int index1, int index2) {
        // code goes here
        int helper1 = array[index1];
        int helper2 = array[index2];
        array[index1] = helper2;
        array[index2] = helper1;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
//            indexOfTheSmallestStartingFrom(array, i);
            printAll(array);
            swap(array, i, indexOfTheSmallestStartingFrom(array, i));
            printAll(array);
        }
    }
    
    public static void printAll(int[] array) {
        for (int member : array) {
            System.out.print(member);
        }
        System.out.println("");
    }

}
