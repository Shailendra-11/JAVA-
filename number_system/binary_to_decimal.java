package number_system;

import java.util.Scanner;

public class binary_to_decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int binary_nums = sc.nextInt();
        int ans =0;
        int pw= 1;// 2^0 =1 power of 2
        while (binary_nums>0){
            int unit_digits = binary_nums%10;
            ans += (unit_digits*pw);
            binary_nums /= 10;
            pw *= 2;

        }
        System.out.println(ans + " binarar number");

    }
}
