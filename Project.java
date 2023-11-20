import java.util.Scanner;

class Project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int row = (num / 2) + 1;
        int sp = num / 2;
        int ast = 1;

        for (int r = row; r > 0; r--) {
            for (int s = sp; s > 0; s--) {
                System.out.print("  ");
            }

            for (int a = 1; a <= ast; a++) {
                System.out.print(a + " ");
            }
            System.out.print("1");

            for (int s = sp; s > 0; s--) {
                System.out.print(" ");
            }

            System.out.println();
            sp--;
            ast += 2;

        }
    }
}