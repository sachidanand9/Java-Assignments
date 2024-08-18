// package Pattern Programming;

import java.util.Scanner;

public class Rev_Pattern_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows you want :");
        int row = sc.nextInt();

        // inner loop row 
        for(int i = row ; i >=1 ; i--){

         // for inner loop col 
         
         for(int j = 1; j<=i; j++){

            System.out.print("*");
         }

         System.out.println();
        }
    }
}
