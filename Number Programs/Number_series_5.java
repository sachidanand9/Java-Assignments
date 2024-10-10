/* Write the program in Java to display the first ten terms of the following series:  2, 6, 12, 20, 30__ */

import java.util.Scanner;

public class Number_series_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter how many numbers you want in series");
        int num = sc.nextInt();
        int values = 2, incremnet = 4;

        for(int i = 1; i <= num; i++){
            System.out.print(values + " ");
            values = incremnet+values;
            incremnet = incremnet+2;
        }
}
}
