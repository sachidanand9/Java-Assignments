import java.util.Scanner;

public class Ractangle_pattren {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int row = sc.nextInt();

        System.out.println("Enter the number of colums");
        int col = sc.nextInt();

        for(int i = 1; i<=row; i++){
            for(int j = 1; j<=col; j++){
            System.out.print("*");
        }
        System.out.println();
    }
    }
}
