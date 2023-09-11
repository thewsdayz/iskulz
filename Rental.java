import java.util.Scanner;

class Rental{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Choice [1] Driver [2] Car [3] Both ");
        int choice = scan.nextInt();

        if(choice == 1){
            System.out.print("Hours? ");
            int hrs = scan.nextInt();
            double tad = hrs * 200;
            System.out.print(tad);
        }
            else if(choice == 2){
            System.out.print("Car Number? ");
            int car = scan.nextInt();
            System.out.print("Days? ");
            int days = scan.nextInt();
            if(car<=5){
                double tad = days * 2000;
                System.out.print(tad);
            }
            else{
                double tad = days * 1000;
                System.out.print(tad);
            }
        }
        else{
            System.out.print("Days? ");
            int days = scan.nextInt();
            System.out.print("Employee [1]");
            int emp = scan.nextInt();
            if(emp == 1){
                double tad = days * 6000;
                double disc = tad * 0.1;
                double Total = tad-disc;
                System.out.print(Total);
            }
        }
    }
}