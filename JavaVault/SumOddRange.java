package JavaVault;

public class SumOddRange {
 
    public static boolean isOdd(int number){
        
        if(number > 0){
            if(number % 2 == 0){
                return false;
            }
            return true;
        }
        return false;
        
    }
    public static int sumOdd(int start, int end){
        
        int sum = 0, i;
        if((start < 1 || end < 1) || (end < start)){
            return -1;
        }
            
        for(i=start; i <= end; i++){
            if(isOdd(i))
                sum+=i;
        }
        return sum;
    }
}