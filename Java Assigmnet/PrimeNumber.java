public class PrimeNumber {
   public static void main(String[] args) {
    int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
  for (int num : arr){
    if (num>1&& Prime(num)){
        System.out.print(num+",");
    }
  }

   }
   public static boolean Prime(int num){
    
    for(int i = 2; i<=num/2; i++){
        if (num%i==0){
            return false;
        }
    }
    return true;
   } 
}
