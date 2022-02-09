public class SharedDigit {
    // write your code here
    
    public static boolean hasSharedDigit(int x, int y)
    {
        if((x < 10 || x > 99) || (y < 10 || y > 99))
        {
            return false;
        }
        
        while(x > 0){
            int digitX = x % 10;
            x /= 10;
            while(y > 0){
                int digitY = y % 10;
                y /= 10;
                if(digitX == digitY ||  y == x){
                    return true;
                }
            }
        }
        return false;
    }
}
