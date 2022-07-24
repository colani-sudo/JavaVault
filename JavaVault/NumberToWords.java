package JavaVault;

public class NumberToWords {
    // write your code here

    public static void main(String[] args)
    {
        numberToWords(230);
    }
    
    public static void numberToWords(int number){
        
        String digit[] = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        
        if(number < 0)
            System.out.println("Invalid Value");
        
        int counter = getDigitCount(number);
        number = reverse(number);
        while(number > 0){
            int rem = number % 10;
            number /= 10;
            System.out.println(digit[rem]);
            counter--;
        }
        for(int i=0; i < counter;  i++)
        System.out.println(digit[0]);

    }
    public static int reverse(int number){
        int rev = 0, rem;
        while(number != 0){
            rem = number % 10;
            rev = rev * 10 + rem;
            number /= 10;
        }
        return rev;
    }
    
    public static int getDigitCount(int number){
        if(number < 0) return 0;
        int counter = 0;
        while(number >=0){
            number /= 10; 
            counter ++;
            if(number == 0) break;
        }
        return counter;
    }
    
}
