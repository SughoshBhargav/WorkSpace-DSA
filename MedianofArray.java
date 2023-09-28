import java.util.Arrays;

public class MedianofArray {
    public static void main(String[] args) {
        int nums1[] = {1,2};
        int nums2[] = {3,4};

        findMedian(nums1,nums2);
    }

    private static void findMedian(int[] nums1, int[] nums2) {
        
        int finalArr[] = new int[nums1.length+nums2.length];
        int index = 0;
        int i = 0;
        int j = 0;

        while(i<nums1.length&&j<nums2.length){
            
            if(nums1[i]<nums2[j]){
                finalArr[index++] = nums1[i++];
            }
            else{
                finalArr[index++] = nums2[j++];
            }
        }

        while(i<nums1.length){
                finalArr[index++] = nums1[i++];
        }

        while(j<nums2.length){
                finalArr[index++] = nums2[j++];
        }

        int mid  = 0;
        int index2 = 0;
        boolean isOdd = false;
        if(finalArr.length%2!=0){
            mid = finalArr.length /2;
            isOdd = true;
            
        }
        else{
            mid = finalArr.length /2 ;
            index2 = mid + 1;
        }

        if(isOdd){
                System.out.println(finalArr[mid]);
        }
        else{
                System.out.println((float)(finalArr[mid]+finalArr[index2])/2);

        }

        

        System.out.println(Arrays.toString(finalArr));
    
    }
}
