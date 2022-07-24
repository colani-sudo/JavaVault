package JavaVault.JavaArrays;
import java.util.Scanner;

public class SortArray 
{
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        int[] myArray = getIntegers(5);
        int[] sorted = sortIntegers(myArray);
        printArray(sorted);

    }
    public static int[] getIntegers(int s){
        System.out.println("Enter " + s + "numbers here");
        int[] values = new int[s];
        
        for(int i=0; i < s; i++){
            values[i] = scanner.nextInt();
        }

        return values;
    }
    
    public static void printArray(int arr[])
    {
        int i;
        for (i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }

    public static int[] sortIntegers(int[] arr){
        int[] sortedArray = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            sortedArray[i] = arr[i];
        }
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for(int i=0; i<sortedArray.length-1; i++){
                if(sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
