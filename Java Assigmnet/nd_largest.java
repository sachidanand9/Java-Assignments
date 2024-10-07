import java.util.Scanner;
public class nd_largest {
    public static void main(String[] args) {
    int arr[] = {23,45,67,32,14,10};
    int largest = arr[0];
    int second_largest = arr[0];

    for(int i = 1; i < arr.length; i++){
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


