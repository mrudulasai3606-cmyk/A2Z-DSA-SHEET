import java.util.*;
public class Union_of_two_sorted_arrays {

        public static ArrayList<Integer> findUnion(int a[], int b[]) {
            Set<Integer> set = new TreeSet<>();
            for(int i=0;i<a.length;i++){
                set.add(a[i]);
            }
            for(int i=0;i<b.length;i++){
                set.add(b[i]);
            }
            ArrayList<Integer> res = new ArrayList<Integer>();
            for(Integer i:set){
                res.add(i);
            }
            return res;
        }

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,67,876,98,9};
        int b[] = {3245,76,1,2,3,3,4,5};
        ArrayList<Integer> res=   findUnion(a,b);
        for(Integer i:res){
            System.out.print(i+" ");
        }
    }
    }


