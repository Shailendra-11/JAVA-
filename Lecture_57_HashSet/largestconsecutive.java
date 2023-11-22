import java.util.*;
public class largestconsecutive {


    public static int longestConsectivenumber(int []nums){
            HashSet<Integer> st = new HashSet<>();
            int max=0;
            for(int nu :nums) st.add(nu);
            for(int nu:st){
                if (!st.contains(nu-1)) {
                      int currNum= nu;
                      int cuurStreak=1;
                      while (st.contains(currNum+1)) {
                        cuurStreak++;
                        currNum++;
                      }
                      max =Math.max(currNum,cuurStreak);
                }
            }
        return max;
    }

    public static void main(String[] args) {
        int []nums ={0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsectivenumber(nums));
}
}