import java.util.Scanner;

public class numb_rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows you wants");
        int num = sc.nextInt();

        for(int i = 1; i<=num; i++){
            for(int j = 1; j<=num; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
