public class smallest_element {
    public static void main(String[] args) {
        int[] arr = {48, 56, 87, 32, 26};
        int smallest = arr[0]; // Assume that the elemnet present at 0 index is smallest

        for(int i = 1; i<arr.length;i++){
            if (arr[i]<smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("Smallest Number in the Array is "+ smallest);
    }
}
