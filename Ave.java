import java.util.Scanner;

class Ave{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // variables
        double sum = 0;
        double ctr = 0;
        double num = 1;

        while(num != 0){
            System.out.print("Number? "); // question to be asked
            num = sc.nextInt(); // where the number from user will be stored
            sum += num; // add the entered num to the sum variable
            ctr++; // increment the count
        }
        ctr--; // remove the excess 0
        double ave = sum / ctr; // divide the sum to the count
        System.out.print(ave); // display of the final average

    sc.close();
    }
}