                        // Find the minimum and maximum element in an array              


import java.util.Arrays;

public class Min_Max{

    public static void main(String[] args) {
        int arr[] = {34, 25, 56, 75, 13 , 35};

        Arrays.sort(arr);

        System.out.println("Smallest element in array is : "+arr[0]);

        System.out.println("Largest element in array is : "+arr[arr.length - 1]);

    }
}