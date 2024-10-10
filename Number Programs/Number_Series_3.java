/*Write a program in Java to display the first 10 terms of the following series:10, 20, 30, 40, ……..*/

import java.util.Scanner;

public class Number_Series_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter how many numbers you want in series");
        int num = sc.nextInt();
        int values = 10, incremnet = 10;

        for(int i = 1; i <= num; i++){
            System.out.print(values + " ");
            values = incremnet+values;
        }
}
}
