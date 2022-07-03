import java.util.Scanner;
 
public class InputCalculator {
    // Write your code here

    public static void main(String[] args){

        inputThenPrintSumAndAverage();

    }
    public static void inputThenPrintSumAndAverage(){
        
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0, number = 0;
        
        long avg = 0;
        int counter = 0;
        boolean isAnInt = scanner.hasNextInt();
        while(isAnInt){
            
            number = scanner.nextInt();
            sum += number;
            counter = counter + 1;
            
            isAnInt = scanner.hasNextInt();
        }
        if(counter > 0)
            avg = (long) Math.round((double)sum/(double)counter);   //you can also use Math.ceil()

        System.out.println("SUM = " + sum + " AVG = "+ avg);
        
        scanner.close();
    }
}
