import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //--> Taking input from user 
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int temp = num,r,sum=0;

        while (num>0) {
            r = num%10;
            sum = (sum*10)+r;
            num = num/10;
        }
        if (temp == sum) {
            System.out.println("Palindrome number :"+temp);
        } else {
            System.out.println("Not a palindrome number : "+temp);
        }
    }
}