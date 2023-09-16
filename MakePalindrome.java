public class MakePalindrome {
    public static void main(String[] args) {
        String str = "abede";
        String res = makepal(str);
        System.out.println(res);
    }

    private static String makepal(String str) {
        
        int s = 0;
        int e = str.length() - 1;
        String res = "";
        while(e>0){
            if(str.charAt(s)!=str.charAt(e)){
                res += str.charAt(e);
            }
            s++;
            e--;
        }
        
        
        
        
        return res;
    }
}
