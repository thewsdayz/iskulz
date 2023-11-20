import java.util.Scanner;

public class Bich {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int number = scan.nextInt(); // Read an integer from the user
        int rows = (number / 2); // Calculate the number of rows in the pattern
        int spaces = rows; // spaces having the same value of rows
        int firstNum = 2; // Initialize the starting number for the pattern
        int secondNum = 2; // Initialize the starting number for the pattern (to handle numbers > 9)
        int increment = 1; // Initialize the variable to control the number increment/decrement

        // Print the first line of the pattern
        for (int a = spaces; a > 0; a--) {
            System.out.print(" ");
        }
        System.out.print("1");

        // Print spaces after the first '1' of the first line
        for (int b = spaces; b > 0; b--) {
            System.out.print(" ");
        }
        spaces--;
        System.out.println(" ");

        // Generate and print upper part of the pattern
        for (int upper = rows; upper > 0; upper--) {

            // Print leading spaces for each row
            for (int sp2 = spaces; sp2 > 0; sp2--) {
                System.out.print(" ");
            }

            // Print the first '1' of each row
            System.out.print("1");

            // Print numbers between '1's in the pattern
            for (int d = increment; d > 0; d--) {
                if (secondNum <= 9) {
                    System.out.print(firstNum);
                    firstNum++;
                    if (firstNum > 9) {
                        firstNum = 2;
                    }
                } else {
                    System.out.print(secondNum);
                    secondNum++;
                }
            }
            System.out.print("1");

            // Print spaces after the second '1' of each row
            for (int sp3 = spaces; sp3 > 0; sp3--) {
                System.out.print(" ");
            }

            // Update variables for the next row
            spaces--;
            rows--;
            increment += 2;

            System.out.println(); // Move to the next line
        }

        // Reset variables for the lower part of the pattern
        spaces = 1;
        rows = 1;
        int constant = (number / 2) - 1;
        increment = number - 4;

        // Generate and print lower part of the pattern
        for (int lower = rows; lower <= constant; lower++) {
            for (int sp2 = spaces; sp2 > 0; sp2--) {
                System.out.print(" ");
            }

            System.out.print("1");
            for (int d = increment; d > 0; d--) {
                if (secondNum <= 9) {
                    System.out.print(firstNum);
                    firstNum++;
                    if (firstNum > 9) {
                        firstNum = 2;
                    }
                } else {
                    System.out.print(secondNum);
                    secondNum++;
                }
            }
            System.out.print("1");

            for (int sp3 = spaces; sp3 > 0; sp3--) {
                System.out.print(" ");
            }

            // Update variables for the next row in the lower part
            spaces++;
            rows++;
            increment -= 2;
            System.out.println();
        }

        // Print the last line of the pattern
        for (int c = spaces; c > 0; c--) {
            System.out.print(" ");
        }
        System.out.print("1");

        // Print spaces after the last '1'
        for (int d = spaces; d > 0; d--) {
            System.out.print(" ");
        }
    }
}
