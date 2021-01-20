// Author: Liplan Lekipising

// imports
import java.util.Random;
import java.util.Scanner;

public class question3 {
    public static void main(String[] args){
        // Welcome the player and give instructions
        System.out.println("Welcome to the game!\nYou will be prompted to guess a number between 0 and 10.");

        // create random object
        Random random = new Random();

        // create scanner object
        Scanner getans = new Scanner(System.in);

        // initiliaze counter of attempts to 0
        int attempt = 0;

        // generate a random integer between 0 (inclusive) to 11 (exclusive)
        int num = random.nextInt(11);

        // loop to ask user to guess until they get the num correct
        while (true){
            System.out.println();
            System.out.print("Guess a number: ");  //ask user for their guess

            int guess = getans.nextInt();  //capture their guess
            
            // check if their guessed correctly
            if (guess == num){
                attempt ++;
                System.out.println();
                System.out.println("Correct! Good job. \nYou guessed the answer in: " + attempt + " attempts");
                break;
            }
            // check if their guess is higher the random number
            else if(guess > num){
                System.out.println();
                System.out.println("Too high, try again.");
                attempt ++;
            }
            // check if their guess is lower than the random number
            else if(guess < num){
                System.out.println();
                System.out.println("Too low, try again.");
                attempt ++;

            }

        }
        getans.close();
        System.out.println();
    }




}
