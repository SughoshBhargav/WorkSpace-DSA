public class BinarySearchTwoDSorted {
    public static void main(String[] args) {
    
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int target = 3;

        int res[] = findIndex(arr,target);
        
    }


    static int[] BinarySearch(int[][] arr,int row,int cStart,int cEnd,int target){

        while(cStart<=cEnd){
            int mid = (cStart+cEnd)/2;
            if(arr[row][mid]==target){
                return new int[]{row,mid};
            }
            if(arr[row][mid]<target){
                cStart = mid + 1;
            }
            else{
                cEnd = mid - 1;
            }
        }
        return new int[]{-1,-1};

    }

    private static int[] findIndex(int[][] arr, int target) {

        int rows = arr.length;
        int cols = arr[0].length;

        if(rows == 1){
            return BinarySearch(arr, 0, 0, cols-1, target)
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols/2;

        while(rStart<(rEnd-1)){
            int mid = (rStart+rEnd)/2;
            if(arr[mid][cMid]==target){
                return new int[]{mid,cMid};
            }
            if(arr[mid][cMid]<target){
                rStart = mid;
            }
            else{
                rEnd = mid;
            }
        }

        if(arr[rStart][cMid]==target){
            return new int[]{rStart,cMid};
        }
        if(arr[rStart+1][cMid]==target){
            return new int[]{rStart+1,cMid};
        }

        

        return new int[]{-1,-1};
    }


}
