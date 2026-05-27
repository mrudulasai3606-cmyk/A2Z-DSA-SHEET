public class KadanesAlgorithm {
    public static int maxSubArray(int[] arr) {
        int n = arr.length;
        int ms = Integer.MIN_VALUE;
        int c=0;
        for(int i=0;i<n;i++){
            c = c+arr[i];
            ms = Math.max(c,ms);
            if(c<0) c=0;
        }
        return ms;
    }

    public static void main(String[] args) {
        int arr[] = { -2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }
}
