import java.util.Arrays;

public class Second_largest_element {
    public static void main(String[] args) {
        int arr[] = {2,4,5,8,65,1,9};
        int len = arr.length;

        Arrays.sort(arr);

        System.out.println("Second Largest element in Array is : "+arr[len-2]);
    }
}
