/*              WAJP to print Right Down Mirror Star
                *****
                 ****
                  ***
                   **
                    *       
*/
import java.util.Scanner;

public class Right_Down_Mirror_Star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows you want:");
        int num = sc.nextInt();

        for(int i = 1; i<=num; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(" ");
            }
            for(int k = num; k>=i; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
