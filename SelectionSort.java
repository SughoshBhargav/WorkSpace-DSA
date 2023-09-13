import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {
    
        int arr[] = {5,4,7,8,9,6,3,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {
    
        for(int i=0; i<arr.length; i++){
            int lastIndex = arr.length-i-1;

            int maxIndex = findMaxIndex(arr,0,lastIndex);
            swap(arr,maxIndex,lastIndex);

        }
    }

    private static int findMaxIndex(int[] arr, int start, int end) {
        
            int max = start;
            for(int i=start; i<=end; i++){
                if(arr[max]<arr[i]){
                    max = i;
                }
            }
            return max;
    }

    static void swap(int arr[],int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


}
