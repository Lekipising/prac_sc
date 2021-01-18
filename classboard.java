public class classboard {
    static boolean checkpalindrome(String word){
        int size = word.length();

        int search = (size - 1) / 2;

        int m = 0;
        int n = size - 1;


        if (size %2 == 0){
            return false;
        }
        else{
            while (search > 0){
                char x = word.charAt(m);
                char y = word.charAt(n);

                if (x == y){
                    search --;
                    if (search == 0){
                        return true;
                    }
                }
                else{
                    return false;
                }
                

            }



        }
    }
    public static void main(String[] args){
        System.out.println(checkpalindrome("liplan"));
    }
}
