public class Duplicate_element {
    public static void main(String[] args) {
        int arr[] = { 34, 25, 56, 75, 34, 25 };
        
        System.out.println("Duplicate elements in array are  : ");
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                     System.out.println(arr[j]);
                }
            }
        }
    }
}
