import java.util.Scanner;

public class Number_in_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Enter the number");
        int count=0;
        
        while (num>0) {
            num = num/10;
            count++;
        }
System.out.println("Number of digits is "+count);
    }
}
