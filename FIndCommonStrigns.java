import java.util.Arrays;

public class FIndCommonStrigns{
    public static void main(String[] args) {
        
        String str[] = new String[]{"xyz","foo","of"};
        findRes(str);

    }

    private static void findRes(String[] str) {
        


        int arr[] = new int[26];
        
        
        for(int i=0; i<str.length; i++){
            for(int j=0; j<str[i].length(); j++){
                arr[str[i].charAt(j)-97] =  1;
            }
        }
            

        System.out.println(Arrays.toString(arr));
        
        }
    
    
    
}
