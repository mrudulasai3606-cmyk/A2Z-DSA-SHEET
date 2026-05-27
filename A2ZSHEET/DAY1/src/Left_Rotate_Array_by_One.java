import java.util.Scanner;

public class Left_Rotate_Array_by_One {
    static void rotateArray(int[] arr) {
        int n = arr.length;
        int f = arr[0];
        for(int i=0;i<n-1;i++){
            arr[i] = arr[i+1];
        }
        arr[n-1] = f;
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
        rotateArray(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
