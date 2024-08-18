/* package Pattern Programming;
             *
            **
           ***
          ****          */

import java.util.Scanner;

public class Pattren_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int row = sc.nextInt();
        int i,j;

        // for loop for rows
        for(i = 0;i<row;i++){

         // for loop for rows
         for( j = 2*(row-i);j>=0;j--){
            System.out.print(" ");// print space
         }
          // for loop for columns
          for(j = 0;j<=i;j++){
             System.out.print("*");
          
            }   
            System.out.println(); 
        }
    }
}
