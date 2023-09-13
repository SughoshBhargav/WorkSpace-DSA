public class Wealth {
    
    public static void main(String[] args) {
        int arr[][] = {
            {1,5},
            {7,3},
            {3,5}
        };
        System.out.println(maximumWealth(arr));
    }

    
    static int maximumWealth(int[][] accounts) {
        int max = 0;
        int pre_max = 0;
        for(int i=0; i<accounts.length; i++){
            for(int j=0; j<accounts[i].length; j++){
                pre_max+=accounts[i][j];
            }
            if(pre_max>max){
                max = pre_max;
            }
            pre_max = 0;
        }
        return max;
    }
}
