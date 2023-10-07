package number_system;

import java.util.Scanner;

public class decimal_to_binary {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int decimal_nums = sc.nextInt();
        int ans =0;
        int pw= 1;// power of 10
        while (decimal_nums>0){
            int parity= decimal_nums%2;
            ans += (parity*pw);
            pw *= 10;
            decimal_nums /= 2;

        }
        System.out.println(ans + " decimal number");

    }
}
