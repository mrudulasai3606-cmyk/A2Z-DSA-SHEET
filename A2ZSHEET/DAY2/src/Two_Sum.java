import java.util.*;
public class Two_Sum {
//BRUTE
//        public  static int[]  twoSum(int[] nums, int target) {
//            int num[] = new int[2];
//            for(int i=0;i<nums.length-1;i++){
//                for(int j=i+1;j<nums.length;j++){
//                    if(nums[i]+nums[j]==target){
//                        num[0] =i;
//                        num[1] =j;
//                        break;
//                    }
//                }
//            }
//            return num;
//        }
    //OPTIMAL

    public static int[] twoSum(int[] arr, int tar) {
        int n = arr.length;
        int[] res= new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int rem = tar-arr[i];
            if(map.containsKey(rem)){
                res[0] =i;
                res[1] = map.get(rem);
                break;
            }
            else{
                map.put(arr[i],i);
            }

        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,2,4,5,6,6,7};
        int t = 7;
        int res[] = twoSum(arr,t);
        for(int i:res){
            System.out.print(i+" ");
        }
    }
}
