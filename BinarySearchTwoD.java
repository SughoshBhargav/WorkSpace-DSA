import java.util.*;
public class BinarySearchTwoD {
    public static void main(String[] args) {
        
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int target = 2;

        int res[] = findElement(arr,target);
        System.out.println(Arrays.toString(res));

    }

    private static int[] findElement(int[][] arr, int target) {

        int start = 0;
        int end = arr[start].length-1;
        int ans[] = {-1,-1};

        while(start<=arr.length&&end>=0){
            System.out.println(start);
            System.out.println(end);
            if(arr[start][end]==target){
                ans[0] = start;
                ans[1] = end;
                break;
            }
            else if(arr[start][end]>target){
               end = end - 1;
            }
            else{
                 start = start + 1;
            }
            
        }
        return ans;
    }
}
