public class Majority_Element1 {
    public static int majorityElement(int[] arr) {
        int n = arr.length;
        int ele =0;
        int c=0;
        for(int i=0;i<n;i++){
            if(ele==0){
                ele = arr[i];
                c++;
                break;
            }
            if(arr[i]==ele) c++;
            else c--;
        }
        return ele;
    }

    public static void main(String[] args) {
        int arr[] = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr));

    }
}
