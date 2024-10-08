/*
                 WAJP to print left pascal triangle
                     *
                    **
                   ***
                  ****
                 *****
                  ****
                   ***
                    **
                     * 
*/
import java.util.Scanner;

public class Left_Pasacal_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows you want:");
        int num = sc.nextInt();

        for(int i = 1; i<=num; i++){

            for(int j = num-1; j>=i; j--){
                System.out.print(" ");
            }
            for(int k = 1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1; i<=num; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(" ");
            }
            for(int k = num-1; k>=i; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
