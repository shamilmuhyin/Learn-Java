package learnJava.sorting_algorithms;

public class InsertionSort {
    public static void main(String[] args){
        int[] arr = {10,9,24,32,65,43};
        arr = insertionSort(arr);
        for(int element:arr){
            System.out.print(element+" ");
        }
    }

    private static int[] insertionSort(int[] arr) {
        int n= arr.length;
        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        return arr;
    }
}
