import java.util.Scanner;

class Patt{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many rows: ");
        int num = sc.nextInt();
        int n = num;
        int flag = 0;

        for (int row = num;row > 0; row--){
            if(flag == 0){
                n = num;
                flag = 1;
            }
            else{
                n = 4;
                flag = 0;
            }
            for(int ikot = num;ikot > 0; ikot--){
            System.out.print(n);
            }

        System.out.println();
        }
    
        sc.close();
    }
}