import java.util.Scanner;


public class addtwo{
    public static void main(String[] args){
        Scanner getinput = new Scanner(System.in);
        System.out.println("Enter the first number below: ");
        Double num1 = getinput.nextDouble();
        
        System.out.println("Enter the second number below: ");
        Double num2 = getinput.nextDouble();

        Double result = num1 + num2;
        System.out.println("Result: " + result);

        if (result > 100 && result < 200){
            System.out.println("The result is greater than 100");
        }
        else if (result > 200){
            System.out.println("The result is greater than 200");
        }
        else{
            System.out.println("The result is less than 100");
        }
        getinput.close();
    }
}