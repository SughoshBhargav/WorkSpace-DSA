import java.util.ArrayList;
import java.util.Collections;

public class Restaurant{
    public static void main(String[] args) {
        
        int restaurants[][] = {{1,4,1,40,10},{2,8,0,50,5},{3,8,1,30,4},{4,10,0,10,3},{5,1,1,15,1}};
        
        int maxPrice = 50;
        int maxDistance = 50;
        int veganFriendly = 0;

        findBestRestaurant(restaurants,maxPrice,veganFriendly,maxDistance);


    }

    private static void findBestRestaurant(int[][] restaurants, int maxPrice, int veganFriendly, int maxDistance) {


        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> newList = new ArrayList<>();        
 
        for(int i=0; i<restaurants.length; i++){

            if(veganFriendly==1){    
                if(restaurants[i][2]==veganFriendly&&restaurants[i][3]<=maxPrice&&restaurants[i][4]<=maxDistance){
                    list.add(restaurants[i][1]);
                }
            }
            else{
                if(restaurants[i][3]<=maxPrice&&restaurants[i][4]<=maxDistance){
                   list.add(restaurants[i][1]);
                }
            }
            
        }
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list.toString());
        int k = 0;

        for(int i=0; i<restaurants.length&&newList.size()!=list.size(); i++){
            
            if(veganFriendly==1){
                if(restaurants[i][1]==list.get(k)&&restaurants[i][2]==veganFriendly&&restaurants[i][3]<=maxPrice&&restaurants[i][4]<=maxDistance){
                   newList.add(restaurants[i][0]);
                    k++;
                }
            }
            else{
                if(restaurants[i][1]==list.get(k)&&restaurants[i][3]<=maxPrice&&restaurants[i][4]<=maxDistance){
                   newList.add(restaurants[i][0]);
                    k++;
                }
            }
            
            
            
            if(i==restaurants.length-1)
                i=-1;
        }
        System.out.println(newList.toString());

    }

    
}
