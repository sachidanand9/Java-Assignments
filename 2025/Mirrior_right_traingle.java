import java.util.Scanner;

public class Mirrior_right_traingle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of star you want");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = num; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
