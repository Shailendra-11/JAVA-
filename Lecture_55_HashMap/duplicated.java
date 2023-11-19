import java.util.*;
// Given an arrays , find the most frequent elements in it. If there are multiple elements that appers
// maxium number if times , print any one of them
public class duplicated {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,4,5,5,3,1};
        HashMap<Integer,Integer> mp = new HashMap<>();
        
         for(int i=1; i<arr.length; i++){
             if (!mp.containsKey(arr[i])) {
                  mp.put(arr[i], 1);
             }else{
                mp.put(arr[i], mp.get(arr[i])+1);
             }
         }
        //  System.out.println("Frequency arrays ");
        //  System.out.println(mp.entrySet());
          int maxkey=0,ansvalue=0;
        //   for (int i : mp.keySet()) {
        //          if (mp.get(i)>maxkey) {
        //             maxkey = mp.get(i);
        //              ansvalue=i;
        //          }
         // }
        //   System.out.println(maxkey);
        //   System.out.println(ansvalue);
    
         for (var key : mp.entrySet()) {
               if (key.getValue()>maxkey) {
                    maxkey =key.getValue();
                    ansvalue= key.getKey();

               }
         }
   System.out.println(maxkey);
   System.out.println(ansvalue);

    }
}
