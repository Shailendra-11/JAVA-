import java.util.*;
public class two_sum {
    public static int [] Sumindex(int []arr , int target){
        int n=arr.length;
        int[] ans = {-1};
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i=0; i<n; i++){
            int patner = target-arr[i];
            if (mp.containsKey(patner)) {
                ans=new int []{i,mp.get(patner)};
                return ans;
            }
            mp.put(arr[i], i);
        }
        return ans;

    }
    public static void main(String[] args) {
        int[] arr ={1,2,12,3,4,7,10,9};
        
         int[] key= Sumindex(arr, 15);
         System.out.println(key[0] + "     " +key[1]);
         
}
}
