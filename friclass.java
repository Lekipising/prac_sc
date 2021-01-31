//import java.util.ArrayList;
import java.util.HashMap;

public class friclass {
    public static void main(String[] args){

        // ArrayList<String> names = new ArrayList<String>();

        // names.add("Cedric");
        // names.add("Linda");
        // names.add("Irene");
        // names.add("Liplan");

        // System.out.println(names.get(1));

        // names.set(3, "Lekipising");
        // System.out.println(names.get(3));

        HashMap<String, Integer> contacts = new HashMap<String, Integer>();

        contacts.put("Linda", 780542666);
        contacts.put("Cedric", 788123546);
        contacts.put("Irene", 789556342);
        contacts.put("Liplan", 785432897);

        System.out.println(contacts.get("Irene"));
        System.out.println(contacts.get("irene"));



    }
}