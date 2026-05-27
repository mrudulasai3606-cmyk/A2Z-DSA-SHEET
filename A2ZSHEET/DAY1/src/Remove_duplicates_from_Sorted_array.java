import java.util.Scanner;

public class Remove_duplicates_from_Sorted_array {

        public static int removeDuplicates(int[] arr) {
            int n = arr.length;
            int k=1;
            for(int i=1;i<n;i++){
                if(arr[i]!=arr[i-1]){
                    arr[k] = arr[i];
                    k++;
                }
            }
            return k;
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
        System.out.println(removeDuplicates(arr));
    }

}
