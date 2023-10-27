package Lecture_34_recursion_on_String_and_Arrays_frog_question_sol;
// Given a string containing digits from 2-9 inclusive, return all possible letters combinatio
// that the numbers could represent .Return all answer in any order.
public class Q2 {
    static void combination(String dig , String []kp, String res){
          if(dig.length()==0){
              System.out.print(res +" ");
              return;
          }
             int currNum =dig.charAt(0)-'0';
             String currChoices = kp[currNum];
             for(int i=0; i<currChoices.length();i++){
                 combination(dig.substring(1),kp,res +currChoices.charAt(i));
             }
    }
    public static void main(String[] args) {
      String dig="23";
      String [] kp ={"","" ,"abc" ,"def","ghi", "jkl","mno", "pqrs" ,"tuv","wxyz"};
      combination(dig,kp,"");
    }
}
