import java.util.Scanner;

public class MinMaxInputChallenge {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //int big = -2147483648;      //can set the max number to the lowest it can hold
        //int small = 2147483647;     //can set the min number to the highest it can hold
        //boolean first = true;
        int big = Integer.MIN_VALUE;        //Can also use min and max constants
        int small = Integer.MAX_VALUE;
        
        while(true){
            
            System.out.println("Enter number:");
            boolean isAnInt = scanner.hasNextInt();
            
            if(isAnInt){
                int number = scanner.nextInt();
               /* if(first){
                    first = false;
                    small = number;
                    big = number;
                }*/
                if(number < small)
                    small = number;
                if(number > big){
                    big = number;
                }
                
            }else{
                break;
            }

            scanner.nextLine(); //to handle end of line (enter key)
        }
        System.out.println("min = " + small);
        System.out.println("big = " + big);
        scanner.close();

    }
}
