public class RemoveElement {
    public static void main(String[] args) {

        int nums[] = new int[]{0,1,2,2,3,0,4,2};
        int val = 2;

        int res = removeElement(nums, val);
        System.out.println(res);
    }

    static int removeElement(int[] nums, int val) {
        int k = 0; // This will be used to track the position of the next non-val element.

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}