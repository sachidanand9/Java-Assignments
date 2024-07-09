public class Merge_Array {
    public static void main(String[] args) {
        int [] a = {1, 2, 3,};
        int [] b = {5, 6, 7};

        int [] c = merge(a,b);

        for(int n:c){
            System.out.print(n+",");
        }
    }
    public static int[] merge(int[] a, int[] b){

        int[] c = new int [a.length+b.length];

        for(int i = 0; i<a.length; i++){
            c[i] = a[i];
        }
        for(int i = 0; i<b.length; i++){
            c[a.length +i] = b[i];
        }
        return c;
    }
}
