package JavaVault;

public class FlourPackProblem {
    
    public static void main(String[] args){
        System.out.println(canPack(1,0,5));
    }
    public static boolean canPack(int bigCount,int smallCount,int goal){
        if(bigCount < 0 || smallCount < 0 || goal < 0)
            return false;
        int totBig = bigCount * 5;
        int rem = 0;
            
        int totalFlour = totBig + smallCount;
            
        if(goal <= totalFlour){
            int dividentBig = goal / 5;
            if(dividentBig >= bigCount){
                rem = goal - totBig;
            } else {
                rem = goal - (5 * dividentBig);
            }
            
            if(rem == 0 || rem <= smallCount){
                return true;
            } else {
                return false;
            }
            
        } else {    
            return false;
        }
    }
}
