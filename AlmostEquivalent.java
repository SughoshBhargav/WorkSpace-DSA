
public class AlmostEquivalent {
    public static void main(String[] args) {
        String word1 = "zzzyyy";
        String word2 = "iiiiii";

        System.out.println(isTrue(word1,word2));
    }

    
        private static boolean isTrue(String word1, String word2) {
            
            int word1frequency[] = new int[26];
            int word2frequency[] = new int[26];

            for(int i=0; i<word1.length(); i++){
                word1frequency[word1.charAt(i)-97] += 1;
            }

            for(int i=0; i<word1.length(); i++){
                word2frequency[word2.charAt(i)-97] += 1;
            }

            for(int i=0; i<26; i++){
                if(word1frequency[i]<word2frequency[i]){
                    if(word2frequency[i]-word1frequency[i]>3){
                        return false;
                    } 
                }
                if(word1frequency[i]>word2frequency[i]){
                    if(word1frequency[i]-word2frequency[i]>3){
                        return false;
                    } 
                }
            }
            
            return true;
    }


        
}
