import java.util.Scanner;

public class Linear_Search {

        public  static int search(int arr[], int x) {
            int n = arr.length;
            for(int i=0;i<n;i++){
                if(arr[i]==x) return i;
            }
            return -1;
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
        System.out.println(search(arr,6));
    }

}
