// package Pattern Programming;

import java.util.Scanner;

public class Pattren_2_Rev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int row = sc.nextInt();

        for(int i = row;i>=1;i--){

            for(int j = row ; j >i; j--){
                System.out.print(" ");
            }

            for(int j = 1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
