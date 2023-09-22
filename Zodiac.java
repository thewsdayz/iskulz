import java.util.Scanner;

class Zodiac{
    public static void main(String[] args){

        int month, day;

        Scanner get = new Scanner(System.in);

        System.out.print("Month: ");
            month = get.nextInt();

        System.out.print("Day: ");
            day = get.nextInt();

        if (month == 1) System.out.println("Your birthdate is " + "January " + day);
        else if (month == 2) System.out.println("Your birthate is " + "Febuary " + day);
        else if (month == 3) System.out.println("Your birthate is " + "March " + day);
        else if (month == 4) System.out.println("Your birthate is " + "April " + day);
        else if (month == 5) System.out.println("Your birthate is " + "May " + day);
        else if (month == 6) System.out.println("Your birthate is " + "June " + day);
        else if (month == 7) System.out.println("Your birthate is " + "July " + day);
        else if (month == 8) System.out.println("Your birthate is " + "August " + day);
        else if (month == 9) System.out.println("Your birthate is " + "September " + day);
        else if (month == 10) System.out.println("Your birthate is " + "October " + day);
        else if (month == 11) System.out.println("Your birthate is " + "November " + day);
        else if (month == 12) System.out.println("Your birthate is " + "December " + day);

        if ((day>21 && month == 12) || (day<=19 && month== 1)){
            System.out.println("Your zodiac sign is Capricon");
        }
        else if ((day>20 && month ==1) || (day<=18 && month == 2)){
            System.out.println("Your zodiac sign is Aquarius");
        }
        else if ((day>19 && month == 2) || (day <=20 && month == 3)){
            System.out.println("Your zodiac sign is Pisces");
        }
        else if ((day>21 && month == 3) || (day <=20 && month == 4)){
            System.out.println("Your zodiac sign is aries");
        }
        else if ((day>21 && month == 4) || (day <=20 && month == 5)){
            System.out.println("Your zodiac sign is Taurus");
        }
        else if ((day>21 && month == 5) || (day<=20 && month == 6)){
            System.out.println("Your zodiac sign is Gemini");
        }
        else if ((day>21 && month == 6) || (day<=20 && month == 7)){
            System.out.println("Your zodiac sign is Cancer");
        }
        else if ((day>21 && month  == 7) || (day<=20 && month== 8)){
            System.out.println("Your zodiac sign is  Leo");
        }
        else if ((day>21 && month ==8) || (day<=22 && month == 9)){
            System.out.println("Your zodiac sign is Virgo");
        }
        else if ((day>23 && month == 9) || (day<=20 && month ==10)){
            System.out.println("Your zodiac sign is Libra");
        }
        else if ((day>21 && month == 10) || (day<=22 && month == 11)){
            System.out.println("Your zodiac sign is Scorpio");
        }
        else if ((day>23 && month == 11) || (day<=20 && month == 12)){
            System.out.println("Your zodiac sign is Sagitarius");
        }
        get.close();
    }
}