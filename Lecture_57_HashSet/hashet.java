import java.util.*;

public class hashet {

    public static void main(String[] args) {
        HashSet<String> st = new HashSet<>();
        st.add("james");
        st.add("NAME");
        st.add("james");
        st.add("kaka");
        System.out.println(st);
        st.remove("james");
        System.out.println(st.contains("james"));
        System.out.println(st);
        for (String str : st) {
            System.out.println(str);
        }
    }
}