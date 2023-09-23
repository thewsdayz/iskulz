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
        double change;

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

        System.out.println("The total price for apples: " + TotalApples);
        System.out.println("The total price for grapes: " + TotalGrapes);
        System.out.println("The total price for oranges: " + TotalOranges); 
        
        double vat = TotalAmountDue * 0.1;
        double ftad = TotalAmountDue + vat;
        System.out.println("The added VAT: " + vat);
        System.out.println("The total amount due: " + ftad);

        if(money<=TotalAmountDue) {
            System.out.println("Insufficient money!");
        }
        else{
            change = money-ftad;
            System.out.println("Your change: " + change);
        } 
        inp.close();
    }
}