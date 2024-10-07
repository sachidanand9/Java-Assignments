import java.util.Scanner;
public class Second_largest_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array");
        for(int i = 0; i <n; i++){
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];
        int second_largest = arr[0];

        for(int i = 1; i < n; i++){
            if(arr[i]>largest){
                second_largest = largest;
                largest = arr[i];
            }
            else if(arr[i]>second_largest && arr[i]!=largest){
                second_largest = arr[i];
            }
        }
        if (second_largest == largest) {
            System.out.println(" There is no largest value");
        } else {
            System.out.println("The second largest value is:"+second_largest);
        }
    }
}
