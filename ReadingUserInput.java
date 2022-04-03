import java.util.Scanner;

public class ReadingUserInput {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        System.out.println("Enter number #"+counter);
        boolean hasNextInt = scanner.hasNextInt();
        while(hasNextInt){
            int number = scanner.nextInt();
            //scanner.nextInt();
            counter++;
            System.out.println("Enter number #"+counter);
        }
        System.out.println("Invalid number #");

    }
}
