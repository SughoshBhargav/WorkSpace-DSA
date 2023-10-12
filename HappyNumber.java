import java.util.ArrayList;

public class HappyNumber {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(findResult(n));
    }

    private static boolean findResult(int n) {
        

        ArrayList<Integer> list = new ArrayList<>();
        
        int sum = 0;
        int rem = 0;
        

        while(true){

            sum = 0;

            while(n>0){
                rem = n%10;
                sum += rem*rem;
                n = n/10;
            }

            if(sum==1){
                return true;
            }
            else{
                if(list.contains(sum)){
                    return false;
                }
                else{
                    list.add(sum);
                    n = sum;
                }
            }
        }
    
    }
}
