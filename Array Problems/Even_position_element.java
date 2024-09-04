public class Even_position_element {
    public static void main(String[] args) {
        int arr[] = { 34, 25, 56, 75, 34, 25 };

        System.out.println("Elemnts on even positions are :");

        for (int i = 1; i < arr.length; i = i + 2) {
            System.out.println(arr[i]);
        }

    }
}
