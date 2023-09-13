import java.util.*;

public class candies {


    public static void main(String[] args) {

        int arr[] = {2,3,5,1,3};
        int extra = 3;
        List<Boolean> list = kidsWithCandies(arr,extra);
        System.out.println((list));
    }
    

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        ArrayList<Boolean> list = new ArrayList<>();
        for(int i=0; i<candies.length; i++){
            boolean isMax = true;

            int temp = candies[i] + extraCandies;
            for(int j=0; j<candies.length; j++){
                if(candies[j]>temp){
                    isMax = false;
                }
            }
            if(isMax){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        return list;
    }
}
