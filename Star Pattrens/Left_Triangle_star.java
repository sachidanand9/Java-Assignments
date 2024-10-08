 /*             WAJP to print Left Triangle Star Pattern
                *****
                ****
                ***
                **
                * 
*/

import java.util.Scanner;

public class Left_Triangle_star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the number of rows you want");
        int num = sc.nextInt();

        for(int i = 1; i<=num; i++){
            for(int j = num; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
