package JavaVault;

public class LargestPrime {

    public static void main(String[] args){
        System.out.println(getLargestPrime(21));
    }
    
    public static int getLargestPrime(int number){
        
        if(number <= 1){
            return -1;
        }
        
        int largest = 0;
        for(int i=1; i <= number; i++){
            if(number%i == 0){
                int counter=0;
                for(int j=1; j < i; j++){
                    if(i%j == 0)
                        counter++;
                }
                if(counter == 1)
                    largest = i;
            }
        }
        return largest;
    }
}
