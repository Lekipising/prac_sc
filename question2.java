// Author: Liplan Lekipising

// Imports
import java.util.Scanner;

public class question2{
    public static void main(String[] args){
        //create a scanner object for input
        Scanner getnum = new Scanner(System.in);

        //Ask user for the integer to reverse
        System.out.print("Enter the integer to reverse: ");
        int number = getnum.nextInt();

        // variable to hold the reversed integer
        int rev = 0;

        //loop to reverse the integer
        while (number != 0){
            // get the number modulus 10
            int num = number % 10;
            // update reverse by adding ones, tens, hundreds, and so on
            rev = (rev * 10) + num;
            // divide by 10
            number /= 10;

        }

        System.out.println("The number is: " + rev);

        getnum.close();
    }
}