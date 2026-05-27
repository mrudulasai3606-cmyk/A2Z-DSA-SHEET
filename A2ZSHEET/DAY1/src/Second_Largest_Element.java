import java.util.Scanner;

public class Second_Largest_Element {

        public static int getSecondLargest(int[] arr) {
            int n = arr.length;
            int mx = Integer.MIN_VALUE;
            int smax = mx;
            for(int i=0;i<n;i++){
                if(arr[i]>mx){
                    smax = mx;
                    mx = arr[i];
                }
                else if(arr[i]>smax && arr[i]!=mx){
                    smax = arr[i];
                }
            }
            if(smax==Integer.MIN_VALUE) return -1;
            return smax;
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
        System.out.println(getSecondLargest(arr));


    }
    }

