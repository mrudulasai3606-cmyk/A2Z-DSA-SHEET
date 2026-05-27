import java.util.Scanner;

public class Largest_Element {

        public static int largest(int[] arr) {
            int n = arr.length;
            int mx = Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                mx = Math.max(mx,arr[i]);
            }
            return mx;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size od Array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter"+n+"elements into array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(largest(arr));

    }

}
