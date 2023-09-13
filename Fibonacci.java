public class Fibonacci {
    public static void main(String[] args) {
        int n = 6; 
        int arr[] = {1,2,5,6,9,8,7};
        //System.out.println(findFib(n));
        System.out.println(BinarySearch(arr,n,0,arr.length));
    }

    private static int BinarySearch(int arr[],int target,int start,int end) {

        int mid = (start + end)/2;

        if(target>arr[mid]){
            return BinarySearch(arr,target,mid+1,end);
        }
        else if(target<arr[mid]){
            return BinarySearch(arr,target,start,mid-1);
        }
        else{
            return mid;
        }
    }

    public static int findFib(int n) {
        if(n==0||n==1){
            return n;
        }
        else{
            return findFib(n-1) + findFib(n-2);
        }
    }


    
}
