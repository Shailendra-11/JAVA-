import java.util.*;

public class display {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
        // Stack<Integer> gt = new Stack<>();
        // while (st.size() > 0) {
        //     gt.push(st.pop());
        // }

        // while (gt.size() > 0) {
        //     int x = gt.pop();
        //     System.out.print(x + " ");
        //     st.push(x);
        // }
        int b= st.size();
        int [] arr= new int [b];
        for(int i=n-1; i>=0; i--){
            arr[i]=st.pop();
        }
         for(int i=0; i<n; i++){
            System.out.print(arr[i] +" ");
            st.push(arr[i]);
        }
    }
}
