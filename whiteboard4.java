import java.util.ArrayList;
import java.util.Collections;

public class whiteboard4 {
    public static void main(String[] args) {

        // create arraylist to hold integers
        ArrayList<Integer> unsorted_array0 = new ArrayList<Integer>();
        ArrayList<Integer> unsorted_array1 = new ArrayList<Integer>();
        ArrayList<Integer> unsorted_array2 = new ArrayList<Integer>();
        // add integers
        for (int i = 1; i < 101; i++) {
            unsorted_array0.add(i);
        }
        for (int i = 101; i < 201; i++) {
            unsorted_array1.add(i);
        }
        for (int i = 201; i < 301; i++) {
            unsorted_array2.add(i);
        }
        // shuffle the arraylist
        Collections.shuffle(unsorted_array0);
        Collections.shuffle(unsorted_array1);
        Collections.shuffle(unsorted_array2);

        // call method 
        System.out.println("Array0");
        FindMaxMin(unsorted_array0);

        System.out.println("Array1");
        FindMaxMin(unsorted_array1);

        System.out.println("Array2");
        FindMaxMin(unsorted_array2);


    }
    // create a function to find the max and min
    public static void FindMaxMin(ArrayList<Integer> ls){
        //set max and min to be the first value
        int largest = ls.get(0);
        int smallest = ls.get(0);
        // loop to find max and min
        for (int i = 1; i < 100; i ++) {
            if (ls.get(i) > largest) {
                largest = ls.get(i);  // update the max
            }
            if (ls.get(i) < smallest) {
                smallest = ls.get(i);  // update the min
            }
        }
        // print the max and min
        System.out.println("Largest value is: " + largest);
        System.out.println("Smallest value is: " + smallest);
    }
}
