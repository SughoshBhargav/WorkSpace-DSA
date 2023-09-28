public class SubArraySum {
    public static void main(String[] args) {
        int arr[] = {-7 ,-8 ,-16, -4, -8, -5, -7, -11, -10, -12, -4, -6, -4, -16, -10 };
        System.out.println(findMax(arr));
    }

    
    private static int findMax(int[] arr) {
        
        int max = 0;
		int sum = 0;

		for(int i=0; i<arr.length; i++){
            sum = 0;
			for(int j=i; j<arr.length; j++){
				sum += arr[j];
				if(sum > max){
					max = sum;
				}
			}
		}
		return max;
    
    }
}
