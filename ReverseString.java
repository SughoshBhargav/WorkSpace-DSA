import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String str = "abcda";
        reverse(str);
    }

    private static void reverse(String str) {


        int frequency[] = new int[str.length()];

        for(int i=0; i<str.length(); i++){
            frequency[str.charAt(i)-'a']++;
        }
        System.out.println(Arrays.toString(frequency));
        String newStr = "";
        int end = str.length()-1;
        for(int i=end; i>=0; i--){
            newStr += str.charAt(i);
        }
        System.out.println(newStr);
    }
}
