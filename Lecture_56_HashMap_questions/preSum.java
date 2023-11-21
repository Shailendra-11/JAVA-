import java.util.*;
public class preSum {

    public static int Prefisum(int []nums , int n){
      HashMap<Integer, Integer>mp= new HashMap<>();
     int maxlength=0; int prefsum=0;
      mp.put(0, -1);
      for(int i=0; i<nums.length; i++){
            prefsum += nums[i];

            if (mp.containsKey(prefsum)) {
                maxlength = Math.max(maxlength, i-mp.get(prefsum));
                return maxlength;
            }else{
                mp.put(prefsum, i);
            }
      }
      return maxlength;

    }
    public static void main(String[] args) {
       int arr[ ] ={1 ,2, 3, 4 ,5 ,8, 9} ;
       System.out.println(Prefisum(arr, 5));

    }
}
