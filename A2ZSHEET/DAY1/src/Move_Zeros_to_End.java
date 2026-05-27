import java.util.Scanner;

public class Move_Zeros_to_End {

        public static void moveZeroes(int[] arr) {
            int n = arr.length;
            int k=0;
            for(int i=0;i<n;i++){
                if(arr[i]!=0){
                    arr[k]= arr[i];
                    k++;
                }
            }
            while(k<n){
                arr[k] =0;
                k++;
            }
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
       moveZeroes(arr);

        for(int i:arr){
            System.out.print(i+" ");
        }
    }

}
