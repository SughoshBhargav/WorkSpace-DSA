import java.util.Arrays;

import javax.swing.text.AbstractDocument.LeafElement;

public class QuickSort {
    public static void main(String[] args) {
        int arr[] = {5,6,9,1,2,3,6};
        int start = 0;
        int end = arr.length -1;

        quickSort(arr,start,end);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr,int low,int high) {
  

        int start = low;
        int end = high;
        int pivot = (start + end) / 2;

        if(low>=high){
            return;
        }

        while(start<=end){
            while(arr[start]<arr[pivot]){
                start++;
            }
            while(arr[end]>arr[pivot]){
                end--;
            }
            if(start<=end){
                swap(arr,start,end);
                start++;
                end--;
            }
        }

       

        quickSort(arr,low,end);
        quickSort(arr, start, high);
    
    }

    private static void swap(int[] arr, int start, int end) {


        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
