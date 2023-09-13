public class BorrowNumber {
    public static void main(String[] args) {
        int num1 = 656;
        int num2 = 666;
        int count = 0;

        if(num1<num2){
            count = 0;
        }
        else{
            while(num1>0){
            int rem1 = num1 % 10;
            int rem2 = num2 % 10;
            if(rem1<rem2){
                count++;
                num1 = (num1 / 10) - 1;
            }
            else{
                num1 = num1 /10;
            }
            num2 = num2 / 10;
        }

        }
        
        System.out.println(count);
    }
}
