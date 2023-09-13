import java.util.*;;

public class Armstrong {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(isArmStrong(num));

        
    }

    public static boolean isArmStrong(int num) {

        int ori_num = num;
        int remainder = 0;
        int sum = 0;
        while(num > 0){
            remainder = num % 10;
            sum += remainder * remainder * remainder;
            num = num /10;
        }
        return ori_num==sum;
    
    }
}
