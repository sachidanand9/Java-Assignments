import java.util.Scanner;

public class Empty_numeric_pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();

        for(int i = 1; i<=num; i++){
            for(int j = 1; j<=num-i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= 2*i-1;k++ ){
                if (k==1||k==2*i-1||i==num) {
                    System.out.print(i);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
