import java.util.Scanner;

public class question1{
    public static void main(String[] args){
        System.out.println();
        System.out.println("Welcome to the game!");
        System.out.println();
        System.out.println("You will be asked 10 questions and provided with 2 choices. Each question is worth 1 point. Answer within 2 seconds, and earn 0.5 more. Enjoy");

        Scanner getans = new Scanner(System.in);

        double score = 0;

        while (true){
            
            String q1 = "What is the age of the age: ";
            String q1c1 = "1. 4.5 Billion years";
            String q1c2 = "2. 10,000 years";

            //ask
            System.out.println();
            System.out.println(q1);
            //provide choices
            System.out.println();
            System.out.println(q1c1 + "\n" + q1c2);
            //get answer
            System.out.println();
            System.out.print("Your answer: ");
            long startTime = System.nanoTime();
            int ans1 = getans.nextInt();
            long endTime = System.nanoTime();
            long duration = (endTime - startTime);
            long mil_dur = duration / 1000000;
            //check answer and update score
            if (ans1 == 1){
                if (mil_dur < 2001){
                    System.out.println("Correct!");
                    score ++;
                    score = score + 0.5;
                }
                else{
                    System.out.println("Correct!");
                    score ++;
                }
            }

            else{
                System.out.println("Wrong!");
            }

            String q2 = "What is the age of the age: ";
            String q2c1 = "1. 4.5 Billion years";
            String q2c2 = "2. 10,000 years";

            //ask
            System.out.println();
            System.out.println(q2);
            //provide choices
            System.out.println();
            System.out.println(q2c1 + "\n" + q2c2);
            //get answer
            System.out.println();
            System.out.print("Your answer: ");
            long q2startTime = System.nanoTime();
            int ans2 = getans.nextInt();
            long q2endTime = System.nanoTime();
            long q2duration = (q2endTime - q2startTime); 
            long q2mil_dur = q2duration / 1000000;
            //check answer and update score
            if (ans2 == 1){
                if (q2mil_dur < 2001){
                    System.out.println("Correct!");
                    score ++;
                    score = score + 0.5;
                }
                else{
                    System.out.println("Correct!");
                    score ++;
                }
            }

            else{
                System.out.println("Wrong!");
            }

            String q3 = "What is the age of the age: ";
            String q3c1 = "1. 4.5 Billion years";
            String q3c2 = "2. 10,000 years";

            //ask
            System.out.println();
            System.out.println(q3);
            //provide choices
            System.out.println();
            System.out.println(q3c1 + "\n" + q3c2);
            //get answer
            System.out.println();
            System.out.print("Your answer: ");
            long q3startTime = System.nanoTime();
            int ans3 = getans.nextInt();
            long q3endTime = System.nanoTime();
            long q3duration = (q3endTime - q3startTime);
            long q3mil_dur = q3duration / 1000000;
            //check answer and update score
            if (ans3 == 1){
                if (q3mil_dur < 2001){
                    System.out.println("Correct!");
                    score ++;
                    score = score + 0.5;
                }
                else{
                    System.out.println("Correct!");
                    score ++;
                }
            }

            else{
                System.out.println("Wrong!");
            }

            String q4 = "What is the age of the age: ";
            String q4c1 = "1. 4.5 Billion years";
            String q4c2 = "2. 10,000 years";

            //ask
            System.out.println();
            System.out.println(q4);
            //provide choices
            System.out.println();
            System.out.println(q4c1 + "\n" + q4c2);
            //get answer
            System.out.println();
            System.out.print("Your answer: ");
            long q4startTime = System.nanoTime();
            int ans4 = getans.nextInt();
            long q4endTime = System.nanoTime();
            long q4duration = (q4endTime - q4startTime); 
            long q4mil_dur = q4duration / 1000000;
            //check answer and update score
            if (ans4 == 1){
                if (q4mil_dur < 2001){
                    System.out.println("Correct!");
                    score ++;
                    score = score + 0.5;
                }
                else{
                    System.out.println("Correct!");
                    score ++;
                }
            }

            else{
                System.out.println("Wrong!");
            }

            String q5 = "What is the age of the age: ";
            String q5c1 = "1. 4.5 Billion years";
            String q5c2 = "2. 10,000 years";

            //ask
            System.out.println();
            System.out.println(q5);
            //provide choices
            System.out.println();
            System.out.println(q5c1 + "\n" + q5c2);
            //get answer
            System.out.println();
            System.out.print("Your answer: ");
            long q5startTime = System.nanoTime();
            int ans5 = getans.nextInt();
            long q5endTime = System.nanoTime();
            long q5duration = (q5endTime - q5startTime);
            long q5mil_dur = q5duration / 1000000;
            //check answer and update score
            if (ans5 == 1){
                if (q5mil_dur < 2001){
                    System.out.println("Correct!");
                    score ++;
                    score = score + 0.5;
                }
                else{
                    System.out.println("Correct!");
                    score ++;
                }
            }

            else{
                System.out.println("Wrong!");
            }

            String q6 = "What is the age of the age: ";
            String q6c1 = "1. 4.5 Billion years";
            String q6c2 = "2. 10,000 years";

            //ask
            System.out.println();
            System.out.println(q6);
            //provide choices
            System.out.println();
            System.out.println(q6c1 + "\n" + q6c2);
            //get answer
            System.out.println();
            System.out.print("Your answer: ");
            long q6startTime = System.nanoTime();
            int ans6 = getans.nextInt();
            long q6endTime = System.nanoTime();
            long q6duration = (q6endTime - q6startTime);
            long q6mil_dur = q6duration / 1000000;
            //check answer and update score
            if (ans6 == 1){
                if (q6mil_dur < 2001){
                    System.out.println("Correct!");
                    score ++;
                    score = score + 0.5;
                }
                else{
                    System.out.println("Correct!");
                    score ++;
                }
            }

            else{
                System.out.println("Wrong!");
            }

            String q7 = "What is the age of the age: ";
            String q7c1 = "1. 4.5 Billion years";
            String q7c2 = "2. 10,000 years";

            //ask
            System.out.println();
            System.out.println(q7);
            //provide choices
            System.out.println();
            System.out.println(q7c1 + "\n" + q7c2);
            //get answer
            System.out.println();
            System.out.print("Your answer: ");
            long q7startTime = System.nanoTime();
            int ans7 = getans.nextInt();
            long q7endTime = System.nanoTime();
            long q7duration = (q7endTime - q7startTime);
            long q7mil_dur = q7duration / 1000000;
            //check answer and update score
            if (ans7 == 1){
                if (q7mil_dur < 2001){
                    System.out.println("Correct!");
                    score ++;
                    score = score + 0.5;
                }
                else{
                    System.out.println("Correct!");
                    score ++;
                }
            }

            else{
                System.out.println("Wrong!");
            }

            String q8 = "What is the age of the age: ";
            String q8c1 = "1. 4.5 Billion years";
            String q8c2 = "2. 10,000 years";

            //ask
            System.out.println();
            System.out.println(q8);
            //provide choices
            System.out.println();
            System.out.println(q8c1 + "\n" + q8c2);
            //get answer
            System.out.println();
            System.out.print("Your answer: ");
            long q8startTime = System.nanoTime();
            int ans8 = getans.nextInt();
            long q8endTime = System.nanoTime();
            long q8duration = (q8endTime - q8startTime);
            long q8mil_dur = q8duration / 1000000;
            //check answer and update score
            if (ans8 == 1){
                if (q8mil_dur < 2001){
                    System.out.println("Correct!");
                    score ++;
                    score = score + 0.5;
                }
                else{
                    System.out.println("Correct!");
                    score ++;
                }
            }

            else{
                System.out.println("Wrong!");
            }

            String q9 = "What is the age of the age: ";
            String q9c1 = "1. 4.5 Billion years";
            String q9c2 = "2. 10,000 years";

            //ask
            System.out.println();
            System.out.println(q9);
            //provide choices
            System.out.println();
            System.out.println(q9c1 + "\n" + q9c2);
            //get answer
            System.out.println();
            System.out.print("Your answer: ");
            long q9startTime = System.nanoTime();
            int ans9 = getans.nextInt();
            long q9endTime = System.nanoTime();
            long q9duration = (q9endTime - q9startTime);
            long q9mil_dur = q9duration / 1000000;
            //check answer and update score
            if (ans9 == 1){
                if (q9mil_dur < 2001){
                    System.out.println("Correct!");
                    score ++;
                    score = score + 0.5;
                }
                else{
                    System.out.println("Correct!");
                    score ++;
                }
            }

            else{
                System.out.println("Wrong!");
            }

            String q10 = "What is the age of the age: ";
            String q10c1 = "1. 4.5 Billion years";
            String q10c2 = "2. 10,000 years";

            //ask
            System.out.println();
            System.out.println(q10);
            //provide choices
            System.out.println();
            System.out.println(q10c1 + "\n" + q10c2);
            //get answer
            System.out.println();
            System.out.print("Your answer: ");
            long q10startTime = System.nanoTime();
            int ans10 = getans.nextInt();
            long q10endTime = System.nanoTime();
            long q10duration = (q10endTime - q10startTime);
            long q10mil_dur = q10duration / 1000000;
            //check answer and update score
            if (ans10 == 1){
                if (q10mil_dur < 2001){
                    System.out.println("Correct!");
                    score ++;
                    score = score + 0.5;
                }
                else{
                    System.out.println("Correct!");
                    score ++;
                }
            }

            else{
                System.out.println("Wrong!");
            }

            
            System.out.println();
            System.out.println("Your score is: " + score + "/15");
            
            System.out.println();
            System.out.print("Would you like to play again: 1 -> continue, 2 -> stop: ");
            int cont = getans.nextInt();
            if (cont == 1){
                score = 0;
                continue;
            }
            else{
                System.out.println();
                System.out.println("Thank you for playing!");
                getans.close();
                break;
            }
    
        }


    }
}