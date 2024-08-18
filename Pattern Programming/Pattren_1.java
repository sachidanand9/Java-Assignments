// package Pattern Programming;

import java.util.Scanner;

public class Pattren_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of star rows  you want : ");
        int num = sc.nextInt();

        // for inner loop row 
        for(int i = 1; i <= num; i++){

            // for inner loop column 

        for(int j = 1; j<=i; j++){
             System.out.print("*");
        }
        System.out.println();
        }
    }
}
