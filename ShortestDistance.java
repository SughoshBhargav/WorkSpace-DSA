import java.lang.Math;


public class ShortestDistance {
    public static void main(String[] args) {
        String str = "loveleetcode";
        char c = 'c';
        findResult(str,c);
    }

    private static void findResult(String str, char c) {

        int arr[] = new int[str.length()];
        int start = 0;
        int end = 0;
        int index = 0;
        while(end<=str.length()-1){
            if(str.charAt(start)!=c){
                end++;
            }
            System.out.println(str.charAt(end));
            if(str.charAt(end)==c){
                arr[index++] = Math.abs(end - start);
                start++;
            }
        }

        System.out.println(arr.toString());

    }
}
