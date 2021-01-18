import java.util.Scanner;

public class methods1 {
    static void greet(){
        System.out.println("Hi, welcome!");

        Scanner getname = new Scanner(System.in);

        System.out.println("Please enter your name: ");

        String name = getname.nextLine();

        System.out.println("Hi " + name + ". Thanks for running this code!");

        getname.close();

    }

    public static void main(String[] args){
        greet();
    }
}
