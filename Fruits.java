import java.util.Scanner;

class Fruits{
    public static void main(String[] args){

        int apples;
        int grapes;
        int oranges;
        int TotalApples;
        int TotalGrapes;
        int TotalOranges;
        int TotalAmountDue;
        int money;
        int change;
        double vat;

        Scanner inp = new Scanner(System.in);

        System.out.print("How many apples?");
            apples = inp.nextInt();
        
        System.out.print("How many grapes?");
            grapes = inp.nextInt();

        System.out.print("How many oranges?");
            oranges = inp.nextInt();

        System.out.print("How much do you pay?");
            money = inp.nextInt();

            TotalApples = apples * 20;
            TotalGrapes = grapes * 50;
            TotalOranges = oranges * 10;
            TotalAmountDue = TotalApples+TotalGrapes+TotalOranges;
            change = money - TotalAmountDue;
        
        System.out.println("The total price for apples: " + TotalApples);
        System.out.println("The total price for grapes: " + TotalGrapes);
        System.out.println("The total price for oranges: " + TotalOranges); 
        System.out.println("The total amount due: " + TotalAmountDue);
        vat = 0.10 * TotalAmountDue;
        System.out.println("The added VAT: " + vat);

        if(money<=TotalAmountDue) {
            System.out.println("Insufficient money!");
        }
        else if(money>=TotalAmountDue){
            System.out.println("Your change: " + change);
        } 
    }
}