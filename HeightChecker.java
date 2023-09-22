import java.util.Arrays;

public class HeightChecker {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println(getAns(arr));
    }

    private static int getAns(int[] arr) {
        
        int  count = 0;
        int newArr[] = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            newArr[i] = arr[i];
        }
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    swap(arr,i,j);
                }
            }
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i]!=newArr[i]){
                count++;
            }
        }

        return count;
        
    }

    private static void swap(int[] arr, int i, int j) {
        
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        
    }
}
