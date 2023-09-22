import java.lang.reflect.Array;
import java.util.Arrays;

public class RelativeSortArray {
    public static void main(String[] args) {
        
        int arr1[] = {28,6,22,8,44,17};
        int arr2[] = {22,28,8,6};
        getRelative(arr1,arr2);

    }

    private static void getRelative(int[] arr1,int[] arr2) {
        
        int newArr[] = new int[arr1.length];
        int index = 0;

        for(int i=0; i<arr2.length; i++){
            for(int j=0; j<arr1.length; j++){
                if(arr2[i]==arr1[j]){
                    newArr[index++] = arr2[i];
                }
            }
        }

        index = 0;
        int remaindeArr[] = new int[arr1.length];
        boolean isFound = false;
        

        Arrays.sort(arr1);

        int copyArr[] = newArr.clone();

        Arrays.sort(copyArr);
        
        for(int i=0; i<copyArr.length; i++){
            for(int j=0; j<arr1.length; j++){
                if(arr1[i]!=newArr[j]){
                    break;
                }
            }
            
        }
        
        System.out.println(Arrays.toString(newArr));
        System.out.println(Arrays.toString(remaindeArr));
        
    
    }
}
