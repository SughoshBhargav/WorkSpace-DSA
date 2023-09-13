import java.util.*;
public class CoronaComputer {
    public static void main(String[] args) {
        

        int n,spikes;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        spikes = sc.nextInt();
        int resarray[] = new int[n];

        for(int i=0; i<n; i++){
            String num = Integer.toBinaryString(arr[i]);
            int result;
            try{
                String res = num.substring(0,num.length()-spikes);
                result = Integer.parseInt(res, 2);
            }
            catch(Exception e){
                result = 0;
            }
            resarray[i] = result;

             System.out.println(num);
        }
    for(int i=0; i<n; i++){
        //System.out.print(resarray[i]+"");
    }
    }  
    
}
