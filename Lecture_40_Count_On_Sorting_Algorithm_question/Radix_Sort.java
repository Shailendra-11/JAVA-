package Lecture_40_Count_On_Sorting_Algorithm_question;

public class Radix_Sort {
    static int findMax(int [] arr){
        int mx = Integer.MIN_VALUE;
        for(int i=0; i< arr.length;i++){
            if(arr[i]> mx){
                mx = arr[i];
            }
        }
        return mx;

    }
    static void coutSort(int[]arr,int places){
        int n = arr.length;
        int [] output = new int[n];
        int [] count = new int[10];
        for (int i=0; i<arr.length; i++) {// make frequency arrays
            count[(arr[i]/places)%10]++;
        }
        // make prefix sum arrays of count arrays
        for (int i =1; i< count.length;i++){
            count[i] += count[i-1];
        }
        // find the index of each in the original array and put it is output arrays
        for(int i=n-1; i>=0; i--){
            int idx = count[(arr[i]/places)%10]-1;
            output[idx]=arr[i];
            count[(arr[i]/places)%10]--;

        }
        // copy all elements of output to arrays
        for (int i=0; i<n; i++){
            arr[i]=output[i];

        }

    }
    static  void Radixsort(int [] arr){
        int max = findMax(arr);// get maxium elements
        // apply counting sort to sort elements based on places value
        for (int places =1; max/places>0; places *= 10)
        {
        coutSort(arr,places);
        }
    }
    public static void main(String[] args) {
       int [] arr = {45,700,689,103, 0 ,7};
       Radixsort(arr);
       for(int i=0; i< arr.length; i++)
           System.out.print(arr[i] +" ");
    }
}
