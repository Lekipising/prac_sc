
// Author: Serge Tassiga
import java.util.*;
import java.util.concurrent.TimeUnit;

public class TrafficLights {
    public static void main(String[] args) {
        // System.out.println("Welcome! this program will be talking about the traffic lights management system. ");
        // Creating Random rand
        // Random rand = new Random();
        ArrayList<Integer> car_collection = new ArrayList<Integer>();

        // for this first red lights it will be 20 cars which will be under the light
        // System.out.println("First Red light is operating!");
        // System.out.println("20 cars are under the red light. waiting..... for 20 seconds");

        // adding 20 cars randmoly
        // int newcars;
        int counter_a = 0;
        while (counter_a < 20) {
            /*
             * If you want to use a counter (i) in a while loop, you have to create it
             * first, outside the loop and set it to 0` eg int i = 0; But you have to change
             * the variable name in the other while loops This will add 20 cars but the
             * random may get same number twice so you will have cars with same number.
             * Check if car is already added before adding do i++ after you add to
             * collection, not before(adds from 0 to 19). When adding cars, use .add(i) NOT
             * .add(20) - this adds integer 20
             */
            // System.out.println(rand.nextInt(20));
            // int car_a = rand.nextInt(20);
            car_collection.add(counter_a);
            counter_a ++;
        }
        Collections.shuffle(car_collection);

        // long startTime0 = System.currentTimeMillis();

        // while ( i < car_collection.size()) {
        // TimeUnit.SECONDS.sleep(1);
        // i++;
        // }

        System.out.println("RED");
        for (int i = 0; i < 20; i++) {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // System.out.println("The cars were succesffully added!");

        // This is for the first green light it will be 30 cars will be under the light
        // for 30 secs
        // System.out.println("In this first green light");
        // System.out.println("There are 20 cars in the collection. new 30 cars are coming...");
        // adding 10 cars randomly
        // int newcars;
        int counter_b = 20;
        while (counter_b < 40) {
            /*
             * If you want to use a counter (i) in a while loop, you have to create it
             * first, outside the loop and set it to 0` eg int i = 0; But you have to change
             * the variable name in the other while loops This will add 20 cars but the
             * random may get same number twice so you will have cars with same number.
             * Check if car is already added before adding do i++ after you add to
             * collection, not before(adds from 0 to 19). When adding cars, use .add(i) NOT
             * .add(20) - this adds integer 20
             */
            // System.out.println(rand.nextInt(20));
            // int car_a = rand.nextInt(20);
            car_collection.add(counter_b);
            counter_b ++;
        }
        Collections.shuffle(car_collection);

        // while (i< car_collection.size()) {
        // TimeUnit.SECONDS.sleep(1);
        // i++;
        // }

        System.out.println("YELLOW");
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println(car_collection.get(0) + " moved");
                car_collection.remove(0);
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // System.out.println("30 Cars were added!");

        // this first yellow light it will be added 5 cars

        // System.out.println("In this first yellow");
        // System.out.println("it will add 5 cars. 25 cars are coming....");

        // adding 5 cars randomly
        // int newcars;
        int counter_c = 40;
        while (counter_c < 60) {
            /*
             * If you want to use a counter (i) in a while loop, you have to create it
             * first, outside the loop and set it to 0` eg int i = 0; But you have to change
             * the variable name in the other while loops This will add 20 cars but the
             * random may get same number twice so you will have cars with same number.
             * Check if car is already added before adding do i++ after you add to
             * collection, not before(adds from 0 to 19). When adding cars, use .add(i) NOT
             * .add(20) - this adds integer 20
             */
            // System.out.println(rand.nextInt(20));
            // int car_a = rand.nextInt(20);
            car_collection.add(counter_c);
            counter_c ++;
        }
        Collections.shuffle(car_collection);

        // while (i< car_collection.size()) {
        // TimeUnit.SECONDS.sleep(2);
        // i++;
        // }

        System.out.println("GREEN");
        for (int i = 0; i < 30; i++) {
            try {
                System.out.println(car_collection.get(0) + " moved");
                car_collection.remove(0);
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // System.out.println("35 Cars were added!");
        // // the second red
        // System.out.println("Second RED Light");
        // System.out.println("25 cars are under the red light.");
        // adding 20 cars randmoly
        // int newcars;
        int counter_d = 60;
        while (counter_d < 80) {
            /*
             * If you want to use a counter (i) in a while loop, you have to create it
             * first, outside the loop and set it to 0` eg int i = 0; But you have to change
             * the variable name in the other while loops This will add 20 cars but the
             * random may get same number twice so you will have cars with same number.
             * Check if car is already added before adding do i++ after you add to
             * collection, not before(adds from 0 to 19). When adding cars, use .add(i) NOT
             * .add(20) - this adds integer 20
             */
            // System.out.println(rand.nextInt(20));
            // int car_a = rand.nextInt(20);
            car_collection.add(counter_d);
            counter_d ++;
        }
        Collections.shuffle(car_collection);

        // long startTime1 = System.currentTimeMillis();

        // while (i< car_collection.size()) {
        // TimeUnit.SECONDS.sleep(1);
        // i++;
        // }

        System.out.println("RED");
        for (int i = 0; i < 20; i++) {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // System.out.println("The cars were succesffully added!");
        // // Second light
        // System.out.println("In this second green light");
        // System.out.println("There are 20 cars in the collection. new 25 cars are coming...");
        // adding 10 cars randomly
        // int newcars;
        int counter_e = 80;
        while (counter_e < 100) {
            /*
             * If you want to use a counter (i) in a while loop, you have to create it
             * first, outside the loop and set it to 0` eg int i = 0; But you have to change
             * the variable name in the other while loops This will add 20 cars but the
             * random may get same number twice so you will have cars with same number.
             * Check if car is already added before adding do i++ after you add to
             * collection, not before(adds from 0 to 19). When adding cars, use .add(i) NOT
             * .add(20) - this adds integer 20
             */
            // System.out.println(rand.nextInt(20));
            // int car_a = rand.nextInt(20);
            car_collection.add(counter_e);
            counter_e ++;
        }
        Collections.shuffle(car_collection);

        // while (i< car_collection.size()) {
        // TimeUnit.SECONDS.sleep(1);
        // i++;
        // }

        System.out.println("YELLOW");
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println(car_collection.get(0) + " moved");
                car_collection.remove(0);
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // System.out.println("News 65 Cars were added!");
        // // this second yellow light it will be added 5 cars
        // System.out.println("In this second yellow light");
        // System.out.println("it will add 5 cars. 30 cars are coming....");
        // adding 5 cars randomly
        // int newcars;

        // while (i< car_collection.size()) {
        // TimeUnit.SECONDS.sleep(2);
        // i++;
        // }

        System.out.println("GREEN");
        for (int i = 0; i < 30; i++) {
            try {
                System.out.println(car_collection.get(0) + " moved");
                car_collection.remove(0);
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // System.out.println(" 70 Cars were added!");

        // // third red lights

        // System.out.println("Third red light");
        // System.out.println("30 cars are under the red light. waiting..... for 20 seconds");

        // adding 20 cars randmoly

        // int newcars;

        // long startTime2 = System.currentTimeMillis();

        // while (i< car_collection.size()) {
        // TimeUnit.SECONDS.sleep(1);
        // i++;
        // }

        System.out.println("RED");
        for (int i = 0; i < 20; i++) {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // System.out.println("The cars were succesffully added!");

        // // Third green light

        // System.out.println("In this third green light");
        // System.out.println("There are 20 cars in the collection. new 10 cars are following...");

        // adding 10 cars randomly

        // int newcars;

        // while (i< car_collection.size()) {
        // TimeUnit.SECONDS.sleep(1);
        // i++;
        // }

        System.out.println("YELLOW");
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println(car_collection.get(0) + " moved");
                car_collection.remove(0);
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("All Cars have successfully moved out of the collection/queue!");
        System.out.println("The program is stopped!!!");

        /*
        The variable name "newcars" is duplicated all over the program - change the name every time

        */


    }
    
}
