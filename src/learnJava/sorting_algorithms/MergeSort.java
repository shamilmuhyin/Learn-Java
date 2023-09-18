package learnJava.sorting_algorithms;

public class MergeSort {
    public static void main(String[] args){
        int[] arr = {10,9,24,32,65,43};
        arr = mergeSort(arr,0,arr.length-1);
        for(int element:arr){
            System.out.print(element+" ");
        }
    }

    private static int[] mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            // Find the middle point of the array
            int middle = left + (right - left) / 2;

            // Recursively sort the left and right halves
            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);

            // Merge the sorted halves
            merge(arr, left, middle, right);
        }
        return arr;
    }

    private static void merge(int[] arr, int left, int middle, int right) {
        // Find sizes of two sub-arrays to be merged
        int n1 = middle - left + 1;
        int n2 = right - middle;

        // Create temporary arrays
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy data to temporary arrays leftArray[] and rightArray[]
        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];
        }
        for (int i = 0; i < n2; i++) {
            rightArray[i] = arr[middle + 1 + i];
        }

        // Merge the temporary arrays
        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArray[] and rightArray[], if any
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
