public class MinOperation {
    public static void main(String[] args) {
        
        String current = "02:30";
        String correct = "04:35";

        findAnd(current,correct);


    }

    private static void findAnd(String current, String correct) {
     
        int correctMin = Integer.parseInt(correct.substring(3, 5));
        int correctHour = Integer.parseInt(correct.substring(0, 2));    

        correctMin += correctHour * 60;  



        int currentMin = Integer.parseInt(current.substring(3, 5));
        int currentHour = Integer.parseInt(current.substring(0, 2));    

        currentMin += currentHour * 60;  

        int MinuteDif = currentMin - correctMin>0?currentMin - correctMin:correctMin - currentMin;

        int count = 0;


        while(MinuteDif!=0){
            if(MinuteDif>=60){
                count++;
                MinuteDif -=60;
            }
            
            else if(MinuteDif>=15){
                count++;
                MinuteDif -=15;
            }
            
            else if(MinuteDif>=5){
                count++;
                MinuteDif -=5;
            }

            else{
                count++;
                MinuteDif -=1;
            }


        }

        System.out.println(MinuteDif+" "+(count));
    
    }
}
