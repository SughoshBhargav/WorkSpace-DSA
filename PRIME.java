import java.util.Scanner;

public class PRIME {

    public static void main(String[] args) {
        

        boolean isprime = true;

        int num = 1;
        Scanner sc = new Scanner(System.in);
        try{
            num = sc.nextInt();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        for(int i=2; i<Math.sqrt(num); i++){
            if(num%2==0)
                isprime = false;
                break;
        }

        if(isprime){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not a Prime Number");
        }
    }
    
}
