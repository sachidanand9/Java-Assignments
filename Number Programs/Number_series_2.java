/* Write the program in Java to display the first ten terms of the following series: 1, 4, 9, 16,___*/

import java.util.Scanner;

public class Number_series_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter how many numbers you want in series");
        int num = sc.nextInt();
        int values;

        for(int i = 1; i <= num; i++){
            values = (i*i);
            System.out.print(values + " ");
        }
    }
}
