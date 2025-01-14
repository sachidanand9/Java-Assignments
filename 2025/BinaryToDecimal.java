import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Binary number");
        int binary_num = sc.nextInt();
        int ans = 0, pw = 1;

        while (binary_num>0) {
            int decimal_num = binary_num%10;
            ans = ans + (decimal_num*pw);
            binary_num = binary_num/10;
            pw = pw*2;
        }
        System.out.println(ans);
    }
}
