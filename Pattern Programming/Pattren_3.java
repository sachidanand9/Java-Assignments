// package Pattern Programming;

import java.util.Scanner;

public class Pattren_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int row = sc.nextInt();

        for(int i = 0; i<row; i++){

            for(int j = row-i;j>1;j--){
                System.out.print(" ");
            }
            for(int j = 0; j<=2*i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
