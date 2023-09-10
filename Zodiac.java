import java.util.Scanner;

class Zodiac{
    public static void main(String[] args){

        int month, day;

        Scanner get = new Scanner(System.in);

        System.out.print("What is your birth month? ");
            month = get.nextInt();

        System.out.print("What is your birth day? ");
            day = get.nextInt();

        System.out.println("Your birthdate is " + month + day);

        if ((day>21 && month == 12) || (day<=19 && month== 1)){
            System.out.println("your zodiac is Capricon");
        }
        if ((day>20 && month ==1) || (day<=18 && month == 2)){
            System.out.println("your zodiac is Aquarius");
        }
        if ((day>19 && month == 2) || (day <=20 && month == 3)){
            System.out.println("your zodiac is Pisces");
        }
        if ((day>21 && month == 3) || (day <=20 && month == 4)){
            System.out.println("your zodiac is aries");
        }
        if ((day>21 && month == 4) || (day <=20 && month == 5)){
            System.out.println("your zodiac is Taurus");
        }
        if ((day>21 && month == 5) || (day<=20 && month == 6)){
            System.out.println("your zodiac is Gemini");
        }
        if ((day>21 && month == 6) || (day<=20 && month == 7)){
            System.out.println("your zodiac is Cancer");
        }
        if ((day>21 && month  == 7) || (day<=20 && month== 8)){
            System.out.println("your zodiac is  Leo");
        }
        if ((day>21 && month ==8) || (day<=22 && month == 9)){
            System.out.println("your zodiac is Virgo");
        }
        if ((day>23 && month == 9) || (day<=20 && month ==10)){
            System.out.println("your zodiac is Libra");
        }
        if ((day>21 && month == 10) || (day<=22 && month == 11)){
            System.out.println("your zodiac is Scorpio");
        }
        if ((day>23 && month == 11) || (day<=20 && month == 12)){
            System.out.println("your zodiac is Sagitarius");
        }

    }
}