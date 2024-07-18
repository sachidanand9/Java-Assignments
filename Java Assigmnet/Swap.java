public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Number before swap "+" A = "+a + ", B = "+b);

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("Number Afetr swap "+" A = "+a + ", B = "+b);
    }
}
