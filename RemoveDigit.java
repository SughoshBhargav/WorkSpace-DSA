public class RemoveDigit {
    public static void main(String[] args) {
        String str = "1231";
        char digit = '1';

        findAns(str,digit);
    }

    private static void findAns(String str, char digit) {


        int tempLargest = 0;
        String temp = "";
        int largest = 0;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==digit){
                temp = str.substring(0,i)+str.substring(i+1,str.length());
                tempLargest = Integer.parseInt(temp);
                if(tempLargest>largest){
                    largest = tempLargest;
                }
            }
        }
        System.out.println(largest);
    }
}
