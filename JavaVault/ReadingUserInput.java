package JavaVault;

import java.util.Scanner;

public class ReadingUserInput {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;
        
        while(true){
            int order = counter + 1;
            System.out.println("Enter number #"+ order + ":");
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt){
                int number = scanner.nextInt();
                counter++;
                sum += number;
                if(counter == 10)       //can use the while loop to terminate 
                    break;
            }else{
                System.out.println("Invalid number");
            }

            scanner.nextLine(); //to handle end of line (enter key)
        }
        System.out.println("Sum = " + sum);
        scanner.close();

    }
}
