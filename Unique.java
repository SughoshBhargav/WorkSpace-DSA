import java.util.Arrays;

public class Unique {
    public static void main(String[] args) {
        int arr[] = {1,1,2,5,2,6,3,2,1,8};
        findUnique(arr);
    }

    private static void findUnique(int[] arr) {


        boolean isRepeated = false;

        int k=0;
        int newArray[] = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]==arr[i]){
                    isRepeated = true;
                    break;
                }
                else{
                    isRepeated = false;
                }
            }
            if(!isRepeated){
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}
