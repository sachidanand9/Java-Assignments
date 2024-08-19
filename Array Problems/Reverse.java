public class Reverse {
    public static void main(String[] args) {
        int arr[] = { 34, 25, 56, 75, 13, 35 };

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] > arr[j]) {

                    int temp = arr[i];

                    arr[i] = arr[j];

                    arr[j] = temp;

                }

            }

        }

        System.out.print("Array in Sorted Order :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println(); // for blank line

        System.out.print("Array in Reversed Order :");
        for (int i = arr.length - 1; i >= 0; --i) {

            System.out.print(arr[i] + " ");
        }
    }
}
