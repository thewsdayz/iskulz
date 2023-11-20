import java.util.Scanner;

class M{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int row = (number / 2) + 1;
        int space = number / 2;
        int n = 1;
        
        for(int r = row;r > 0;r--){

            for(int sp = space;sp > 0;sp--){
                System.out.print("_");
            }

            for(int a = 1;a <= n;a++){
                System.out.print(a);
            }

            for(int sp = space;sp > 0;sp--){
                System.out.print("_");
            }

            System.out.println();
            space--;
            n += 2;
        }
    }
}