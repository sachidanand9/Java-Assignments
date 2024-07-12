// Find the minimum and maximum element in an array

public class Min_Max_array {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        int min = Min(arr);
        int max = Max(arr);

        System.out.println("Minimum ekement in the array is :"+min);
        System.out.println("Maximum element in the array is :"+max);


    }

    public static int Min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
             if (arr[i]<min) {
             min = arr[i];                
             }
        }
        return min;
    }

    public static int Max(int[] arr){
        int max = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
    
        return max;
    }
}
