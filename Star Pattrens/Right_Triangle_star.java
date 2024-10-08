/*              WAJP to print Right Triangel  Stars
                *  
                * *  
                * * *  
                * * * *  
*/

import java.util.Scanner;

public class Right_Triangle_star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the number of rows you want");
        int num = sc.nextInt();

        for(int i = 1; i<=num; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
