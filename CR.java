import java.util.Scanner;

public class CR {
    public static void main(String[] args) {
        int n,count=0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            if(i>0){
                if(arr[i]<arr[i-1]){
                    count++;
                }
            }
        }
        System.out.println(count);

    }
    
}
