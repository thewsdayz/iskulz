import java.util.Scanner;

public class Pro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int n = num;
        
        int spaces = n / 2;
        int stars = 1;
        
        // Upper part of the diamond
        for (int i = 1; i <= n / 2 + 1; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            
            for (int j = 1; j <= stars; j++) {
                System.out.print(n);
            }
            
            System.out.println();
            spaces--;
            stars += 2;
        }
        
        
    
    }
}
