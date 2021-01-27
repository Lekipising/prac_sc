public class whiteboard3{
    static String getChar(String word, Integer ch){
        StringBuilder rmchar = new StringBuilder(word);
        rmchar.deleteCharAt(ch);
        String resultStr = rmchar.toString();
        return resultStr;
    }

    public static void main(String[] args){
        System.out.println(getChar("Classroom", 4));
    }
}
