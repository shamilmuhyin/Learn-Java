package learnJava.sorting_algorithms;

public class QuickSort {
    public static void main(String[] args){
        int[] arr = {10,9,24,32,65,43};
        arr = quickSort(arr,0,arr.length-1);
        for(int element:arr){
            System.out.print(element+" ");
        }
    }

    private static int[] quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array into two sub-arrays
            int pivotIndex = partition(arr, low, high);

            // Recursively sort each subarray
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
        return arr;
    }

    private static int partition(int[] arr, int low, int high) {
        // Choose a pivot element (usually the last element)
        int pivot = arr[high];

        // Index of the smaller element
        int i = low - 1;

        for (int j = low; j < high; j++) {
            // If the current element is smaller than or equal to the pivot
            if (arr[j] <= pivot) {
                i++;

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i+1] and arr[high] (pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
