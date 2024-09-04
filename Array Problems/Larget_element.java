public class Larget_element {
    public static void main(String[] args) {
        int arr[] = {30, 48, 34, 56, 89};
        int Largest = arr[0];

        for(int i = 1; i < arr.length; i++){
            if (arr[i]>Largest) {
                Largest = arr[i];
            }
        }
        System.out.println("Largest number in array is : "+ Largest);
    }
}
