package Lecture_41_Problem_On_Sorting_Algorithm_question;
//Given an arrays of size containing only 0s, 1s ,2s . sort arrays in ascending oder

public class Q3 {
    static void swap(int []a ,int x,int y){
        int temp = a[x];
        a[x]=a[y];
        a[y]=temp;
    }
    static  void sort012(int [] a){
        int lo =0, mid=0,hi=a.length-1;
        // explore the unknown region
        while(mid<=hi){
            if(a[mid]==0){
                swap(a,mid,lo);
                mid++;
                lo++;
            }else if(a[mid]==1){
                mid++;
            }else{
                swap(a,mid,hi);
                hi--;
            }
        }
    }

    public static void main(String[] args) {
        int []a ={2,2,0,1,2,1,1,2,0,0,2};
        sort012(a);
        for (int val:a
             )
            System.out.print(val +" "); {

        }

    }
}
