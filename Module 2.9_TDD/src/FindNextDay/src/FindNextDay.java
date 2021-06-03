import java.util.Scanner;

public class FindNextDay {
    public static boolean checkLeapYear(int year){
        if (year%4==0){
            if (year%100==0){
                if (year%400==0){
                    return true;
                }
            }return true;
        }return false;
    }
    public static int dayInMonth(int month , int year){
        int day;
        if (month<1||month>12){
           day = -1;
        }else {
            switch(month){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    day=31;
                break;
                case 4:
                case 6:
                case 9:
                case 11:
                    day=30;
                    break;
                default:
                    if (checkLeapYear(year)==true){
                        day = 29;
                    }else {
                        day = 28;
                    }
            }
        }return day;
    }
    public static String theNextDay(int ngay , int month, int year){
        int day;
        day = dayInMonth(month,year );
        if (ngay<0|| ngay>day) {
            return "Not found";
        }else if (ngay<day){
            ngay++;
        }else if (month!=12){
            ngay=1;
            month++;
        }else {
            ngay=1;
            month=1;
            year++;
        }return ngay+"/"+month+"/"+year;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day:");
        int day = sc.nextInt();
        System.out.println("Enter month: ");
        int month = sc.nextInt();
        System.out.println("Enter year: ");
        int year =  sc.nextInt();
        System.out.println("The Next Day is: "+theNextDay(day,month,year));
    }

}
