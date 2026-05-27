import java.util.Scanner;

public class Left_Rotate_Array_by_K_Places {

        public static void reverse(int arr[],int i,int j){
            while(i<=j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        public static void rotate(int[] arr, int k) {
            int n = arr.length;
            k = k%n;
            reverse(arr,0,k-1);
            reverse(arr,k,n-1);
            reverse(arr,0,n-1);
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
        int k=3;
        rotate(arr,k);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }

}
