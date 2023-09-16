public class IndividualCharCount {
    public static void main(String[] args) {
        String str = "aabbbbeeeeffggg";
        int count = 1;
        String finalStr = "";

        for(int i=1; i<str.length(); i++){
            if(str.charAt(i)==str.charAt(i-1)){
                count++;
                if(i==str.length()-1){
                    finalStr += str.charAt(i-1);
                    finalStr += count;
                    count = 1;
                }
                else{
                    continue;
                }

            }
            else{
                finalStr += str.charAt(i-1);
                finalStr += count;
                count = 1;
            }
        }
        System.out.println(finalStr);
    }
}
