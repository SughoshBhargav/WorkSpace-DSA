import java.util.Arrays;

public class FindPrefixPosition {
    public static void main(String[] args) {
        String sentence = "abcad";
        String searchWord = "ad";

        System.out.println(findThePosition(sentence,searchWord));
    }

    private static int findThePosition(String sentence, String searchWord) {
    

        String words[] = sentence.split(" ");
        int index = 0;
        boolean isFound = false;
        boolean firstLetterFound = false;
        for(int i=0; i<words.length; i++){
            index = 0;
            for(int j=0; j<words[i].length(); j++){
                
                if(j==0&&words[i].charAt(0)==searchWord.charAt(index)){
                    firstLetterFound = true;
                }
                
                
                if(firstLetterFound&&words[i].charAt(j)==searchWord.charAt(index)){  
                    if(index == searchWord.length()-1){
                        return ++i;
                    }
                    index++;
                }
                else{
                    isFound = false;
                }
            }
            if(isFound){
                return i++;
            }
            
            //System.out.println(words[1].length());
        }
        
        return -1;
    }
}
