import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int ec = 0;
        int oc = 0;
        int num = 1;
        
        while (num != 0) {
            System.out.print("Numbers: ");
            num = sc.nextInt();
            
            if (num != 0) {
            
            if (num % 2 == 0) {
                ec++;
            } else {
                oc++;
            }
            }
        }
        
        System.out.println("Even numbers: " + ec);
        System.out.println("Odd numbers: " + oc);
        
        sc.close();
    }
}