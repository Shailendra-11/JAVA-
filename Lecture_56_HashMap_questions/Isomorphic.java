import java.util.*;

public class Isomorphic {
    public static boolean isIsomorphic (String s , String t){
      HashMap<Character,Character> mp = new HashMap<>();
       for(int i=0; i<s.length(); i++){
         Character sCh = s.charAt(i);
         Character tCh = t.charAt(i);
         if(mp.containsKey(sCh)){
           if (mp.get(sCh)!=tCh) return false;
         }else if(mp.containsValue(tCh)){
           return false;
         }else{
            mp.put(sCh, tCh);
         }
      
         }
         return true;
     }

    

    public static void main(String[] args) {
        String s ="egg";
         String t ="add";
         System.out.println(isIsomorphic(s,t));
    }
}
