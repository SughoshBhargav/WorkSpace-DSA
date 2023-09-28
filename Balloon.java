import java.util.Arrays;

public class Balloon {
    public static void main(String[] args) {
        String text = "balon";
        getInstances(text);
    }

    static int arr[] = new int[5];

    private static void getInstances(String text) {
        
        for(int i=0; i<text.length(); i++){
            if(text.charAt(i)=='b'){
                arr[0] += 1;
            }
            else if(text.charAt(i)=='a'){
                arr[1] += 1;
            }
            
            else if(text.charAt(i)=='l'){
                arr[2] += 1;
            }
            
            else if(text.charAt(i)=='o'){
                arr[3] += 1;
            }
            
            else if(text.charAt(i)=='n'){
                arr[4] += 1;
            }
        }

        // for(int i=0; i<arr.length; i++){

        // }
        arr[2] = arr[2] / 2;
        arr[3] = arr[3] / 2;
        int min = Arrays.stream(arr).min().getAsInt();

        System.out.println((min));
    
    }
}
