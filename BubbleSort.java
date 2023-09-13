import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
    
        int arr[] = {2,5,8,1,4,9,10};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr) {

        boolean isSwap = false;
        for(int i=0; i<arr.length-1; i++){
            for(int j=1; j<arr.length-i; j++){
                if(arr[j]<arr[j-1]){
                    isSwap =true;
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
            if(!isSwap){
                break;
            }
        }
    }


}
