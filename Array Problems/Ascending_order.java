public class Ascending_order {
    public static void main(String[] args) {
        int arr[] = {2,3,1,45,23,46,87,32};
        int temp = 0; // tempary variable to store the values 

        for(int i = 0; i<arr.length;i++){
          for (int j = i+1;j<arr.length;j++){
            if (arr[i]>arr[j]) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
          }
        }
        System.out.println("Element in Ascending Order :");
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
    }
}
}
