package Lecture_40_Count_On_Sorting_Algorithm_question;

public class count_sort {
    static int findMax(int [] arr){
        int mx = Integer.MIN_VALUE;
        for(int i=0; i< arr.length;i++){
            if(arr[i]> mx){
                mx = arr[i];
            }
        }
        return mx;

    }
    static void basicCountSort(int []arr){
        int max = findMax(arr); //Find the largest elements of the arr
        int[] count = new int[max+1] ;
        for(int i=0; i< arr.length; i++){
            count[arr[i]]++;
        }
        int k=0;
        for(int i=0; i<count.length;i++){
            for(int j=0; j<count[i]; j++){
                arr[k++]=i;
            }
        }
    }

    //2nd method
    static void coutSort(int[]arr){
        int n = arr.length;
        int [] output = new int[n];
        int max = findMax(arr);// find the largest of the arr
        int [] count = new int[max+1];
        for (int i=0; i<arr.length; i++) {// make frequency arrays
            count[arr[i]]++;
        }
        // make prefix sum arrays of count arrays
        for (int i =1; i< count.length;i++){
            count[i] += count[i-1];
        }
        // find the index of each in the original array and put it is output arrays
        for(int i=n-1; i>=0; i--){
            int idx = count[arr[i]]-1;
            output[idx]=arr[i];
            count[arr[i]]--;

        }
        // copy all elements of output to arrays
        for (int i=0; i<n; i++){
            arr[i]=output[i];

        }

    }

    public static void main(String []args) {
        int[] arr = {8, 5, 6, 0, 1, 2, 2};
       // basicCountSort(arr);
        coutSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
