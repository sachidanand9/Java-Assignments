public class 2nd_largest_element {
    public static void main(String[] args) {
        int arr[] = {2,4,5,67,89,43,34};
        int n = arr.length;

        int highest_num = Integer.MIN_VALUE;
        int second_highest = Integer.MIN_VALUE;

        for(int i = 0; i<n;i++){
            if (arr[i]>highest_num) {
                second_highest = highest_num;
                highest_num = arr[i];
            }

            if (arr[i]<highest_num && arr[i]>second_highest) {
                second_highest = arr[i];
                
            }

        }

        System.out.println(second_highest);

    }
}
