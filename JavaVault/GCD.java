package JavaVault;

public class GCD{
    // write your code here

    public static void main(String[] args){
        System.out.println(getGreatestCommonDivisor(20, 15));
    }
    public static int getGreatestCommonDivisor(int x, int y){
    
        if(x < 10 || y < 10)
            return -1;
        int gcd = 0;
        for(int i = 1; i <= x && i <= y; i++){
            if(x%i == 0 && y%i == 0){
                gcd = i;
            }
        }
    
    return gcd;
    }
}
