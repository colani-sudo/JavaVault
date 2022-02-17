public class NumberToWords {
    // write your code here

    public static void main(String[] args)
    {
        numberToWords(1200);
        //System.out.println(getDigitCount(2300));
    }
    
    public static void numberToWords(int number){
        
        if(number < 0)
            System.out.println("Invalid Value");

        int counter = getDigitCount(number);
        int revNumber = reverse(number);
        int zerosCounter = counter - getDigitCount(revNumber);

        while( revNumber > 0){
            int digit = revNumber % 10;
            revNumber = revNumber / 10;
            if(digit == 0){
                System.out.println("Zero");
            }
            if(digit == 1){
                System.out.println("One");
            }
            if(digit == 2){
                System.out.println("Two");
            }
            if(digit == 3){
                System.out.println("Three");
            }
            if(digit == 4){
                System.out.println("Four");
            }
            if(digit == 5){
                System.out.println("Five");
            }
            if(digit == 6){
                System.out.println("Six");
            }
            if(digit == 7){
                System.out.println("Seven");
            }
            if(digit == 8){
                System.out.println("Eight");
            }
            if(digit == 9){
                System.out.println("Nine");
            }
            
        }
        for(int i=0; i < zerosCounter; i++)
            System.out.println("Zero");
        
    }
    public static int reverse(int number){
        
        int rev = 0, remainder;
        while(number > 0){
            remainder = number % 10;
            rev = rev * 10 + remainder;
            number /= 10;
        }
        return rev;
    }
    public static int getDigitCount(int num){
        if(num < 0)
            return -1;

        int counter = 0;
        while(num > 0){
            num = num / 10;
            ++counter;
        }
        return counter;
    }
}
