import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {5,7,9,6,1,7,98,6};
        //System.out.println(Arrays.toString(sort(arr)));
        System.out.println(Arrays.toString(sort(arr,0,arr.length)));
    }

    private static int[] sort(int[] arr) {


        if(arr.length==1){
            return arr;
        }

        int mid = arr.length/2;

        int left[] = sort(Arrays.copyOfRange(arr, 0, mid));
        int right[] = sort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left,right);

        
    }


    private static int[] sort(int[] arr,int start,int end) {


        if(arr.length==1){
            return arr;
        }

        int mid = arr.length/2;

        int left[] = sort(Arrays.copyOfRange(arr, start, mid));
        int right[] = sort(Arrays.copyOfRange(arr, mid, end));

        return merge(left,right);

        
    }



    private static int[] merge(int[] left, int[] right) {
        
        
        int arrSorted[] = new int[left.length+right.length];

        int i=0,j=0,k=0;

        while(i<left.length&&j<right.length){
            if(left[i]<right[j]){
                arrSorted[k++] = left[i++];
            }
            else{
                arrSorted[k++] = right[j++];
            }
        }

        while(i<left.length){
            arrSorted[k++] = left[i++];
        }

        
        while(j<right.length){
            arrSorted[k++] = right[j++];
        }

        return arrSorted;
    }
}
