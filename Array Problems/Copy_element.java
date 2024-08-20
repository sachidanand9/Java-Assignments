public class Copy_element {
    public static void main(String[] args) {
        int arr1[] = { 34, 25, 56, 75, 34, 25 };

        // Create another array arr2 with size of arr1
        int arr2[] = new int[arr1.length];

        // Copying all elements of one array into another
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        // Displaying elements of array arr1
        System.out.print("Elements of original array: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        System.out.println();

        // Displaying elements of array arr2
        System.out.print("Elements of new array: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
