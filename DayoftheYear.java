public class DayoftheYear {
    public static void main(String[] args) {
    

        String day = "2019-02-10";
        findDays(day);

    }

    private static void findDays(String date) {
    
        
        String data[] = date.split("-");
        int days = Integer.parseInt(data[2]);
        int month = Integer.parseInt(data[1]);

        while(month-->1){
            if(month==2){
                days+=28;
            }
            else if(month<8&&month%2==1){
                days += 31;
            }
            else if(month<8&&month%2==0){
                days += 30;
            }
            else if(month>7&&month%2==0){
                days += 30;
            }
            else{
                days += 31;
            }
        }



        

        System.out.println(days);
        
    }

    
}
