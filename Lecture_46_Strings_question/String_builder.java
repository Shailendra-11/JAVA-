package Lecture_46_Strings_question;

public class String_builder {
    public static void main(String[] args) {
        StringBuilder stra = new StringBuilder("heloo ");
           stra.append("world");
        System.out.println(stra);
        stra.setCharAt(0,'m');
        System.out.println(stra);
    }
}
