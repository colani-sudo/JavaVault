import java.util.Scanner;
 
public class InputCalculator {
    // Write your code here

    public static void main(String[] args){

        inputThenPrintSumAndAverage();

    }
    public static void inputThenPrintSumAndAverage(){
        
        Scanner scanner = new Scanner(System.in);
        
        long sum = 0;
        int counter = 0;
        while(true){
            System.out.println("enter a number: ");
            boolean isAnInt = scanner.hasNextInt();
             
            if(isAnInt){
                int number = scanner.nextInt();
                sum += (long)number;
                counter++;
            }else{
                
                break;
            }
        }
        long avg = sum/counter;
        System.out.println("SUM = " + sum + " AVG = "+ avg);
        scanner.close();
    }
}
