package Lecture_46_Strings_question;

public class Q1 {
    public static void main(String[] args) {
        String sc ="abcd";
        for(int i=0; i<=3;i++){
            for(int j=i+1; j<=4; j++){
                System.out.print(sc.substring(i,j)+" ");
            }
        }
    }
}
