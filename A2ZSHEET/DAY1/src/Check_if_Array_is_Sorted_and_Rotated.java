import java.util.Scanner;

public class Check_if_Array_is_Sorted_and_Rotated {

        public static boolean check(int[] arr) {
            int n = arr.length;
            int c=0;
            for(int i=1;i<n;i++){
                if(arr[i-1]>arr[i]) c++;
            }
            if(arr[n-1]>arr[0]) c++;
            return c<=1;
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
        System.out.println(check(arr));
    }
}
