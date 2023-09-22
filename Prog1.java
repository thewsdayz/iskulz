import java.util.Scanner;

class Prog1{

    public static void main(String[] args){

        System.out.print("First number:");
            Scanner inp = new Scanner(System.in);
                int una = inp.nextInt();


          System.out.print("second number:");
                int sec = inp.nextInt();
                    int sagot = una + sec;

            System.out.print("Sum is " +  sagot);
              
        inp.close();
    }

}