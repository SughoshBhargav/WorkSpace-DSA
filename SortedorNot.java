public class SortedorNot {
    public static void main(String[] args) {
        int arr[] = {1,2,5,4,10,12,23};
        System.out.println(isSorted(arr,0));
        System.out.println(isFound(arr,121,0));
            
    }

    private static boolean isFound(int[] arr, int target,int i) {
        
        if(arr[i]==target){
            return true;
        }
        else if(i==arr.length-1){
            return false;
        }
        else{
            return isFound(arr,target,++i);
        }


    }

    private static boolean isSorted(int[] arr,int n) {
        

        if(n==arr.length-1){
            return true;
        }
        if(arr[n]<arr[n+1]&&isSorted(arr,n+1)){
            return true;
        }
        
        return false;
    
    }





}
