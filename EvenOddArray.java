import java.util.Arrays;

public class EvenOddArray {
    public static void main(String[] args) {
        int arr[] = {1,2,6,8,5,4,3,6,9};
        sort(arr);

        System.out.println(Arrays.toString(arr));
    }


    private static void sort(int[] arr) {

        int even = 0;
        int odd = 0;

        int everArray[] = new int[arr.length];

        int oddArray[] = new int[arr.length];

        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                everArray[even++] = arr[i];
            }
            else{
                oddArray[odd++] = arr[i];
            }

        }

        System.out.println(Arrays.toString(everArray));
        System.out.println(Arrays.toString(oddArray));
        System.out.println(even + " "+ odd);

        for(int i=0; i<even; i++){
            arr[i] = everArray[i];
        }
        System.out.println(Arrays.toString(arr));

        
        int k = 0;
        for(int i=even; i<oddArray.length; i++){
            arr[i] = oddArray[k++];
        }
    }
}
