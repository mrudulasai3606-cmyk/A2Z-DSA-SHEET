public class Number_that_appears_twicw {
    public static int singleNumber(int[] arr) {
        int n = arr.length;
        int x= 0;
        for(int i=0;i<n;i++){
            x = x^arr[i];
        }
        return x;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,2,3,3,4,5,1,5,4,6};
        System.out.println(singleNumber(arr));
    }
}
