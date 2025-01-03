import java.util.Scanner;

public class Power_Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number A : ");
        int a = sc.nextInt();

        System.out.println("Enter Second number B : ");
        int b = sc.nextInt();
        int count = 1;
        for (int i = 1; i <= b; i++) {
            count = count * a;
        }
        System.out.println(count);
    }
}
