package learnJava.sorting_algorithms;

public class SelectionSort {
    public static void main(String[] args){
        int[] arr = {10,9,24,32,65,43};
        arr = selectionSort(arr);
        for(int element:arr){
            System.out.print(element+" ");
        }
    }

    private static int[] selectionSort(int[] arr) {
        int n=arr.length;
//        find the minimum index in the list and move it to the sorted left end
        for(int i=0;i<n-1;i++){
            int minIndex=i;
            for(int j=i+1;j<n;j++){
                if(arr[minIndex]>arr[j]){
                    minIndex=j;
                }
            }
            int temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }
}
