package conditional;
import java.util.*;

public class nested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
     if(n%5==0||n%3==0)

    {
        if (n % 15 != 0) {
            System.out.println( n + " not divisible by 15");
        }
    }
     else {
         System.out.println("not matching ");
        }
}
}
