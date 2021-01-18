public class stringexer {
    public static void main(String[] args){
        String name = "zadam";

        int size = name.length();
        System.out.println(size);

        // int indexm = name.indexOf("m");
        // System.out.println(indexm);

        // int geti = name.lastIndexOf("m");
        // System.out.println(geti);

        char getc = name.charAt(name.length() - 1);
        System.out.println(getc);
    }
}
