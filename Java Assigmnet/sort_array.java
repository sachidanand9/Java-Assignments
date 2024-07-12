import java.util.Arrays;

public class sort_array {
    public static void main(String[] args) {
        int[] arr = {40,70,28,67,35,31,97};
        System.out.println("Orignal array :"+Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println("Sorted array :" +Arrays.toString(arr));

    }
}
