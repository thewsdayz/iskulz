import java.util.Scanner;

class Ro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int ikot = num / 2;
        int sp = ikot;
        int ast = 1;
        int numb = 2;
        int numbe = numb;
        int no = 1;

        for(int r = sp+1; r > 0; r--){
            System.out.print("_");
        }
        System.out.println("1");

        for(int ikotup = ikot; ikotup > 0; ikotup--){
            for(int a = sp; a > 0; a--){
                System.out.print("_");
            }

            System.out.print("1");
            for(int b = no; b > 0; b--){
                if(numbe <= num){
                    if (numb <= num) {
                        System.out.print(numb);
                        numb++;
                    } else {
                        numbe = 2;
                        System.out.print(numbe);
                        numbe++;
                    }
                }
            }
            System.out.print("1");

            for(int c = sp; c > 0; c--){
                System.out.print("_");
            }
            sp--;
            ikot--;
            no += 2;
            System.out.println();
        }
    }
}
