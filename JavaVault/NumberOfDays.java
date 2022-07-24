package JavaVault;

public class NumberOfDays {

    public static void main(String[] args){

    }
    public static boolean isLeapYear(int year)
    {
        if(year < 1 || year > 9999){
            return false;
        }
        if(year % 4 == 0)
        {
            if(year % 100 == 0){
                if(year % 400 == 0)
                {
                    return true;
                }
                    return false;
            }else{
                return true;
            }
        }
        return false;
    }
    public static int getDaysInMonth(int month, int year){
        int days = 0;
        if(month < 1 || month > 12){
            return -1;
        }else if(year < 1 || year > 9999){
            return -1;
        }else{
            switch(month){
                case 1:
                case 3: 
                case 5: 
                case 7: 
                case 8: case 10: 
                case 12: 
                    days = 31;
                    break;
                case 2: 
                    if(isLeapYear(year)){
                        days = 29;
                    }
                    else{
                        days = 28;
                    }
                    break;
             
                case 4: case 6: case 9: case 11: 
                    days = 30;
                break;
            }
            return days;
        }
    }
}
