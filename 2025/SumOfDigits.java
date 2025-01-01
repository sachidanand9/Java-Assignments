import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int count=0;
        int orignal_num = num;
        
        while (num>0) {
            count = count + num%10;
            num = num/10;
        }
System.out.println("Number of"+ orignal_num+"is :"+count);
    }
}
