public class ceilingBubble {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int res = ceilineNumber(arr, 13);
        System.out.println(res);
    }

    static int ceilineNumber(int[] arr,int target){

        int start = 0;
        int end = arr.length-1;
        int num = 0;

        while(start<=end){
            int mid = (start + end)/2;
            if(arr[mid]<target){
                start = mid+1;
            }
            else{
                end = mid - 1;
            }
            if(arr[mid]==target){
                return arr[mid];
            }

        }
        return arr[end];
    }
}
