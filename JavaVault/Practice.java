package JavaVault;

public class Practice {
    
    
    public static void main(String[] args){
        System.out.println(getLargestPrime(21));
    }
        public static int getLargestPrime(int number){
            
            if(number < 0) return -1;
            
            int largest = 0;
            for(int i=2; i<=number; i++){

                if(number == 2) largest = number;

                if((number % i) == 0){  //first filter factors of the number
                    
                    for(int j=2; j < i; j++){ //loop through factor of number
                        
                        if(i % j == 0){ //check if factor is not a prime number
                            return -1;
                        }else{
                            //if(i==number) break;
                            largest = i;
                        }
                    }
                }
            }
            return largest;
        }

}
