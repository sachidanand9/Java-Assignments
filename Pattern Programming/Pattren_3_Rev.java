// package Pattern Programming;

public class Pattren_3_Rev {
    public static void main(String[] args) {

        for(int i = 5; i >= 1; i--) {

            for(int j = 1; j <= 5 - i; j++) {

                System.out.print(" ");

            }

            for(int j = 1; j <= 2 * i - 1; j++) {

                System.out.print("*");

            }

            System.out.println();

        }

    }

}
