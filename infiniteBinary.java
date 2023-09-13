public class infiniteBinary {
    public static void main(String[] args) {

        int target = 6;
        int arr[] = {2,3,5,6,7,8,10,15,21,32};
        
        int res = findIndex(arr,target);




        System.out.println(res);
        
    }

    static int findIndex(int[] arr,int target){
        int start = 0;
        int end = 1;
        while(target>arr[end]){
            int temp = end + 1;
            end = (end - start + 1)*2;
            start = temp;
            
        }
        return searchItem(arr, target, start, end);
    }

    static int searchItem(int[] arr,int target,int start,int end){


        while(start<=end){
            int mid = (start+end)/2;
            if(target>arr[mid]){
                start = mid + 1;
            }
            else if(target<arr[mid]){
                end = mid - 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
