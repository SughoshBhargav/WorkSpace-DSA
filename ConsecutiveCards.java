public class ConsecutiveCards {
    public static void main(String[] args) {
    
        int cards[] = {};
        System.out.println(findAns(cards));
    }

    private static int findAns(int[] cards) {
        
        int ans = Integer.MAX_VALUE;
        int temp = Integer.MAX_VALUE;
        boolean valueFound = false;
        for(int i=0; i<cards.length; i++){
            for(int j=i+1; j<cards.length; j++){
                if(cards[i]==cards[j]){
                    valueFound = true;
                    temp = j - i + 1;       
                }
                if(temp<ans){
                    ans = temp;
                }
            }
        }
        if(valueFound){
            return ans;
        }
        else{
            return -1;
        }
    }



}
