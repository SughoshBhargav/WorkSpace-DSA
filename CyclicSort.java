class CyclicSort {
    public int missingNumber(int[] nums) {
        
        int i = 0;
        while(i<nums.length){
            int correct = nums[i];
            if(nums[i]<nums.length&&nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }

        for(i=0; i<nums.length; i++){
            if(nums[i]!=i)
                return i;
        }
        return nums.length ;
    }
    
    public void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}