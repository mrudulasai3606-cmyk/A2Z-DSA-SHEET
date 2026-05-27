import java.util.Scanner;

public class Maximum_Consecutive_Ones {

        public  static int findMaxConsecutiveOnes(int[] arr) {
            int n = arr.length;
            int c =0;
            int mc =0;
            for(int i=0;i<n;i++){
                if(arr[i]==1){
                    c++;
                    mc = Math.max(mc,c);
                }
                else{
                    c =0;
                }
            }
            return mc;

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
        System.out.println(findMaxConsecutiveOnes(arr));
    }
}
