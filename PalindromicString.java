public class PalindromicString{
    public static void main(String[] args) {
        String words[] = {"acba","cadr","adda","racecar","cool"};
        String ans = findPalindrome(words);
        System.out.println(ans);
    }

    private static String findPalindrome(String[] words) {
        
       
        for(int i=0; i<words.length; i++){
            int start = 0;
            int end = words[i].length()-1;
            for(int j=0; j<words[i].length(); j++){
                if(words[i].charAt(start)==words[i].charAt(end)){
                    start++;
                    end--;
                    if(start>end){
                        return words[i];
                    }
                }
            }
        }
        return null;
        // char cha = words.charAt(0);
        // System.out.println(words.charAt(1));

    }
}