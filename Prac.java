import java.util.Scanner;

class Prac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int attempts = 0;
        int correctans = 63;
        int userguess = 0;

        while (userguess != 63) {
            System.out.print("Guess the correct number from 1 to 100: ");
            userguess = sc.nextInt();
            attempts++;

            if(userguess != 63){
                if (userguess < 1 || userguess > 100) {
                    System.out.println("Please enter a number between 1 to 100.");
                }
                else if (userguess < 63) {
                System.out.println("Too low! Try again.");
                }
                else if (userguess > 63) {
                System.out.println("Too high! Try again.");
                }
                else {
                System.out.println("Congratulations! You guessed the number " + correctans + " in " + attempts + " attempts.");
                }
            }
        }

        sc.close(); // Close the scanner
    }
}