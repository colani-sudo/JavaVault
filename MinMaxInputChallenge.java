import java.util.Scanner;

public class MinMaxInputChallenge {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int big = 0, small = 0;
        
        while(true){
            
            System.out.println("Enter number:");
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt){
                int number = scanner.nextInt();
                if(number < small)
                    small = number;
                else if(number > big){
                    big = number;
                }else{
                    continue;
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
