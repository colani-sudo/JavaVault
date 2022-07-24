package JavaVault;

public class DigitSum{

    public static void main(String[] args){

        System.out.println(sumDigits(125));
    }
    public static int sumDigits(int number){
        int sum = 0;
        if(number < 10) {
            return -1;
        }
        else{
            while(number >= 10){
                sum += number % 10; //extract the least significant digit and add it to sum
                number = number / 10;   //discard the least significant digit
            }
            sum += number;      //add the last significant digit
            return sum;
        }
    }
}