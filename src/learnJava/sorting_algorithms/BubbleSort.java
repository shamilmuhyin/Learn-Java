package learnJava.sorting_algorithms;

public class BubbleSort {
    public static void main(String[] args){
        int[] arr = {10,9,24,32,65,43};
        arr = bubbleSort(arr);
        for(int element:arr){
            System.out.print(element+" ");
        }
    }

    private static int[] bubbleSort(int[] arr) {
        int n= arr.length;
        boolean swapped = false;
//        COMPARE ADJACENT ELEMENTS AND SWAP IF THAT IS LARGER
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped = true;
                }
            }
            if(swapped == false){
                break;
            }
        }
        return arr;
    }
}
