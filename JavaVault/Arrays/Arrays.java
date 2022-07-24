package JavaVault.Arrays;

public class Arrays {
    
    public static void main(String[] args){
        int[] myArray = {106,26,81,5,15};
        sortArray(myArray);
        for(int i=0; i<myArray.length; i++){
            System.out.println(myArray[i]);
        }
    }
    public static void sortArray(int[] arr){

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] > arr[i])
                    swap(arr[j],arr[i]);
            }
        }
    }
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }

}