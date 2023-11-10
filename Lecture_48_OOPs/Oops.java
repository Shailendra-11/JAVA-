
public class Oops {
    public static class Student{
       String name ;
        int roll;
        double precent;
        String schoolfinal= "DPS";
        public Student( String name, int roll, double precent){
            //    name =nam;
            //    roll =rol;
            //    precent= prec;
            this.name =name;
            this.roll =roll;
            this.precent=precent;

            
        }

    
    }

  

    public static void main(String[] args) {
        Student st = new Student("shai" ,76,89.0);
       System.out.println(st.name);
       System.out.println(st.roll);
       System.out.println(st.precent);
       System.out.println(st.schoolfinal);
      
    }
}