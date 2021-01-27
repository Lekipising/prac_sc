public class whiteboard3a {
    public static void main(String[] args){
        StringBuilder rmchar = new StringBuilder("Hello");
        rmchar.deleteCharAt(1);
        
        String resultStr = rmchar.toString();
        System.out.println(resultStr);
    }
}
