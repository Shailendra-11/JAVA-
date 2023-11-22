import java.util.*;
public class Maxpair {
 public static int MaxNumberPair(int[]nums){
  HashSet<Integer> table= new HashSet<>();
  int max=0;
  for(int i=0; i<nums.length;i++){
    int bags =nums[i];
    if (table.contains(bags)) {
        table.remove(bags);
    }else{
        table.add(bags);
        max = Math.min(bags, table.size());

    }
  }
  return max;
    }
    public static void main(String[] args) {
        int []nums = {2,1,1,1,3,2,3};
       System.out.println(MaxNumberPair(nums));
    }
}
