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
                sum += number % 10;
                number = number / 10;
            }
            sum += number;
            return sum;
        }
    }
}