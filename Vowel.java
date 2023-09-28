public class Vowel {
    public static void main(String[] args) {
        
        String str[] = new String[]{"hey","aeo","mu","ooo","artro"};
        int left = 1;
        int right = 4;
        findCount(str,left,right);

    }

    private static void findCount(String[] str, int left, int right) {
        
        int count = 0;
        for(int i=left; i<=right; i++){
            if(isVowel(str[i].charAt(0))&&isVowel(str[i].charAt(str[i].length()-1))){
                count++;
            }
        }
        System.out.println(count);

    }

    private static boolean isVowel(char charAt) {

        if(charAt == 'a' || charAt == 'e' || charAt == 'o' || charAt == 'i' || charAt == 'u' ){
            return true;
        }
        return false;
    }
}
