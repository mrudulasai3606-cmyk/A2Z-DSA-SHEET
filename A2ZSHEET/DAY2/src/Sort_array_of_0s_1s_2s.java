public class Sort_array_of_0s_1s_2s {

        public static void sortColors(int[] arr) {
            int n = arr.length;
            int lo=0;
            int hi= n-1;
            int mid=0;
            while(mid<=hi){
                if(arr[mid]==0){
                    swap(arr,mid,lo);
                    lo++;
                    mid++;
                }
                else if(arr[mid]==1) mid++;
                else {
                    swap(arr,mid,hi);
                    hi--;
                }
            }
        }
        public  static void swap(int arr[],int i,int j){
            int tem = arr[i];
            arr[i] = arr[j];
            arr[j] = tem;
        }

    public static void main(String[] args) {
        int arr[] = {1,0,0,0,0,0,2,2,2,2,2,2,1,1};
        sortColors(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    }

