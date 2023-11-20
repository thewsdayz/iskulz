import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int num = scanner.nextInt();
        int n = num;

        // Loop through each row
        for (int i = 1; i <= n; i++) {
            // Check if the current row is even or odd
            if (i % 2 == 0) {
                // If it's an even row, print numbers in descending order
                int ikot = n;
                while (ikot >= 1){
                    System.out.print(ikot);
                    ikot--;
                }
            } else {
                // If it's an odd row, print numbers in ascending order
                int ikot = 1;
                while (ikot <= n){
                    System.out.print(ikot);
                    ikot++;
                }
            }
            System.out.println(); // Move to the next line after each row
        }

        scanner.close();
    }
}
