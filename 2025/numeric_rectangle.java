import java.util.Scanner;

public class numeric_rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many number you want");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = i; j <= num; j++) {
                System.out.print(j);
            }
            for(int k = 1; k <= i-1; k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
