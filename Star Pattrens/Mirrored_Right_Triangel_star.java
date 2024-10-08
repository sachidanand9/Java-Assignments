/*              WAJP to print Mirrror Right Triangle Star
                     *
                    **
                   ***
                  ****
                 *****
                ******       
*/

import java.util.Scanner;

public class Mirrored_Right_Triangel_star {

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
    }

    
}