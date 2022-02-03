public class DecimalComparator {
    
    public static void main(String[] args)
    {

    }
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        int x = (int)(num1 * 1000);
        int y = (int)(num2 * 1000);

        return (x == y) ? true : false;

    }
}
