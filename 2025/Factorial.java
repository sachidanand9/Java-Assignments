import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        int count = 1;

        for(int i = 1; i <=num; i++){
         count= count*i;
        }
        System.out.println(count);
    }
}
