import java.util.Scanner;

class MP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        for (int row = 1; row <= num; row++) { 
            for (int n = 1; n <= num - row; n++) { 
                System.out.print("  ");
            }
            for (int n = 1; n <= row; n++) { // 1 TO ASCENDING ORDER
                System.out.print(n + " ");
            }
            for (int n = row - 1; n >= 1; n--) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
        for (int row = num - 1; row >= 1; row--) {
            for (int n = 1; n <= num - row; n++) {
                System.out.print("  ");
            }
            for (int n = 1; n <= row; n++) {
                System.out.print(n + " ");
            }
            for (int n = row - 1; n >= 1; n--) { // 1 TO DESCENDING ORDER
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
