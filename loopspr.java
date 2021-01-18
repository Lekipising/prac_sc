import java.util.ArrayList;

public class loopspr {
    public static void main(String[] args){
        int count = 10;
        while (true) {
            System.out.println("Hi, just running!");
            count = count - 1;
            if (count == 0){
                break;
            }
        }
    
        ArrayList<String> cars = new ArrayList<String>();

        cars.add("Subaru");
        cars.add("Pajero");
        cars.add("Benz");

        for (int i = 0; i < cars.size(); i++){
            System.out.println(cars.get(i));
        }
    }
}
