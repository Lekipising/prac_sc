public class classboard {
    static void checkpalindrome(String word){
        int size = word.length();  // get the size of the string

        int search = (size - 1) / 2;  // Number of times to search/compare

        int m = 0;  // Index of same char to the left of middle char
        int n = size - 1;  // Index of same char to the right of middle char

        while (search > 0){
            char x = word.charAt(m);  // get the left char
            char y = word.charAt(n);  // get the right char

            if (x == y){  // check if they are same
                search --;
                if (search == 0){   // continue searching if number of searches are not 0
                    System.out.println("A palindrome"); 
                }
            }
            else{  // 
                System.out.println("Not a palindrome");
                break;
            }

            m ++;
            n --;

            // if (m == n){
                
            // }

        }

    }
    public static void main(String[] args){
        checkpalindrome("12821");
    }
}


// Not considered yet (inputs):
// - One character
// - Wrong input -- integers, etc