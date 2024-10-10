/* WAJP TO PRINT SANDGLASS PATTREN  */

import java.util.Scanner;
public class Sandglass_pattren {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows you want:");
        int num = sc.nextInt();

        for(int i = 1; i<=num;i++){
            for(int j = 1; j<i; j++){
                System.out.print(" ");
            }
             for(int k = 1 ; k<= num-i; k++){
                System.out.print("* ");
             }
            System.out.println();
        }
        for(int i = 1; i < num; i++){
            for(int j = num-2; j>=i; j--){
                System.out.print(" ");
            }
            for(int k =1; k<=i; k++){
                System.out.print("* ");
            }
             
            System.out.println();
        }
    }
}
