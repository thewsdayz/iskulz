import java.util.Scanner;

class Calcu{
    public static void main(String[] args){

        Scanner get = new Scanner(System.in);

        System.out.print("1st Number: ");
        int first = get.nextInt();
        System.out.print("2nd Number: ");
        int second = get.nextInt();
        System.out.println("[1] Add");
        System.out.println("[2] Subtract");
        System.out.println("[3] Multiply");
        System.out.println("[4] DIvide");
        System.out.print("Enter Choice: ");
        int choice = get.nextInt();

        if(choice == 1){
            int sum = first + second;
            System.out.print("Sum is " + sum);
        }
        else if(choice == 2){
            int diff = first - second;
            System.out.print("Difference is " + diff);
        }
        else if(choice == 3){
            double pro = first * second;
            System.out.print("Multiply is " + pro);
        }
        else if(choice == 4){
            double quo = first/second;
            System.out.print("Quotient is " + quo);
        }
        else{
            System.out.print("Error! Choose from 1 to 4 only.");
        }

        get.close();
    }
}
