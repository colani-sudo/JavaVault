public class EvenDigitSum {
    // write your code here
    public static int getEvenDigitSum(int number){
        int sum = 0;
        if(number < 0)
        {
            return -1;
        }
        else
        {
            int remainder;
            while(number > 0)
            {
                remainder = number % 10;
                if((remainder % 2) == 0)
                {
                    sum += remainder;
                }
                number /= 10;
            }
            return sum;
        }
    }
}
