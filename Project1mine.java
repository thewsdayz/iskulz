import java.util.Scanner;

public class Project1mine {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = scan.nextInt();
        int ikot = (num / 2);
        int space = ikot;
        int numero = 2;
        int numero1 = 2;
        int no = 1;
     
               
        for (int b = space ; b > 0; b--){ // top line
            System.out.print(" ");
        }
        System.out.print("1");
        space--;
                                   
        System.out.println();
        for(int ikotupper=space; ikotupper > 0; ikotupper--)  {//upper part 
                
            for (int s1 = space; s1 > 0; s1--) {
            System.out.print(" ");
            }  
   
            System.out.print("1");
            for (int round = no; round > 0 ; round--) { 
                if (numero1 <= num) {
                    System.out.print(numero);
                    numero++;
                    if(numero > num) {
                        numero = 2;
                    }
                }
                else {
                    System.out.print(numero1);
                    numero1++;
                }
            }
            System.out.print("1");
                        
            for (int s2 = space; s2 > 0; s2--) {
            System.out.print(" ");
            }               
            space--;
            ikot--;
            no = no + 2;
            System.out.println();
           
        }
    }
}