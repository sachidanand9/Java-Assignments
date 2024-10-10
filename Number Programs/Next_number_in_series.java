 /* WAJP to find next number in series 0 3 8 15 24 ___. */

import java.util.Scanner;

public class Next_number_in_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter how many numbers you want in series");
        int num = sc.nextInt();
        int values;

        for(int i = 1; i <= num; i++){
            values = (i*i)-1;
            System.out.print(values + " ");
        }
    }
}
