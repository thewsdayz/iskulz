import java.util.Scanner;

class Hoe{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = 1;
        int he = 0;
        int ho = 0;

        while(num != 0){
            System.out.print("Number: ");
            num = sc.nextInt();
            if(num != 0){
                if(num % 2 == 0){ // to test if even yung number or odd, if odd hindi papasok sa loob na code
                    if(num > he){
                        he = num;
                    } 
                }
                else{ // else sa pangalawang if
                    if(num > ho){
                        ho = num;
                    }
                }
            }
        }
        System.out.println("Highest Even Number: " + he);
        System.out.println("Highest Odd Number: " + ho);

    sc.close();
    }
}