package JavaVault;

public class NumberPalindrome {
 
    public static boolean isPalindrome(int number){
        
        int reverse = 0, remainder, digit;
        number = Math.abs(number);
        digit = number;
        while(number > 0){
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number /= 10;
        }
       if(digit == reverse) {
           return true;
       }else{
           return false;
       }
    }
   }
