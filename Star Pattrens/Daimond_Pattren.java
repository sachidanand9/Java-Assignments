 /*   WAJP to print Diamond pattren
                                        *
                                       ***
                                      *****
                                     *******
                                    *********
                                     *******
                                      *****
                                       ***
                                        *
*/
import java.util.Scanner;
public class Daimond_Pattren {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows you want");
        int num = sc.nextInt();

        for(int i = 1; i <= num; i++){
            for(int j = num-1; j>=i; j--){
                System.out.print(" ");
            }
            for(int k =1; k<=i; k++){
                System.out.print("*");
            }
            for(int l = 2;l<=i;l++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 1; i<=num;i++){
            for(int j = 1; j<=i; j++){
                System.out.print(" ");
            }
             for(int k = num-1 ; k>= i; k--){
                System.out.print("*");
             }
              for(int l = num-2; l>=i; l--){
                System.out.print("*");
              } 
            System.out.println();
        }
    }
}
