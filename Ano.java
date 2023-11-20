import java.util.Scanner;

class Ano{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        int row = num / 2;
        int sp = num / 2;
        int numero = 2;
        int n1 = numero;
        int lt = 1;

        for (int r = row;r > 0; r--){ // top line
            System.out.print(" ");
        }
        System.out.print("1");

        for (int iup = row; iup > 0;iup--){
            for (int n = sp;n > 0;n--){
                System.out.print(" ");
            }

            System.out.print("1");
            for(int a = 1;a > 0;a--){
                if(n1 <= num){
                    System.out.print(numero);
                    numero++;
                }
                if(numero > num){
                    System.out.print(n1);
                    n1++;
                }
            }
            System.out.print("1");

            for(int dw = sp;dw > 0;dw--){
                System.out.print(" ");
            }
            sp--;
            row--;
            lt+= 2;
            System.out.println();
        }
        sp = 1;
        row = 1;
        lt = num - 2;

        for(int rdown = row;rdown <= num;rdown++){
            for(int q = sp;q > 0;q--){
                System.out.print(" ");
            }
            System.out.print("1");
            
            for(int w = lt;w > 0;w--){
                if(n1 <= num){
                    System.out.print(numero);
                    numero++;
                }
                if(numero > num){
                    System.out.print(n1);
                    n1++;
                }
            }
            System.out.print("1");

            for(int s1 = sp;s1 > 0;s1--){
                System.out.print(" ");
            }
            sp++;
            row++;
            lt = num - 2;
            System.out.println();
        }
        for(int c = sp;c > 0;c--){
            System.out.print(" ");
        }
        System.out.println("1");
    }
}