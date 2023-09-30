import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0; // Initialize the sum
        int count = 0; // Initialize the count of numbers

        while (true) {
            System.out.print("Enter a number (0 to stop): ");
            int num = scanner.nextInt();

            if (num == 0) {
                break; // Exit the loop if the user enters 0
            }

            sum += num; // Add the entered number to the sum
            count++; // Increment the count of numbers
        }

        if (count > 0) {
            double average = (double) sum / count; // Calculate the average
            System.out.println("Average of the entered numbers: " + average);
        } else {
            System.out.println("No numbers were entered.");
        }

        scanner.close();
    }
}